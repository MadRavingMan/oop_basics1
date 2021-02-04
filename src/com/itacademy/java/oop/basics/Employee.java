package com.itacademy.java.oop.basics;

public class Employee {

    private String name;
    private String surname;
    private String contractStartDate;
    private int salary;
    private String position;
    private ContractType contractType;



    public Employee() {
    }

    public Employee(String name, String surname, String contractStartDate, int salary, String position, ContractType contractType) {
        this.name = name;
        this.surname = surname;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
        this.contractType = contractType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", contractType=" + contractType +
                '}';
    }
}
