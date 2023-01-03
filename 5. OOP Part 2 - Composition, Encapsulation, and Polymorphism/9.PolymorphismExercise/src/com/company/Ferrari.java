package com.company;

public class Ferrari extends Car {

    private boolean wing;

    public Ferrari(String name, int cylinders, boolean wing) {
        super(name, cylinders);
        this.wing = wing;
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari.startEngine() called!");
    }
}
