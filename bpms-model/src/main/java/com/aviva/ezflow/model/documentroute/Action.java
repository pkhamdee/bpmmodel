package com.aviva.ezflow.model.documentroute;

import java.util.List;

public class Action implements java.io.Serializable {
    private static final long serialVersionUID = -5890573288061162059L;

    private java.lang.String actionType;
    private java.util.List<com.aviva.ezflow.model.documentroute.Property> properties;

    public Action() {
    }

    public void addProperty(com.aviva.ezflow.model.documentroute.Property property){
        if(this.properties == null){
            this.properties = new java.util.ArrayList<com.aviva.ezflow.model.documentroute.Property>();
        }
        this.properties.add(property);
    }
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}
