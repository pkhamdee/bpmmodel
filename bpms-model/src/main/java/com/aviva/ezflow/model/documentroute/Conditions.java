package com.aviva.ezflow.model.documentroute;

import java.lang.reflect.Field;

public class Conditions implements java.io.Serializable {
    private static final long serialVersionUID = 6411143176022680486L;

    private java.lang.Boolean contractCreated;
    private java.lang.String policyStatus;
    private java.lang.Integer dispatchDate;
    private java.lang.Boolean policyAckReceived;
    private java.lang.Boolean policyHolderReceived;
    private java.lang.Boolean compliantReceived;
    private java.lang.Boolean incidentReceived;
    private java.lang.Boolean cCNeedSupport;
    private java.lang.Boolean nBProcessExist;
    private java.lang.Boolean pSProcessExist;
    private java.lang.Boolean claimProcessExist;
    private java.lang.Boolean policyOnHold;

    public Conditions() {
    }

    public void reflectField(String fieldName, String fieldValue){
        Class condClass = this.getClass();
        Field field = null;
        try {
            field = condClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            if(field.getType().equals(Boolean.class)){
                if(fieldValue.equalsIgnoreCase("YES")){
                    field.set(this,true);
                } else if(fieldValue.equalsIgnoreCase("NO")){
                    field.set(this,false);
                }
            }
            if(field.getType().equals(String.class)){
                field.set(this,fieldValue);
            }
            if(field.getType().equals(Integer.class)){
                field.set(this,Integer.valueOf(fieldValue));
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public Boolean getContractCreated() {
        return contractCreated;
    }

    public void setContractCreated(Boolean contractCreated) {
        this.contractCreated = contractCreated;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public Integer getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Integer dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public Boolean getPolicyAckReceived() {
        return policyAckReceived;
    }

    public void setPolicyAckReceived(Boolean policyAckReceived) {
        this.policyAckReceived = policyAckReceived;
    }

    public Boolean getPolicyHolderReceived() {
        return policyHolderReceived;
    }

    public void setPolicyHolderReceived(Boolean policyHolderReceived) {
        this.policyHolderReceived = policyHolderReceived;
    }

    public Boolean getCompliantReceived() {
        return compliantReceived;
    }

    public void setCompliantReceived(Boolean compliantReceived) {
        this.compliantReceived = compliantReceived;
    }

    public Boolean getIncidentReceived() {
        return incidentReceived;
    }

    public void setIncidentReceived(Boolean incidentReceived) {
        this.incidentReceived = incidentReceived;
    }

    public Boolean getcCNeedSupport() {
        return cCNeedSupport;
    }

    public void setcCNeedSupport(Boolean cCNeedSupport) {
        this.cCNeedSupport = cCNeedSupport;
    }

    public Boolean getnBProcessExist() {
        return nBProcessExist;
    }

    public void setnBProcessExist(Boolean nBProcessExist) {
        this.nBProcessExist = nBProcessExist;
    }

    public Boolean getpSProcessExist() {
        return pSProcessExist;
    }

    public void setpSProcessExist(Boolean pSProcessExist) {
        this.pSProcessExist = pSProcessExist;
    }

    public Boolean getClaimProcessExist() {
        return claimProcessExist;
    }

    public void setClaimProcessExist(Boolean claimProcessExist) {
        this.claimProcessExist = claimProcessExist;
    }

    public Boolean getPolicyOnHold() {
        return policyOnHold;
    }

    public void setPolicyOnHold(Boolean policyOnHold) {
        this.policyOnHold = policyOnHold;
    }
}
