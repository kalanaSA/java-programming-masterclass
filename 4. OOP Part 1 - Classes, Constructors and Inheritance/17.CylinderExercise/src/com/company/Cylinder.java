package com.company;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height < 0 ? 0.0 : height;
    }

    public double getVolume() {
        return super.getArea() * height;
        //return this.getArea() * height; or return getArea() * height; - if there is a no overridden version of 'getArea' method.
    }

    @Override
    public double getArea() {
        //return super.getArea();
        return (2 * super.getArea()) + (2 * Math.PI * getRadius() * height);
    }

    public double getHeight() {
        return height;
    }

}

/* use 'this' keyword to access this class states/behaviors & *derived(inherited) states/behaviors(not private) from base
   class also. this is optional, but useful in constructors & setters.
 * use 'super' keyword to access states/behaviors(not private) of base class, if there is a overridden version of behavior
   in this sub class.
 * if we didn't put 'super' keyword it'll first search for overridden version & if there isn't one then it'll call method
   inherited from super class. both overridden & derived method stay in sub class after extends super class.   */