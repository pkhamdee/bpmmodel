package com.aviva.ezflow.model.documentroute;

public class CheckList implements java.io.Serializable {
    private static final long serialVersionUID = 921024484190793190L;

    private java.lang.String name;
    private java.lang.String value;

    public CheckList() {
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
