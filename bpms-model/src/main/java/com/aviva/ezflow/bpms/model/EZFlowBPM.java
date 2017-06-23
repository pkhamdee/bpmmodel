package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 22/06/2017.
 */

public class EZFlowBPM {
    private CommonHeader commonHeader;
    private BusinessProcess businessProcess;

    public EZFlowBPM(CommonHeader commonHeader, BusinessProcess businessProcess, BusinessTask businessTask) {
        this.commonHeader = commonHeader;
        this.businessProcess = businessProcess;
    }

    public CommonHeader getCommonHeader() {
        return commonHeader;
    }

    public void setCommonHeader(CommonHeader commonHeader) {
        this.commonHeader = commonHeader;
    }

    public BusinessProcess getBusinessProcess() {
        return businessProcess;
    }

    public void setBusinessProcess(BusinessProcess businessProcess) {
        this.businessProcess = businessProcess;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EZFlowBPM)) return false;

        EZFlowBPM ezFlowBPM = (EZFlowBPM) o;

        if (getCommonHeader() != null ? !getCommonHeader().equals(ezFlowBPM.getCommonHeader()) : ezFlowBPM.getCommonHeader() != null)
            return false;
        return getBusinessProcess() != null ? getBusinessProcess().equals(ezFlowBPM.getBusinessProcess()) : ezFlowBPM.getBusinessProcess() == null;
    }

    @Override
    public int hashCode() {
        int result = getCommonHeader() != null ? getCommonHeader().hashCode() : 0;
        result = 31 * result + (getBusinessProcess() != null ? getBusinessProcess().hashCode() : 0);
        return result;
    }
}
