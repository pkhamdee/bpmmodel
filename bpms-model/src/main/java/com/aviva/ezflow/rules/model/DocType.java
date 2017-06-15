package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DocType implements Serializable {

    private static final long serialVersionUID = 8502099560273656195L;

    private String lob;
    private String docTypeCd;
    private String docTypeDesc;
    private Set<DocTypeKey> listOfDocTypeKeys;

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

    public Set<DocTypeKey> getListOfDocTypeKeys() {
        return listOfDocTypeKeys;
    }

    public void setListOfDocTypeKeys(Set<DocTypeKey> listOfDocTypeKeys) {
        this.listOfDocTypeKeys = listOfDocTypeKeys;
    }

    public void addDocTypeKey(DocTypeKey docKey) {
        if (null == listOfDocTypeKeys) {
            listOfDocTypeKeys = new HashSet<DocTypeKey>();
        }
        listOfDocTypeKeys.add(docKey);
    }

    @Override
    public String toString() {
        return "DocType{" +
                "docTypeCd='" + docTypeCd + '\'' +
                ", docTypeDesc='" + docTypeDesc + '\'' +
                ", listOfDocTypeKeys='" + listOfDocTypeKeys + '\'' +
                '}';
    }
}
