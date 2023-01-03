package com.company;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(6, 8);
        //System.out.println(floor.getArea());
        Carpet carpet = new Carpet(12);
        //System.out.println(carpet.getCost());

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Total cost to cover floor with carpet = " + calculator.getTotalCost());

    }
}
