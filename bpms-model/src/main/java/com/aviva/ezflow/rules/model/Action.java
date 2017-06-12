package com.aviva.ezflow.rules.model;

public enum Action {

    CREATE("C"),
    AMEND("A"),
    FILE("F");

    private final String CODE;

    private Action(String code) {
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
