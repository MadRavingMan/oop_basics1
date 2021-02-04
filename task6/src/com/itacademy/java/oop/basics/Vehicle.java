package com.itacademy.java.oop.basics;

public class Vehicle {

    private String name;
    private String brand;
    private int fuel;
    private int consumption;

    public Vehicle() {
    }

    public Vehicle(String name, String brang, int fuel, int consumption) {
        this.name = name;
        this.brand = brang;
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public int getFuel() {
        return fuel;
    }

    public int getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", brang='" + brand + '\'' +
                ", fuel=" + fuel +
                ", consumption=" + consumption +
                '}';
    }
}
