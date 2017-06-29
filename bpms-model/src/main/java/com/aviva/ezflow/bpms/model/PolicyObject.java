package com.aviva.ezflow.bpms.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by kianhockting on 23/06/2017.
 */
public class PolicyObject implements Serializable {

    String applicationNo;
    String policyNo;
    String policyStatus;
    ArrayList<LifeAssured> lifeAssuredList;

    public PolicyObject() {}

    public PolicyObject(String applicationNo, String policyNo, String policyStatus, ArrayList<LifeAssured> lifeAssuredList) {

        this.applicationNo = applicationNo;
        this.policyNo = policyNo;
        this.policyStatus = policyStatus;
        this.lifeAssuredList = lifeAssuredList;
    }

    public PolicyObject(String applicationNo, String policyNo, String policyStatus) {

        this.applicationNo = applicationNo;
        this.policyNo = policyNo;
        this.policyStatus = policyStatus;
    }

    @Override
    public String toString() {
        return "PolicyObject{" +
                "applicationNo='" + applicationNo + '\'' +
                ", policyNo='" + policyNo + '\'' +
                ", policyStatus='" + policyStatus + '\'' +
                ", lifeAssuredList=" + lifeAssuredList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolicyObject)) return false;

        PolicyObject that = (PolicyObject) o;

        if (getApplicationNo() != null ? !getApplicationNo().equals(that.getApplicationNo()) : that.getApplicationNo() != null)
            return false;
        if (getPolicyNo() != null ? !getPolicyNo().equals(that.getPolicyNo()) : that.getPolicyNo() != null)
            return false;
        if (getPolicyStatus() != null ? !getPolicyStatus().equals(that.getPolicyStatus()) : that.getPolicyStatus() != null)
            return false;
        return getLifeAssuredList() != null ? getLifeAssuredList().equals(that.getLifeAssuredList()) : that.getLifeAssuredList() == null;
    }

    @Override
    public int hashCode() {
        int result = getApplicationNo() != null ? getApplicationNo().hashCode() : 0;
        result = 31 * result + (getPolicyNo() != null ? getPolicyNo().hashCode() : 0);
        result = 31 * result + (getPolicyStatus() != null ? getPolicyStatus().hashCode() : 0);
        result = 31 * result + (getLifeAssuredList() != null ? getLifeAssuredList().hashCode() : 0);
        return result;
    }

    public ArrayList<LifeAssured> getLifeAssuredList() {

        return lifeAssuredList;
    }

    public void setLifeAssuredList(ArrayList<LifeAssured> lifeAssuredList) {
        this.lifeAssuredList = lifeAssuredList;
    }

    public String getApplicationNo() {

        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

}
