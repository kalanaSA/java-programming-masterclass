package com.company;

public class Lamp {

    private String style;
    private boolean isBattery;
    private int globRating;

    public Lamp(String style, boolean isBattery, int globRating) {
        this.style = style;
        this.isBattery = isBattery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("lamp turning on..");
    }

    public void turnOff() {
        System.out.println("lamp turning off..");
    }

    //getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return isBattery;
    }

    public int getGlobRating() {
        return globRating;
    }

}
