package com.itacademy.java.oop.basics;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Parker", "2020-05-30", 2000, "Basiuvys", ContractType.PART_TIME );

        System.out.println(john);

    }
}
