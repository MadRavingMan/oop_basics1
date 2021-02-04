package com.itacademy.java.oop.basics;

public class AccountApplication {
    public static void main(String[] args) {
        Account jonelis = new Account("kerzas", "Jonelis", 100);
        Account pyteris = new Account("parkelis", "Pyteris", 50);

        System.out.println(jonelis.credit(20));
        System.out.println(jonelis.credit(10));
        System.out.println(pyteris.credit(10));

        jonelis.debit(500);

        pyteris.transferTo(jonelis,70);

        System.out.println(jonelis.debit(30));

        jonelis.transferTo(pyteris, 10);

        System.out.println(jonelis.getBalance());
        System.out.println(pyteris.getBalance());

        System.out.println(jonelis);
        System.out.println(pyteris);

    }
}
