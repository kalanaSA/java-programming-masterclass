package com.company;

public class Car extends Vehicle {

    //fields
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    //behaviors
    public void changeGear(int gear) {  //setter for currentGear as a function
        this.currentGear = gear;
        System.out.println("Car.changeGear() : change to " + this.currentGear + " gear");
    }

    //ability to change 'steer','move' & 'stop' are inherited to this class from base class(Vehicle). we can override them in here if we want.

    public void changeVelocity(int speed, int direction) {
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
        move(speed, direction);
    }

    //getters
    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getCurrentGear() {
        return currentGear;
    }

}
