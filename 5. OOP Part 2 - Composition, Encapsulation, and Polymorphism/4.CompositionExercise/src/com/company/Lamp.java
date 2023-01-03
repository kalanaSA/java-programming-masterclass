package com.company;

public class Lamp {

    private String name;
    private String color;

    public Lamp(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void printSpecifications() {
        System.out.println("---------------- Lamp ----------------");
        System.out.println("name : " + name + ", colour : " + color + "\n");
    }
}
