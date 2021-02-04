package com.itacademy.java.oop.basics;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class Family {
    private Person[] persons;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family() {
    }

    public Family(Person[] persons, Vehicle vehicle, TravelDestination travelDestination) {
        this.persons = persons;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public Person[] getPersons() {
        return persons;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setTravelDestination(TravelDestination travelDestination) {
        this.travelDestination = travelDestination;
    }

    @Override
    public String toString() {
        return "Family{" +
                "persons=" + Arrays.toString(persons) +
                ", vehicle=" + vehicle +
                ", travelDestination=" + travelDestination +
                '}';
    }
}
