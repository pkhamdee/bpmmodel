package com.aviva.ezflow.model;

import com.aviva.ezflow.model.helper.TranslationHelper;

import java.io.Serializable;

public class ChecklistItem implements Serializable {
    private static final long serialVersionUID = -5081990188674716423L;

    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void translate(Checklist checklist) {
        String locale = checklist.getLocale();
        if (null != locale && locale.length() > 0) {
            TranslationHelper helper = TranslationHelper.getInstance();
            setDescription(helper.translate(locale, "ChecklistDesc", getCode(), getDescription()));
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChecklistItem that = (ChecklistItem) o;

        return code != null ? code.equals(that.code) : that.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }

}
