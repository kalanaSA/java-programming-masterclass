package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(toMilesPerHour1(-1));
        System.out.println(toMilesPerHour2(7));
        System.out.println(toMilesPerHour3(7));
        System.out.println(toMilesPerHour4(7));
        System.out.println(toMilesPerHour5(7));
        System.out.println(toMilesPerHour6(7));
        System.out.println(toMilesPerHour7(7));
        System.out.println(toMilesPerHour8(0));
        System.out.println(toMilesPerHour8(7));

    }

    public static double toMilesPerHour1(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            kilometersPerHour = -1;
        } else if (kilometersPerHour == 0) {
            kilometersPerHour = 0;
        }
        return kilometersPerHour;
    }

    public static long toMilesPerHour2(double kilometersPerHour) {  //same

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }

    public static long toMilesPerHour3(double kilometersPerHour) { //same

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static long toMilesPerHour4(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            System.out.println("print else");  //when if statement return something & else statement will not return anything we have
            // to return something after if-else block. & when if condition will false both else and return statement will be executed.
        }

        return 0;
    }

    public static long toMilesPerHour5(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour == 0) {
            System.out.println("print else if");
        }

        return 0; //act as an else
    }

    public static long toMilesPerHour6(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour == 0) {
            System.out.println("print else if");
        } else {
            System.out.println("print else");
        }
        return 0;
    }

    public static long toMilesPerHour7(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour == 0) {
            System.out.println("print else if");
        } else {
            System.out.println("print else");
            return 0;
        }
        return 0; //for else if
    }

    public static long toMilesPerHour8(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("print if");
        } else if (kilometersPerHour == 0) {
            System.out.println("print else if");
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

        return 0; //this will execute only above if or else if conditions were true. if all above conditions were false &
        // else triggered this will not execute.
    }


}
