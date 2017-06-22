package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 21/06/2017.
 */
public class CommonHeader {
    String countryCd;
    String sourceSystemCd;
    String lobCd;

    public CommonHeader(String countryCd, String sourceSystemCd, String lobCd) {
        this.countryCd = countryCd;
        this.sourceSystemCd = sourceSystemCd;
        this.lobCd = lobCd;
    }

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public String getSourceSystemCd() {
        return sourceSystemCd;
    }

    public void setSourceSystemCd(String sourceSystemCd) {
        this.sourceSystemCd = sourceSystemCd;
    }

    public String getLobCd() {
        return lobCd;
    }

    public void setLobCd(String lobCd) {
        this.lobCd = lobCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommonHeader)) return false;

        CommonHeader that = (CommonHeader) o;

        if (getCountryCd() != null ? !getCountryCd().equals(that.getCountryCd()) : that.getCountryCd() != null)
            return false;
        if (getSourceSystemCd() != null ? !getSourceSystemCd().equals(that.getSourceSystemCd()) : that.getSourceSystemCd() != null)
            return false;
        return getLobCd() != null ? getLobCd().equals(that.getLobCd()) : that.getLobCd() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountryCd() != null ? getCountryCd().hashCode() : 0;
        result = 31 * result + (getSourceSystemCd() != null ? getSourceSystemCd().hashCode() : 0);
        result = 31 * result + (getLobCd() != null ? getLobCd().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommonHeader{" +
                "countryCd='" + countryCd + '\'' +
                ", sourceSystemCd='" + sourceSystemCd + '\'' +
                ", lobCd='" + lobCd + '\'' +
                '}';
    }
}
