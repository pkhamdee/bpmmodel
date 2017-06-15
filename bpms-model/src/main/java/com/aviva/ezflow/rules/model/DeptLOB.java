package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DeptLOB implements Serializable {

    private static final long serialVersionUID = 8854017045327968296L;

    private String deptCd;
    private String lob;
    private Set<DocType> listOfDocTypes;

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public Set<DocType> getListOfDocTypes() {
        return listOfDocTypes;
    }

    public void setListOfDocTypes(Set<DocType> listOfDocTypes) {
        this.listOfDocTypes = listOfDocTypes;
    }

    // Adds a DocType to listOfDocTypes
    public void addDocType(DocType docType) {
        if (null == listOfDocTypes) {
            listOfDocTypes = new HashSet<DocType>();
        }
        listOfDocTypes.add(docType);
    }

    // Adds a DocTypeKey to DocType, and then add the DocType to listOfDocTypes
    public void addDocTypeKey(DocType docType, DocTypeKey docTypeKey) {
        docType.addDocTypeKey(docTypeKey);
        addDocType(docType);
    }

    @Override
    public String toString() {
        return "DeptLOB{" +
                "deptCd='" + deptCd + '\'' +
                ", lob='" + lob + '\'' +
                ", listOfDocTypes=" + listOfDocTypes +
                '}';
    }
}
