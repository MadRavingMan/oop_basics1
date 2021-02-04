package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class TravelManager {
    static void changeDestination(Family family, TravelDestination travelDestination) {

        if (family.getTravelDestination() != travelDestination) {
            family.setTravelDestination(travelDestination);
        }
    }

    static void travel(Family family){
        int vehicleConsumption = family.getVehicle().getConsumption();
        int availableFuel = family.getVehicle().getFuel();
        int travelDistance = family.getTravelDestination().getDistance();
//TODO recheck counting formulas
        double maxDistanceWithFuel = vehicleConsumption/(availableFuel*0.01);

        if (maxDistanceWithFuel >= travelDistance){
            System.out.println("Family will reach it's destination.");
        }else{
            double fuelNeed = vehicleConsumption/(travelDistance*0.01);
            System.out.println("Family needs "+ fuelNeed + " total liters of fuel to reach destination.");
        }

    }

    static void printFamilyMembers(Family family){
        System.out.println(Arrays.toString(family.getPersons()));
    }
}
