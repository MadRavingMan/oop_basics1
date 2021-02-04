package com.itacademy.java.oop.basics;

public class LoansApplication {
    public static void main(String[] args) {

        Loan ketvirtaLeas = new Loan(145, 200, LoanType.LEASING, "2020-12-31");
        Loan ketvirtaConsum = new Loan(245, 100, LoanType.CONSUMER, "2020-11-20");
        Loan[] loans = {ketvirtaLeas, ketvirtaConsum};
        Customer algis = new Customer("Algis", "Maciunas", 44, 258452, loans );

        System.out.println(algis);
    }
}
