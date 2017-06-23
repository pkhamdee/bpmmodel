package com.aviva.ezflow.model.documentroute;

public class Property implements java.io.Serializable {
    private static final long serialVersionUID = -153424003374911035L;

    private java.lang.String name;
    private java.lang.String value;

    public Property() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
