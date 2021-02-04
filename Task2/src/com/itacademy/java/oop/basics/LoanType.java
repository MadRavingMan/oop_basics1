package com.itacademy.java.oop.basics;

public enum LoanType {

    LEASING("leasing"),
    CONSUMER("consumer");

    private String displayValue;

    public String getDisplayValue() {
        return displayValue;
    }

    public static LoanType fromCode(String code) {
        for (LoanType d : values()) {
            if (d.getDisplayValue().equals(code)) {
                return d;
            }
        }
        throw new IllegalArgumentException("enum does not exist");
    }

    LoanType(String displayValue) {
        this.displayValue = displayValue;
    }
}
