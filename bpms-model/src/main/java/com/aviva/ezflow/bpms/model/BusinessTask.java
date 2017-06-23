package com.aviva.ezflow.bpms.model;

import java.io.Serializable;

/**
 * Created by kianhockting on 22/06/2017.
 */
public class BusinessTask implements Serializable {
    DateTime expiryDate;
    private String deploymentId;
    private String taskId;
    private String taskName;
    private String taskDec;

    private String processInstanceId;
    private String mainProcessInstanceId;
    private String pathCode; //Only for request

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
                "deploymentId='" + deploymentId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", processInstanceId='" + processInstanceId + '\'' +
                ", mainProcessInstanceId='" + mainProcessInstanceId + '\'' +
                ", pathCode='" + pathCode + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusinessTask)) return false;

        BusinessTask that = (BusinessTask) o;

        if (getDeploymentId() != null ? !getDeploymentId().equals(that.getDeploymentId()) : that.getDeploymentId() != null)
            return false;
        if (getTaskId() != null ? !getTaskId().equals(that.getTaskId()) : that.getTaskId() != null) return false;
        if (getProcessInstanceId() != null ? !getProcessInstanceId().equals(that.getProcessInstanceId()) : that.getProcessInstanceId() != null)
            return false;
        if (getMainProcessInstanceId() != null ? !getMainProcessInstanceId().equals(that.getMainProcessInstanceId()) : that.getMainProcessInstanceId() != null)
            return false;
        if (getPathCode() != null ? !getPathCode().equals(that.getPathCode()) : that.getPathCode() != null)
            return false;
        return getExpiryDate() != null ? getExpiryDate().equals(that.getExpiryDate()) : that.getExpiryDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getDeploymentId() != null ? getDeploymentId().hashCode() : 0;
        result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
        result = 31 * result + (getProcessInstanceId() != null ? getProcessInstanceId().hashCode() : 0);
        result = 31 * result + (getMainProcessInstanceId() != null ? getMainProcessInstanceId().hashCode() : 0);
        result = 31 * result + (getPathCode() != null ? getPathCode().hashCode() : 0);
        result = 31 * result + (getExpiryDate() != null ? getExpiryDate().hashCode() : 0);
        return result;
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
