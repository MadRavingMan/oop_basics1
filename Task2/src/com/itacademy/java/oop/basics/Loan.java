package com.itacademy.java.oop.basics;

public class Loan {
    private int id;
    private int amount;
    private String terminationDate;
    private LoanType loanType;

    public Loan(int id, int amount, LoanType loanType ,String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.loanType = loanType;
        this.terminationDate = terminationDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", terminationDate='" + terminationDate + '\'' +
                ", loanType=" + loanType +
                '}';
    }
}
