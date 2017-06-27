package com.aviva.ezflow.bpms.model;


import java.util.Calendar;
/**
 * Created by kianhockting on 27/06/2017.
 */
public class LifeAssured {

    private String clientNo;
    private String lifeAssuredName;
    private Calendar lifeAssuredDob;
    private int lifeAssuredAge;
    private Calendar dobBaseCalulatioDate;
    private boolean isMainLifeAssured;


    public LifeAssured(String clientNo, String lifeAssuredName, Calendar lifeAssuredDob, int lifeAssuredAge, Calendar dobBaseCalulatioDate, boolean isMainLifeAssured) {
        this.clientNo = clientNo;
        this.lifeAssuredName = lifeAssuredName;
        this.lifeAssuredDob = lifeAssuredDob;
        this.lifeAssuredAge = lifeAssuredAge;
        this.dobBaseCalulatioDate = dobBaseCalulatioDate;
        this.isMainLifeAssured = isMainLifeAssured;
    }

    @Override
    public String toString() {
        return "LifeAssured{" +
                "clientNo='" + clientNo + '\'' +
                ", lifeAssuredName='" + lifeAssuredName + '\'' +
                ", lifeAssuredDob=" + lifeAssuredDob +
                ", lifeAssuredAge=" + lifeAssuredAge +
                ", dobBaseCalulatioDate=" + dobBaseCalulatioDate +
                ", isMainLifeAssured=" + isMainLifeAssured +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LifeAssured)) return false;

        LifeAssured that = (LifeAssured) o;

        if (getLifeAssuredAge() != that.getLifeAssuredAge()) return false;
        if (isMainLifeAssured() != that.isMainLifeAssured()) return false;
        if (getClientNo() != null ? !getClientNo().equals(that.getClientNo()) : that.getClientNo() != null)
            return false;
        if (getLifeAssuredName() != null ? !getLifeAssuredName().equals(that.getLifeAssuredName()) : that.getLifeAssuredName() != null)
            return false;
        if (getLifeAssuredDob() != null ? !getLifeAssuredDob().equals(that.getLifeAssuredDob()) : that.getLifeAssuredDob() != null)
            return false;
        return getDobBaseCalulatioDate() != null ? getDobBaseCalulatioDate().equals(that.getDobBaseCalulatioDate()) : that.getDobBaseCalulatioDate() == null;
    }

    @Override
    public int hashCode() {
        int result = getClientNo() != null ? getClientNo().hashCode() : 0;
        result = 31 * result + (getLifeAssuredName() != null ? getLifeAssuredName().hashCode() : 0);
        result = 31 * result + (getLifeAssuredDob() != null ? getLifeAssuredDob().hashCode() : 0);
        result = 31 * result + getLifeAssuredAge();
        result = 31 * result + (getDobBaseCalulatioDate() != null ? getDobBaseCalulatioDate().hashCode() : 0);
        result = 31 * result + (isMainLifeAssured() ? 1 : 0);
        return result;
    }

    public String getClientNo() {
        return clientNo;
    }

    public void setClientNo(String clientNo) {
        this.clientNo = clientNo;
    }

    public String getLifeAssuredName() {
        return lifeAssuredName;
    }

    public void setLifeAssuredName(String lifeAssuredName) {
        this.lifeAssuredName = lifeAssuredName;
    }

    public Calendar getLifeAssuredDob() {
        return lifeAssuredDob;
    }

    public void setLifeAssuredDob(Calendar lifeAssuredDob) {
        this.lifeAssuredDob = lifeAssuredDob;
    }

    public int getLifeAssuredAge() {
        return lifeAssuredAge;
    }

    public void setLifeAssuredAge(int lifeAssuredAge) {
        this.lifeAssuredAge = lifeAssuredAge;
    }

    public Calendar getDobBaseCalulatioDate() {
        return dobBaseCalulatioDate;
    }

    public void setDobBaseCalulatioDate(Calendar dobBaseCalulatioDate) {
        this.dobBaseCalulatioDate = dobBaseCalulatioDate;
    }

    public boolean isMainLifeAssured() {
        return isMainLifeAssured;
    }

    public void setMainLifeAssured(boolean mainLifeAssured) {
        isMainLifeAssured = mainLifeAssured;
    }
}
