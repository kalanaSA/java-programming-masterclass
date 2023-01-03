package com.company;

public class Monkey extends Animal {

    //specific fields(instance variables) to this sub class ------------------------------------------------------------
    private int hands;
    private int eyeSockets;
    private int ears;
    private int fingerPrints;

    //specific behaviors(instance methods) to this sub class -----------------------------------------------------------
    public void jump() {
        System.out.println("Monkey.jump() method called!");
    }

    //override base class behaviors in sub class -----------------------------------------------------------------------
    @Override
    public void move(int speed) {
        super.move(speed);
        jump();
    }

    //constructor for initialize this sub class specific fields & fields that inherited from base class also. ----------
    //to initialize inherited fields also we use super statement, by it base class constructor will be called.
    public Monkey(String name, int brain, int body, int size, double weight, int hands, int eyeSockets, int ears, int fingerPrints) {
        super(name, brain, body, size, weight);  //call base class constructor in sub class constructor
        this.hands = hands;
        this.eyeSockets = eyeSockets;
        this.ears = ears;
        this.fingerPrints = fingerPrints;
    }

    //getters(instance methods) ----------------------------------------------------------------------------------------
    public int getHands() {
        return hands;
    }

    public int getEyeSockets() {
        return eyeSockets;
    }

    public int getEars() {
        return ears;
    }

    public int getFingerPrints() {
        return fingerPrints;
    }

    //set all-args constructor to initialize object's fields instead of setters.

}
