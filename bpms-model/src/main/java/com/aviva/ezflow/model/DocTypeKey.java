package com.aviva.ezflow.model;

public enum DocTypeKey {
    CLIENT("Client"),
    POLICY("Policy"),
    LEGAL("Legal");

    private final String CODE;

    private DocTypeKey(String code) {
        this.CODE = code;
    }

    public boolean equalsName(String otherCode) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return CODE.equals(otherCode);
    }

    @Override
    public String toString() {
        return this.CODE;
    }
}
