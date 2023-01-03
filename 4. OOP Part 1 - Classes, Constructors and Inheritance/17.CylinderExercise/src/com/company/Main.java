package com.company;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("Radius of circle = " + circle.getRadius());
        System.out.println("Area of circle = " + String.format("%.2f", circle.getArea()));

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Height of cylinder = " + cylinder.getHeight());
        System.out.println("Radius of cylinder = " + cylinder.getRadius());
        System.out.println("Area of cylinder = " + String.format("%.2f", cylinder.getArea()));
        System.out.println("Volume of cylinder = " + String.format("%.2f", cylinder.getVolume()));

    }
}
