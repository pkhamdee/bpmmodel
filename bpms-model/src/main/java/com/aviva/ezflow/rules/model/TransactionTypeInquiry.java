package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class TransactionTypeInquiry implements Serializable {

    private static final long serialVersionUID = 1981378892145715967L;

    private String countryCd;
    private String lob;
    private String deptCd;
    private String docTypeCd;

    private Set<TransactionType> listOfTransactionTypes;

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public String getDocTypeCd() {
        return docTypeCd;
    }

    public void setDocTypeCd(String docTypeCd) {
        this.docTypeCd = docTypeCd;
    }

    public Set<TransactionType> getListOfTransactionTypes() {
        return listOfTransactionTypes;
    }

    public void setListOfTransactionTypes(Set<TransactionType> listOfTransactionTypes) {
        this.listOfTransactionTypes = listOfTransactionTypes;
    }

    // adds a transactionType to listOfTransactionTypes
    public void addTransactionType(TransactionType transactionType) {
        if (null == listOfTransactionTypes) {
            listOfTransactionTypes = new HashSet<TransactionType>();
        }
        listOfTransactionTypes.add(transactionType);
    }

    // adds an action to transactionType, and then add transactionType to listOfTransactionTypes
    public void addTransactionTypeAction(TransactionType transactionType, Action action) {
        transactionType.addAction(action);
        addTransactionType(transactionType);
    }

    @Override
    public String toString() {
        return "TransactionTypeInquiry{" +
                "countryCd='" + countryCd + '\'' +
                ", lob='" + lob + '\'' +
                ", deptCd='" + deptCd + '\'' +
                ", docTypeCd='" + docTypeCd + '\'' +
                ", listOfTransactionTypes=" + listOfTransactionTypes +
                '}';
    }
}
