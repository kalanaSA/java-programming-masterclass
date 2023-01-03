package com.company;

public class Cuboid extends Rectangle {

    private double height;

    //constructor for initialize values for object's fields/class fields. no setters in this case for change values after initialize
    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = height;
    }

    //Rectangle.getArea() method derived to this sub class after extends base class. but cuboid area is different from rectangle
    //area. so we have to override it in here/cuboid class/sub class.
    @Override
    public double getArea() {
        //return super.getArea();
        return (super.getArea() * 2) + (2 * height * (getWidth() + getLength()));
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    public double getHeight() {
        return height;
    }

}
