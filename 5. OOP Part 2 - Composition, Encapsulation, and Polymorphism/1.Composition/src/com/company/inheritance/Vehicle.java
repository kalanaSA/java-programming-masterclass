package com.company.inheritance;

public class Vehicle {

    private String name;

    public void move() {
        System.out.println("Vehicle.move() method called!");
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
