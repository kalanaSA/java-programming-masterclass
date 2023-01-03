package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("width of rectangle = " + rectangle.getWidth());
        System.out.println("length of rectangle = " + rectangle.getLength());
        System.out.println("Area of rectangle = " + rectangle.getArea());
        System.out.println("...........................................");

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("width of cuboid = " + cuboid.getWidth());    //derived from Rectangle
        System.out.println("length of cuboid = " + cuboid.getLength());  //derived from Rectangle
        System.out.println("height of cuboid = " + cuboid.getHeight());  //specific to cuboid
        System.out.println("Area of cuboid = " + cuboid.getArea());      //derived from Rectangle & override in cuboid
        System.out.println("Volume of cuboid = " + cuboid.getVolume());  //specific to cuboid

    }
}
