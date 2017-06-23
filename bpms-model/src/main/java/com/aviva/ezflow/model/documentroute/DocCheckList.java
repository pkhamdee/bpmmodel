package com.aviva.ezflow.model.documentroute;

import java.util.List;

public class DocCheckList  implements java.io.Serializable{
    private static final long serialVersionUID = 6985595262194995490L;

    private java.util.List<com.aviva.ezflow.model.documentroute.CheckList> checkList;

    public DocCheckList() {
    }

    public List<CheckList> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<CheckList> checkList) {
        this.checkList = checkList;
    }
}
