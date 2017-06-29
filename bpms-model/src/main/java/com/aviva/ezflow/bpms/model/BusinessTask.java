package com.aviva.ezflow.bpms.model;

import java.io.Serializable;

/**
 * Created by kianhockting on 22/06/2017.
 */
public class BusinessTask implements Serializable {

    private CommonHeader commonHeader;
    private DateTime expiryDate;
    private String deploymentId;
    private String taskId;
    private String taskName;
    private String taskDec;
    private String processInstanceId;
    private String mainProcessInstanceId;
    private String workItemId;
    private String pathCode; //Only for request


    public BusinessTask() {

    }

    public BusinessTask(CommonHeader commonHeader, DateTime expiryDate, String deploymentId, String taskId, String taskName, String taskDec, String processInstanceId, String mainProcessInstanceId, String workItemId, String pathCode) {

        this.commonHeader = commonHeader;
        this.expiryDate = expiryDate;
        this.deploymentId = deploymentId;
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDec = taskDec;
        this.processInstanceId = processInstanceId;
        this.mainProcessInstanceId = mainProcessInstanceId;
        this.workItemId = workItemId;
        this.pathCode = pathCode;
    }

    public BusinessTask(CommonHeader commonHeader, DateTime expiryDate, String deploymentId, String taskId, String taskName, String taskDec, String processInstanceId, String mainProcessInstanceId, String pathCode) {

        this.commonHeader = commonHeader;
        this.expiryDate = expiryDate;
        this.deploymentId = deploymentId;
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDec = taskDec;
        this.processInstanceId = processInstanceId;
        this.mainProcessInstanceId = mainProcessInstanceId;
        this.pathCode = pathCode;
    }

    public BusinessTask(String taskId, String processInstanceId, String mainProcessInstanceId, String pathCode, DateTime expiryDate) {
        this.taskId = taskId;
        this.processInstanceId = processInstanceId;
        this.mainProcessInstanceId = mainProcessInstanceId;
        this.pathCode = pathCode;
        this.expiryDate = expiryDate;
    }

    public BusinessTask(String deploymentId, String taskId, String processInstanceId, String mainProcessInstanceId, String pathCode, DateTime expiryDate) {
        this.deploymentId = deploymentId;
        this.taskId = taskId;
        this.processInstanceId = processInstanceId;
        this.mainProcessInstanceId = mainProcessInstanceId;
        this.pathCode = pathCode;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "BusinessTask{" +
                "commonHeader=" + commonHeader +
                ", expiryDate=" + expiryDate +
                ", deploymentId='" + deploymentId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", taskName='" + taskName + '\'' +
                ", taskDec='" + taskDec + '\'' +
                ", processInstanceId='" + processInstanceId + '\'' +
                ", mainProcessInstanceId='" + mainProcessInstanceId + '\'' +
                ", workItemId='" + workItemId + '\'' +
                ", pathCode='" + pathCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessTask)) return false;

        BusinessTask that = (BusinessTask) o;

        if (getCommonHeader() != null ? !getCommonHeader().equals(that.getCommonHeader()) : that.getCommonHeader() != null)
            return false;
        if (getExpiryDate() != null ? !getExpiryDate().equals(that.getExpiryDate()) : that.getExpiryDate() != null)
            return false;
        if (getDeploymentId() != null ? !getDeploymentId().equals(that.getDeploymentId()) : that.getDeploymentId() != null)
            return false;
        if (getTaskId() != null ? !getTaskId().equals(that.getTaskId()) : that.getTaskId() != null) return false;
        if (getTaskName() != null ? !getTaskName().equals(that.getTaskName()) : that.getTaskName() != null)
            return false;
        if (getTaskDec() != null ? !getTaskDec().equals(that.getTaskDec()) : that.getTaskDec() != null) return false;
        if (getProcessInstanceId() != null ? !getProcessInstanceId().equals(that.getProcessInstanceId()) : that.getProcessInstanceId() != null)
            return false;
        if (getMainProcessInstanceId() != null ? !getMainProcessInstanceId().equals(that.getMainProcessInstanceId()) : that.getMainProcessInstanceId() != null)
            return false;
        if (getWorkItemId() != null ? !getWorkItemId().equals(that.getWorkItemId()) : that.getWorkItemId() != null)
            return false;
        return getPathCode() != null ? getPathCode().equals(that.getPathCode()) : that.getPathCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getCommonHeader() != null ? getCommonHeader().hashCode() : 0;
        result = 31 * result + (getExpiryDate() != null ? getExpiryDate().hashCode() : 0);
        result = 31 * result + (getDeploymentId() != null ? getDeploymentId().hashCode() : 0);
        result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
        result = 31 * result + (getTaskName() != null ? getTaskName().hashCode() : 0);
        result = 31 * result + (getTaskDec() != null ? getTaskDec().hashCode() : 0);
        result = 31 * result + (getProcessInstanceId() != null ? getProcessInstanceId().hashCode() : 0);
        result = 31 * result + (getMainProcessInstanceId() != null ? getMainProcessInstanceId().hashCode() : 0);
        result = 31 * result + (getWorkItemId() != null ? getWorkItemId().hashCode() : 0);
        result = 31 * result + (getPathCode() != null ? getPathCode().hashCode() : 0);
        return result;
    }

    public String getWorkItemId() {

        return workItemId;
    }

    public void setWorkItemId(String workItemId) {
        this.workItemId = workItemId;
    }

    public CommonHeader getCommonHeader() {

        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDec() {
        return taskDec;
    }

    public void setTaskDec(String taskDec) {
        this.taskDec = taskDec;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getMainProcessInstanceId() {
        return mainProcessInstanceId;
    }

    public void setMainProcessInstanceId(String mainProcessInstanceId) {
        this.mainProcessInstanceId = mainProcessInstanceId;
    }

    public String getPathCode() {
        return pathCode;
    }

    public void setPathCode(String pathCode) {
        this.pathCode = pathCode;
    }

    public DateTime getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(DateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

}
