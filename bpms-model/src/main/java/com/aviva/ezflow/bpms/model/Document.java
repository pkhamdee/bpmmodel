package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 23/06/2017.
 */
public class Document {
    private String documentType;
    private String transactionType;

    public Document(String documentType, String transactionType) {
        this.documentType = documentType;
        this.transactionType = transactionType;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (getDocumentType() != null ? !getDocumentType().equals(document.getDocumentType()) : document.getDocumentType() != null)
            return false;
        return getTransactionType() != null ? getTransactionType().equals(document.getTransactionType()) : document.getTransactionType() == null;
    }

    @Override
    public int hashCode() {
        int result = getDocumentType() != null ? getDocumentType().hashCode() : 0;
        result = 31 * result + (getTransactionType() != null ? getTransactionType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentType='" + documentType + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
