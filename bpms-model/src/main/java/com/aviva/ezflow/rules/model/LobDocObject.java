package com.aviva.ezflow.rules.model;

import java.io.Serializable;

public class LobDocObject implements Serializable {

    private static final long serialVersionUID = -670626043604251131L;

    private String lob;

    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }
}
