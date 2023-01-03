package com.company;

public class AirConditioner {

    private String name;
    private int temperature;

    public AirConditioner(String name) {
        this.name = name;
        this.temperature = 25;
    }

    public void turnOn() {
        System.out.println("The air conditioner is on");
    }

    public void turnOff() {
        System.out.println("The air conditioner is off");
    }

    public void warmUp(int increaseAmount) {
        this.temperature += increaseAmount;

    }

    public void coolDown(int decreaseAmount) {
        this.temperature -= decreaseAmount;
    }

    public void printTemperature() {
        System.out.println("--------- Air Conditioner -------------");
        System.out.println("Name : " + name + ", temperature : " + temperature + "ºC \n");
    }

}
