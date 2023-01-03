package com.company;

//all classes in java inherited from 'Object' class. it'll provide some behaviors for classes in java.
public class Vehicle extends Object {

    //fields
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    //behaviors
    public void steer(int direction) { //setter for currentDirection as a function
        this.currentDirection = direction;
        System.out.println("Vehicle.steer() : steering at " + currentDirection + " degrees");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move() : Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}