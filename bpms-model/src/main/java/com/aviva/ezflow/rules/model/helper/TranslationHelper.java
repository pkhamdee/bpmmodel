package com.aviva.ezflow.rules.model.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TranslationHelper {

    private static Logger LOG = LoggerFactory.getLogger(TranslationHelper.class);

    private static final int DEFAULT_HOURS_TO_EXPIRE = 8;
    private static final String DEFAULT_TRANSLATION_MAPS_DIR = "translations";
    private static final String TRANSLATION_CACHE_EXPIRY_HOURS_KEY = "ezflow.translation.expiry.hours";
    private static final String TRANSLATION_MAPS_PROPERTY_KEY = "ezflow.translation.dir";

    private static final String TRANSLATION_MAPS_SUFFIX = ".properties";

    private static TranslationHelper INSTANCE = new TranslationHelper();
    private Map<String, TranslationCache> cache = new HashMap<String, TranslationCache>();

    public static TranslationHelper getInstance() {
        return INSTANCE;
    }

    public String translate(String locale, String mapping, String code, String defaultValue) {
        String key = makeKey(mapping, locale);
        TranslationCache c = cache.get(key);
        if (null == c) {
            c = initializeCache(key);
            cache.put(key, c);
        }
        return c == null ? defaultValue : c.get(code, defaultValue);
    }

    private TranslationCache initializeCache(String key) {
        String path = System.getenv(TRANSLATION_MAPS_PROPERTY_KEY);
        if (null == path) {
            path = DEFAULT_TRANSLATION_MAPS_DIR;
        }
        if (!path.endsWith(File.separator)) {
            path = path + File.separator;
        }
        path = path + key + TRANSLATION_MAPS_SUFFIX;

        int hoursToExpire = DEFAULT_HOURS_TO_EXPIRE;
        try {
            hoursToExpire = Integer.parseInt(System.getenv(TRANSLATION_CACHE_EXPIRY_HOURS_KEY));
        } catch (NumberFormatException nfe) {
            LOG.warn("Invalid or no translation mapping expiry found, using default: {}", hoursToExpire);
        }
        return new TranslationCache(path, hoursToExpire);
    }

    private String makeKey(String mapping, String locale) {
        return mapping + "." + locale;
    }

    /**
     * Translation cache (with expiration). Mappings are loaded from properties file.
     */
    static class TranslationCache {

        private final String sourceFile;
        private final int hoursToExpire;

        private Map<String, String> txCache = null;
        private Calendar expiry;

        /**
         * Creates a {@code TranslationCache}
         *
         * @param sourceFile    absolute path to load mappings from
         * @param hoursToExpire number of hours the cache is valid
         */
        TranslationCache(String sourceFile, int hoursToExpire) {
            this.sourceFile = sourceFile;
            this.hoursToExpire = hoursToExpire;
            loadCache();
        }

        /*
         * loads the cache from properties file and sets the expiration time.
         */
        private void loadCache() {
            if (null == sourceFile || hoursToExpire <= 0) {
                throw new IllegalArgumentException("Invalid translation cache initial values");
            }
            Calendar c = Calendar.getInstance();
            c.add(Calendar.HOUR, hoursToExpire);
            expiry = c;

            Properties props = new Properties();
            File file = new File(sourceFile);
            FileReader reader = null;
            try {
                LOG.info("loading translation mapping from : {}, expires {}.", file.getAbsoluteFile(), expiry.getTime());
                reader = new FileReader(file);
                props.load(reader);
                txCache = new HashMap<String, String>((Map) props);
            } catch (FileNotFoundException e) {
                LOG.error("No translation mapping found at: {}", file.getAbsoluteFile());
            } catch (IOException e) {
                LOG.error("Error loading translation mapping", e);
            } finally {
                if (null != reader)
                    try {
                        reader.close();
                    } catch (IOException e) {
                        LOG.warn("Error when closing reader", e);
                    }
            }
        }

        /**
         * Gets the (translation) mapping for the given code.
         *
         * @param code         the code to lookup
         * @param defaultValue default value if mapped value is not found
         * @return the mapped value if a match is found, or {@code defaultValue} otherwise
         */
        public String get(String code, String defaultValue) {
            if (Calendar.getInstance().after(expiry)) {
                loadCache();
            }
            if (null == txCache) return defaultValue;

            String value = txCache.get(code);
            return value == null ? defaultValue : value;
        }
    }
}
