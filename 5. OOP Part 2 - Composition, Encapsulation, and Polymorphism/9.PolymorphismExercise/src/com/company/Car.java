package com.company;

public class Car {

    private String name;
    private boolean hasEngine;
    private int cylinders;
    private int wheels;
    private int currentSpeed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.hasEngine = true;
        this.wheels = 4;
        this.currentSpeed = 0;
    }

    public void startEngine() {
        System.out.println("Car.startEngine() called, starting engine...");
        hasEngine = true;
    }

    public void accelerate(int acceleration) {
        System.out.println("Car.acceleration() called, current speed : " + currentSpeed + "km/h, " +
                "increasing speed : " + acceleration + "km/h");
        currentSpeed += acceleration;
        System.out.println("current speed now : " + currentSpeed);
    }

    public void brake(int deceleration) {
        System.out.println("Car.deceleration() called, current speed : " + currentSpeed + "km/h, " +
                "decreasing speed : " + deceleration + "km/h");
        currentSpeed -= deceleration;
        System.out.println("current speed now : " + currentSpeed);
    }


    public String getName() {
        return name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
