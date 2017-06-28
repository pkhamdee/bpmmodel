package com.aviva.ezflow.bpms.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kianhockting on 21/06/2017.
 */
public class BusinessProcess implements Serializable {

    private String processInstanceId;
    private String workItemId;
    private ConcurrentDetails concurrentObjectModel;
    private Document document;
    private PolicyObject policyObject;

    private boolean isCorporate;
    private int priority = 0;
    private ArrayList<BusinessTask> businessTasks = new ArrayList<BusinessTask>();

    public BusinessProcess(String processInstanceId, String policyNo, String workItemId, ConcurrentDetails concurrentObjectModel, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.concurrentObjectModel = concurrentObjectModel;
        this.priority = priority;
        this.businessTasks = businessTasks;
    }

    public BusinessProcess(String processInstanceId, String policyNo, String workItemId, ConcurrentDetails concurrentObjectModel, boolean isCorporate, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.concurrentObjectModel = concurrentObjectModel;
        this.isCorporate = isCorporate;
        this.priority = priority;
        this.businessTasks = businessTasks;
    }

    public BusinessProcess(String processInstanceId, String workItemId, String policyNo, String workItemId1, ConcurrentDetails concurrentObjectModel, boolean isCorporate, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.workItemId = workItemId1;
        this.concurrentObjectModel = concurrentObjectModel;
        this.isCorporate = isCorporate;
        this.priority = priority;
        this.businessTasks = businessTasks;
    }

    public BusinessProcess(String processInstanceId, String workItemId, String policyNo, String workItemId1, ConcurrentDetails concurrentObjectModel, Document document, boolean isCorporate, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.workItemId = workItemId1;
        this.concurrentObjectModel = concurrentObjectModel;
        this.document = document;
        this.isCorporate = isCorporate;
        this.priority = priority;
        this.businessTasks = businessTasks;
    }

    public BusinessProcess(String processInstanceId, String workItemId, String workItemId1, ConcurrentDetails concurrentObjectModel, Document document, PolicyObject policyObject, boolean isCorporate, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.workItemId = workItemId;
        this.workItemId = workItemId1;
        this.concurrentObjectModel = concurrentObjectModel;
        this.document = document;
        this.policyObject = policyObject;
        this.isCorporate = isCorporate;
        this.priority = priority;
        this.businessTasks = businessTasks;
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

    public ConcurrentDetails getConcurrentObjectModel() {
        return concurrentObjectModel;
    }

    public void setConcurrentObjectModel(ConcurrentDetails concurrentObjectModel) {
        this.concurrentObjectModel = concurrentObjectModel;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ArrayList<BusinessTask> getBusinessTasks() {
        return businessTasks;
    }

    public void setBusinessTasks(ArrayList<BusinessTask> businessTasks) {
        this.businessTasks = businessTasks;
    }

    public boolean isCorporate() {
        return isCorporate;
    }

    public void setCorporate(boolean corporate) {
        isCorporate = corporate;
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

    @Override
    public String toString() {
        return "BusinessProcess{" +
                "processInstanceId='" + processInstanceId + '\'' +
                ", workItemId='" + workItemId + '\'' +
                ", workItemId='" + workItemId + '\'' +
                ", concurrentObjectModel=" + concurrentObjectModel +
                ", document=" + document +
                ", policyObject=" + policyObject +
                ", isCorporate=" + isCorporate +
                ", priority=" + priority +
                ", businessTasks=" + businessTasks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessProcess)) return false;

        BusinessProcess that = (BusinessProcess) o;

        if (isCorporate() != that.isCorporate()) return false;
        if (getPriority() != that.getPriority()) return false;
        if (getProcessInstanceId() != null ? !getProcessInstanceId().equals(that.getProcessInstanceId()) : that.getProcessInstanceId() != null)
            return false;
        if (getWorkItemId() != null ? !getWorkItemId().equals(that.getWorkItemId()) : that.getWorkItemId() != null)
            return false;
        if (getWorkItemId() != null ? !getWorkItemId().equals(that.getWorkItemId()) : that.getWorkItemId() != null)
            return false;
        if (getConcurrentObjectModel() != null ? !getConcurrentObjectModel().equals(that.getConcurrentObjectModel()) : that.getConcurrentObjectModel() != null)
            return false;
        if (getDocument() != null ? !getDocument().equals(that.getDocument()) : that.getDocument() != null)
            return false;
        if (getPolicyObject() != null ? !getPolicyObject().equals(that.getPolicyObject()) : that.getPolicyObject() != null)
            return false;
        return getBusinessTasks() != null ? getBusinessTasks().equals(that.getBusinessTasks()) : that.getBusinessTasks() == null;
    }

    @Override
    public int hashCode() {
        int result = getProcessInstanceId() != null ? getProcessInstanceId().hashCode() : 0;
        result = 31 * result + (getWorkItemId() != null ? getWorkItemId().hashCode() : 0);
        result = 31 * result + (getWorkItemId() != null ? getWorkItemId().hashCode() : 0);
        result = 31 * result + (getConcurrentObjectModel() != null ? getConcurrentObjectModel().hashCode() : 0);
        result = 31 * result + (getDocument() != null ? getDocument().hashCode() : 0);
        result = 31 * result + (getPolicyObject() != null ? getPolicyObject().hashCode() : 0);
        result = 31 * result + (isCorporate() ? 1 : 0);
        result = 31 * result + getPriority();
        result = 31 * result + (getBusinessTasks() != null ? getBusinessTasks().hashCode() : 0);
        return result;
    }
}
