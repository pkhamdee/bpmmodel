package com.aviva.ezflow.model.documentroute;

public class DocumentRoute implements java.io.Serializable {
    private static final long serialVersionUID = 4429292767989950266L;

    private java.lang.String docTypeCd;
    private java.lang.String transactionTypeCd;
    private com.aviva.ezflow.model.documentroute.DocCheckList docCheckList;
    private com.aviva.ezflow.model.documentroute.RouteInfo routeInfo;

    public DocumentRoute() {
    }

    public String getDocTypeCd() {
        return docTypeCd;
    }

    public void setDocTypeCd(String docTypeCd) {
        this.docTypeCd = docTypeCd;
    }

    public String getTransactionTypeCd() {
        return transactionTypeCd;
    }

    public void setTransactionTypeCd(String transactionTypeCd) {
        this.transactionTypeCd = transactionTypeCd;
    }

    public DocCheckList getDocCheckList() {
        return docCheckList;
    }

    public void setDocCheckList(DocCheckList docCheckList) {
        this.docCheckList = docCheckList;
    }

    public com.aviva.ezflow.model.documentroute.RouteInfo getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(com.aviva.ezflow.model.documentroute.RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }
}
