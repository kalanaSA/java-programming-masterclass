package com.company;

public class Rectangle extends Shape {

    private int width;
    private int height;


    public Rectangle(int width) {
        this(width, 0); //calls 2nd constructor
    }

    public Rectangle(int width, int height) {
        this(0, 0, 0, width, height); //calls 3rd constructor
    }

    //2. super() call in constructors to call parent constructor -------------------------------------------------------
    public Rectangle(int x, int y, int z, int width, int height) {
        super(x, y, z);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width) {
        super(x, y);
        //this(width, 0);  constructor can have a call to super() or this(), but never both.
        this.width = width;
    }

    //1. super keyword to call the parent class members(method) in override methods ------------------------------------
    @Override
    public void printShape() {
        super.printShape(); //calling method with same name from parent class
    }

}