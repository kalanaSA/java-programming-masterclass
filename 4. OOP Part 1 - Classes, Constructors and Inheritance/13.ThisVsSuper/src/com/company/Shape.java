package com.company;

public class Shape {

    private int x;
    private int y;
    private int z;

    public void printShape() {
        System.out.println("Shape.printShape() method called!");
    }

    //2. this() method call in constructor to call another overloaded constructor --------------------------------------
    public Shape() {
        this(0); //calls 2nd constructor
        //this(0, 0, 0); or calls 4th constructor direct
    }

    public Shape(int x) {
        this(x, 0); //calls 3rd constructor
    }

    public Shape(int x, int y) {
        this(x, y, 0); //calls 4th constructor
    }

    /* 1. this keyword to call the current class members(variables) in constructors ------------------------------------
       all args constructor does all the work.no matter what constructor we call, the variables will always be
       initialized in all args constructor. this is known as constructor chaining, the last constructor has the
       responsibility to initialize the instance variables. */
    public Shape(int x, int y, int z) {
        //initialization of instance variables
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //1. this keyword to call the current class members(variables) in setters & getters --------------------------------
    //setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    //getters
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

}
