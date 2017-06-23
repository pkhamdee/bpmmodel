package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 23/06/2017.
 */
public class PolicyObject {
    String policyNo;
    String policyStatus;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PolicyObject)) return false;

        PolicyObject that = (PolicyObject) o;

        if (getPolicyNo() != null ? !getPolicyNo().equals(that.getPolicyNo()) : that.getPolicyNo() != null)
            return false;
        return getPolicyStatus() != null ? getPolicyStatus().equals(that.getPolicyStatus()) : that.getPolicyStatus() == null;
    }

    @Override
    public int hashCode() {
        int result = getPolicyNo() != null ? getPolicyNo().hashCode() : 0;
        result = 31 * result + (getPolicyStatus() != null ? getPolicyStatus().hashCode() : 0);
        return result;
    }
}
