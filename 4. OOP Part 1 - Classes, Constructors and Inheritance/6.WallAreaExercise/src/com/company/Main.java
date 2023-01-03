package com.company;

public class Main {

    public static void main(String[] args) {

        //set initial values for the object's fields using setters.
        Wall wall2 = new Wall();
        wall2.setHeight(5.5);
        wall2.setWidth(8.1);
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getWidth());
        System.out.println("area of wall = " + wall2.getArea());
        System.out.println("-------------------------------");

        //set initial values for object's fields using constructor easily.
        Wall wall3 = new Wall(5.5, 8.1);
        System.out.println(wall3.getHeight());
        System.out.println(wall3.getWidth());
        System.out.println("area of wall = " + wall3.getArea());
        System.out.println("-------------------------------");

        //create object using no args/empty constructor & then default values will be add to the fields of object.
        //because we called all args constructor with default values within no args constructor.
        Wall wall4 = new Wall();
        System.out.println(wall4.getHeight());
        System.out.println(wall4.getWidth());
        System.out.println("area of wall = " + wall4.getArea());
        System.out.println("-------------------------------");


    }
}
