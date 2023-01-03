package com.company;

public class Rectangle {

    private double width;
    private double length;

    //constructor for initialize values for object's fields/class fields. no setters in this case for change values after initialize
    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0.0 : width;
        this.length = length < 0 ? 0.0 : length;
    }

    public double getArea() {
        return width * length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}

