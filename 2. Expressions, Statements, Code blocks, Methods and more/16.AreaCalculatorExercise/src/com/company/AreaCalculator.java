package com.company;

public class AreaCalculator {

    public static double Area(double length, double width) {
        if (length < 0d || width < 0d) {
            return -1;
        }
        return length * width;
    }

    public static double Area(double radius) {
        if (radius < 0d) {
            return -1;
        }
        return Math.PI * Math.pow(radius, 2);
    }

}
