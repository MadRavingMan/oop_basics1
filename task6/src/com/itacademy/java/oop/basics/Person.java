package com.itacademy.java.oop.basics;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private int age;

    public Person() {
    }

    public Person(String name, String surname, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
