package com.aviva.ezflow.bpms.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kianhockting on 21/06/2017.
 */
public class BusinessProcess implements Serializable {

    String processInstanceId;
    String policyNo;
    String workItemId;
    ConcurrentDetails concurrentObjectModel;
    boolean isCorporate ;
    int priority = 0;
    ArrayList<BusinessTask> businessTasks = new ArrayList<BusinessTask>();

    public BusinessProcess(String processInstanceId, String policyNo, String workItemId, ConcurrentDetails concurrentObjectModel, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.policyNo = policyNo;
        this.workItemId = workItemId;
        this.concurrentObjectModel = concurrentObjectModel;
        this.priority = priority;
        this.businessTasks = businessTasks;
    }

    public BusinessProcess(String processInstanceId, String policyNo, String workItemId, ConcurrentDetails concurrentObjectModel, boolean isCorporate, int priority, ArrayList<BusinessTask> businessTasks) {
        this.processInstanceId = processInstanceId;
        this.policyNo = policyNo;
        this.workItemId = workItemId;
        this.concurrentObjectModel = concurrentObjectModel;
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

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessProcess)) return false;

        BusinessProcess that = (BusinessProcess) o;

        if (isCorporate() != that.isCorporate()) return false;
        if (getPriority() != that.getPriority()) return false;
        if (getProcessInstanceId() != null ? !getProcessInstanceId().equals(that.getProcessInstanceId()) : that.getProcessInstanceId() != null)
            return false;
        if (getPolicyNo() != null ? !getPolicyNo().equals(that.getPolicyNo()) : that.getPolicyNo() != null)
            return false;
        if (getWorkItemId() != null ? !getWorkItemId().equals(that.getWorkItemId()) : that.getWorkItemId() != null)
            return false;
        if (getConcurrentObjectModel() != null ? !getConcurrentObjectModel().equals(that.getConcurrentObjectModel()) : that.getConcurrentObjectModel() != null)
            return false;
        return getBusinessTasks() != null ? getBusinessTasks().equals(that.getBusinessTasks()) : that.getBusinessTasks() == null;
    }

    @Override
    public int hashCode() {
        int result = getProcessInstanceId() != null ? getProcessInstanceId().hashCode() : 0;
        result = 31 * result + (getPolicyNo() != null ? getPolicyNo().hashCode() : 0);
        result = 31 * result + (getWorkItemId() != null ? getWorkItemId().hashCode() : 0);
        result = 31 * result + (getConcurrentObjectModel() != null ? getConcurrentObjectModel().hashCode() : 0);
        result = 31 * result + (isCorporate() ? 1 : 0);
        result = 31 * result + getPriority();
        result = 31 * result + (getBusinessTasks() != null ? getBusinessTasks().hashCode() : 0);
        return result;
    }
}
