package com.company;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) { //we can do validations in constructor also like in setters before assign values.
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return this.width * this.length;
    }

}

/* we can create & use both setters and constructors or only one from it according to our like/purpose. it doesn't matter.
 * we can do validations within both setters & constructors before assign values for object's fields. to create valid object finally.
 * both respect concept encapsulation.
 * we can initialize values for object's fields using both setters & constructors.
 * but setters can change a values of object's fields again after initialize.
 * when you have a more field, it's easy to initialize fields using constructor.  */