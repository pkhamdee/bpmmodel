package com.aviva.ezflow.bpms.model;

/**
 * Created by kianhockting on 22/06/2017.
 */

public class DateTime {
    String year ;
    String month ;
    String dayOfMonth ;
    String hourOfDay ;
    String minute ;
    String second ;

    public DateTime(String year, String month, String dayOfMonth, String hourOfDay, String minute, String second) {
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.hourOfDay = hourOfDay;
        this.minute = minute;
        this.second = second;
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(String dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(String hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateTime)) return false;

        DateTime dateTime = (DateTime) o;

        if (getYear() != null ? !getYear().equals(dateTime.getYear()) : dateTime.getYear() != null) return false;
        if (getMonth() != null ? !getMonth().equals(dateTime.getMonth()) : dateTime.getMonth() != null) return false;
        if (getDayOfMonth() != null ? !getDayOfMonth().equals(dateTime.getDayOfMonth()) : dateTime.getDayOfMonth() != null)
            return false;
        if (getHourOfDay() != null ? !getHourOfDay().equals(dateTime.getHourOfDay()) : dateTime.getHourOfDay() != null)
            return false;
        if (getMinute() != null ? !getMinute().equals(dateTime.getMinute()) : dateTime.getMinute() != null)
            return false;
        return getSecond() != null ? getSecond().equals(dateTime.getSecond()) : dateTime.getSecond() == null;
    }

    @Override
    public int hashCode() {
        int result = getYear() != null ? getYear().hashCode() : 0;
        result = 31 * result + (getMonth() != null ? getMonth().hashCode() : 0);
        result = 31 * result + (getDayOfMonth() != null ? getDayOfMonth().hashCode() : 0);
        result = 31 * result + (getHourOfDay() != null ? getHourOfDay().hashCode() : 0);
        result = 31 * result + (getMinute() != null ? getMinute().hashCode() : 0);
        result = 31 * result + (getSecond() != null ? getSecond().hashCode() : 0);
        return result;
    }


}
