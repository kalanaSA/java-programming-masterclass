package com.company;

public class Wall {

    //instance variables/class fields (not static or local variables) -------------
    private double height;
    private double width;

    //constructors ----------------------------------------------------------------
    public Wall() {
        this(1.0, 1.0);
    }

    public Wall(double height, double width) {
        //validations for object's fields to create valid object when initializing object using constructor.
        this.height = height > 0 ? height : 0.0;
        this.width = width > 0 ? width : 0.0;
    }

    //instance method ---------------------------------------------------------------
    public double getArea() {
        //return this.height * this.width;
        return getHeight() * getWidth();
    }

    //instance methods(not static methods) / setters & getters ----------------------
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = (height > 0) ? height : 0.0; //validations for object's fields to create valid object using setters.
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = (width > 0) ? width : 0.0; //validations for object's fields to create valid object using setters.
    }
}
