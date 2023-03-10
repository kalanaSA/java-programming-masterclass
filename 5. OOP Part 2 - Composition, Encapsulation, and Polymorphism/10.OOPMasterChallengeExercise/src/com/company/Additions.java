package com.company;

public class Additions {

    private String name;
    private double price;

    public Additions(String name, double price) {
        this.name = name;
        this.price = (price < 0) ? -1 : price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
