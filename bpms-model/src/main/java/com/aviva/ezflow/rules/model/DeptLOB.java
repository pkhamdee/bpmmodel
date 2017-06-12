package com.aviva.ezflow.rules.model;

import java.io.Serializable;
import java.util.Set;

public class DeptLOB implements Serializable {

    private static final long serialVersionUID = 8854017045327968296L;

    private String deptCd;
    private Set<LobDocObject> listOfLobDocObject;

    public String getDeptCd() {
        return deptCd;
    }

    public void setDeptCd(String deptCd) {
        this.deptCd = deptCd;
    }

    public Set<LobDocObject> getListOfLobDocObject() {
        return listOfLobDocObject;
    }

    public void setListOfLobDocObject(Set<LobDocObject> listOfLobDocObject) {
        this.listOfLobDocObject = listOfLobDocObject;
    }
}
