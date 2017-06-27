package com.aviva.ezflow.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Checklist implements Serializable {
    private static final long serialVersionUID = 243822421350168034L;

    private String processCd;
    private String taskCd;
    private String locale;
    private Set<ChecklistItem> items;

    public String getProcessCd() {
        return processCd;
    }

    public void setProcessCd(String processCd) {
        this.processCd = processCd;
    }

    public String getTaskCd() {
        return taskCd;
    }

    public void setTaskCd(String taskCd) {
        this.taskCd = taskCd;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Set<ChecklistItem> getItems() {
        return items;
    }

    public void setItems(Set<ChecklistItem> items) {
        this.items = items;
    }

    public void addItem(ChecklistItem item) {
        if (null == items) {
            items = new HashSet<>();
        }
        items.add(item);
    }

    public void translate() {
        if (null != items) {
            for (ChecklistItem item: items) {
                item.translate(this);
            }
        }
    }
}
