package com.aviva.ezflow.bpms.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kianhockting on 21/06/2017.
 */
public class BusinessProcess implements Serializable {
    private CommonHeader commonHeader;
    private String processInstanceId;
    private String workItemId;
    private ConcurrentDetails concurrentDetails;
    private Document document;
    private PolicyObject policyObject;
    private boolean isCorporate;
    private int priority = 0;

    public BusinessProcess() {
    }

    public BusinessProcess(CommonHeader commonHeader, String processInstanceId, String workItemId, ConcurrentDetails concurrentDetails, Document document, PolicyObject policyObject, boolean isCorporate, int priority) {

        this.commonHeader = commonHeader;
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.concurrentDetails = concurrentDetails;
        this.document = document;
        this.policyObject = policyObject;
        this.isCorporate = isCorporate;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "BusinessProcess{" +
                "commonHeader=" + commonHeader +
                ", processInstanceId='" + processInstanceId + '\'' +
                ", workItemId='" + workItemId + '\'' +
                ", concurrentDetails=" + concurrentDetails +
                ", document=" + document +
                ", policyObject=" + policyObject +
                ", isCorporate=" + isCorporate +
                ", priority=" + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessProcess)) return false;

        BusinessProcess that = (BusinessProcess) o;

        if (isCorporate() != that.isCorporate()) return false;
        if (getPriority() != that.getPriority()) return false;
        if (getCommonHeader() != null ? !getCommonHeader().equals(that.getCommonHeader()) : that.getCommonHeader() != null)
            return false;
        if (getProcessInstanceId() != null ? !getProcessInstanceId().equals(that.getProcessInstanceId()) : that.getProcessInstanceId() != null)
            return false;
        if (getWorkItemId() != null ? !getWorkItemId().equals(that.getWorkItemId()) : that.getWorkItemId() != null)
            return false;
        if (getConcurrentDetails() != null ? !getConcurrentDetails().equals(that.getConcurrentDetails()) : that.getConcurrentDetails() != null)
            return false;
        if (getDocument() != null ? !getDocument().equals(that.getDocument()) : that.getDocument() != null)
            return false;
        return getPolicyObject() != null ? getPolicyObject().equals(that.getPolicyObject()) : that.getPolicyObject() == null;
    }

    @Override
    public int hashCode() {
        int result = getCommonHeader() != null ? getCommonHeader().hashCode() : 0;
        result = 31 * result + (getProcessInstanceId() != null ? getProcessInstanceId().hashCode() : 0);
        result = 31 * result + (getWorkItemId() != null ? getWorkItemId().hashCode() : 0);
        result = 31 * result + (getConcurrentDetails() != null ? getConcurrentDetails().hashCode() : 0);
        result = 31 * result + (getDocument() != null ? getDocument().hashCode() : 0);
        result = 31 * result + (getPolicyObject() != null ? getPolicyObject().hashCode() : 0);
        result = 31 * result + (isCorporate() ? 1 : 0);
        result = 31 * result + getPriority();
        return result;
    }

    public CommonHeader getCommonHeader() {

        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getWorkItemId() {
        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public ConcurrentDetails getConcurrentDetails() {
        return concurrentDetails;
    }

    public void setConcurrentDetails(ConcurrentDetails concurrentDetails) {
        this.concurrentDetails = concurrentDetails;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public PolicyObject getPolicyObject() {
        return policyObject;
    }

    public void setPolicyObject(PolicyObject policyObject) {
        this.policyObject = policyObject;
    }

    public boolean isCorporate() {
        return isCorporate;
    }

    public void setCorporate(boolean corporate) {
        isCorporate = corporate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
