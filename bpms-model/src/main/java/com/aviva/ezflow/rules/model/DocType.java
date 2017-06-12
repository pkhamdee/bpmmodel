package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.Set;

public class DocType implements Serializable {

    private static final long serialVersionUID = 8502099560273656195L;

    private String docTypeCd;
    private String docTypeDesc;
    private String docTypeKey;
    private Set<Action> docTypeActionTypes;

    public String getDocTypeCd() {
        return docTypeCd;
    }

    public void setDocTypeCd(String docTypeCd) {
        this.docTypeCd = docTypeCd;
    }

    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    public String getDocTypeKey() {
        return docTypeKey;
    }

    public void setDocTypeKey(String docTypeKey) {
        this.docTypeKey = docTypeKey;
    }

    public Set<Action> getDocTypeActionTypes() {
        return docTypeActionTypes;
    }

    public void setDocTypeActionTypes(Set<Action> docTypeActionTypes) {
        this.docTypeActionTypes = docTypeActionTypes;
    }
}
