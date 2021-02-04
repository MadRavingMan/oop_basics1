package com.itacademy.java.oop.basics;

public class TravelApplication {
    public static void main(String[] args) {

        Person jonas = new Person("Jonas", "Petraskaus", Gender.FEMALE, 74);
        Person gabris = new Person("Gabris", "Petraskaus", Gender.UNKNOWN, 98);
        Person gelda = new Person("Gelda", "Grybiene", Gender.FEMALE, 21);
        Person terve = new Person("Terve", "Alison", Gender.FEMALE, 21);
        Person fajeris = new Person("Fajeris", "Keglis", Gender.MALE, 10);

        Vehicle honda = new Vehicle("Kivikas", "Honda", 60, 4);
        Vehicle lada = new Vehicle("vaz", "Lada", 40, 1);

        Person[] petrauskai = {jonas, gabris};
        Person[] grybali = {gelda, terve};
        Person[] jajeriss = {fajeris};

        TravelDestination paris = new TravelDestination("Paris", "Paris", 100);
        TravelDestination dublin = new TravelDestination("Dublin", "Dublin", 150);

        Family first = new Family(petrauskai, honda, paris);
        Family second = new Family(grybali, lada, dublin);
        Family third = new Family(jajeriss, honda, dublin);

        TravelManager.changeDestination(third, paris);

        TravelManager.printFamilyMembers(third);
        TravelManager.printFamilyMembers(second);

        TravelManager.travel(first);
        TravelManager.travel(second);




    }
}
