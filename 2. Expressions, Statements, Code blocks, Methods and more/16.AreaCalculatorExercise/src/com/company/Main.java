package com.company;

public class Main {

    public static void main(String[] args) {

        double areaOfRectangle = AreaCalculator.Area(3, 5);
        System.out.println(areaOfRectangle);

        double areaOfCircle = AreaCalculator.Area(2.45);
        System.out.println(areaOfCircle);

        double areaOfCircle1 = AreaCalculator.Area(-2.45);
        if (areaOfCircle1 < 0d) {
            System.out.println("Invalid parameters");
        }

    }
}
