package com.company;

/* base/super class (sub classes will base on this super class, we put common states & behaviors in this base class) */
public class Animal {

    //generic states (instance variables/class fields)
    private String name;
    private int brain;
    private int body;
    private int size;
    private double weight;

    //generic behaviors(instance methods)
    public void eat() {
        System.out.println("Animal.eat() method called!");
    }

    public void move(int speed) {
        System.out.println("Animal.move() method called!, Animal is moving at " + speed);
    }

    public void grow() {
        System.out.println("Animal.grow() method called!");
    }

    //1. create all-args/major constructor for initialize values of objects that will create from this class.
    public Animal(String name, int brain, int body, int size, double weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    //getters(instance methods)
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }
}
