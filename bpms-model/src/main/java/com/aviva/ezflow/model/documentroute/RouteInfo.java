package com.aviva.ezflow.model.documentroute;

import java.util.List;

public class RouteInfo implements java.io.Serializable {
    private static final long serialVersionUID = -2043198981554624987L;

    private java.util.List<com.aviva.ezflow.model.documentroute.Action> actionList;

    public RouteInfo() {
    }

    public List<Action> getActionList() {
        return actionList;
    }

    public void setActionList(List<Action> actionList) {
        this.actionList = actionList;
    }
}
