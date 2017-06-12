package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.Set;

public class DocTypeInquiryRequest implements Serializable {
    private static final long serialVersionUID = -5740423518005756665L;

    private String countryCd;
    private Set<DeptLOB> listOfDeptLOB;

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public Set<DeptLOB> getListOfDeptLOB() {
        return listOfDeptLOB;
    }

    public void setListOfDeptLOB(Set<DeptLOB> listOfDeptLOB) {
        this.listOfDeptLOB = listOfDeptLOB;
    }
}
