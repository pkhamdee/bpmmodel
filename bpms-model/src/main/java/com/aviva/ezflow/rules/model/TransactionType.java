package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.Set;

public class TransactionType implements Serializable {

    private static final long serialVersionUID = -6314379719586488922L;

    private String transactionTypeCd;
    private String transcationTypeDesc;
    private Set<Action> transactionTypeActionTypes;

    public String getTransactionTypeCd() {
        return transactionTypeCd;
    }

    public void setTransactionTypeCd(String transactionTypeCd) {
        this.transactionTypeCd = transactionTypeCd;
    }

    public String getTranscationTypeDesc() {
        return transcationTypeDesc;
    }

    public void setTranscationTypeDesc(String transcationTypeDesc) {
        this.transcationTypeDesc = transcationTypeDesc;
    }

    public Set<Action> getTransactionTypeActionTypes() {
        return transactionTypeActionTypes;
    }

    public void setTransactionTypeActionTypes(Set<Action> transactionTypeActionTypes) {
        this.transactionTypeActionTypes = transactionTypeActionTypes;
    }
}
