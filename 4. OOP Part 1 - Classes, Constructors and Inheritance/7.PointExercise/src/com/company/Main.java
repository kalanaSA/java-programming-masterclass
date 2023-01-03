package com.company;

public class Main {

    public static void main(String[] args) {

        Point first = new Point(6, 5);
        System.out.println(first.distance());
        System.out.println(first.distance(4, 2));

        Point second = new Point(3, 1);
        System.out.println(first.distance(second));  //equal to System.out.println(first.distance(3, 1));

    }
}
