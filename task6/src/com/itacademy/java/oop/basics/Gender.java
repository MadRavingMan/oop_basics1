package com.itacademy.java.oop.basics;

public enum Gender {

    FEMALE("female"),
    MALE("male"),
    UNKNOWN("unknown");

    private String displayName;

    private Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
