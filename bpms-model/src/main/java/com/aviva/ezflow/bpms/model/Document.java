package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 23/06/2017.
 */
public class Document {
    private String deptCd;
    private String lob;
    private String documentType;
    private String transactionType;

    public Document(String deptCd, String lob, String documentType, String transactionType) {

        this.deptCd = deptCd;
        this.lob = lob;
        this.documentType = documentType;
        this.transactionType = transactionType;
    }

    public Document(String documentType, String transactionType) {
        this.documentType = documentType;
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        return "Document{" +
                "deptCd='" + deptCd + '\'' +
                ", lob='" + lob + '\'' +
                ", documentType='" + documentType + '\'' +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Document)) return false;

        Document document = (Document) o;

        if (getDeptCd() != null ? !getDeptCd().equals(document.getDeptCd()) : document.getDeptCd() != null)
            return false;
        if (getLob() != null ? !getLob().equals(document.getLob()) : document.getLob() != null) return false;
        if (getDocumentType() != null ? !getDocumentType().equals(document.getDocumentType()) : document.getDocumentType() != null)
            return false;
        return getTransactionType() != null ? getTransactionType().equals(document.getTransactionType()) : document.getTransactionType() == null;
    }

    @Override
    public int hashCode() {
        int result = getDeptCd() != null ? getDeptCd().hashCode() : 0;
        result = 31 * result + (getLob() != null ? getLob().hashCode() : 0);
        result = 31 * result + (getDocumentType() != null ? getDocumentType().hashCode() : 0);
        result = 31 * result + (getTransactionType() != null ? getTransactionType().hashCode() : 0);
        return result;
    }

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

}
