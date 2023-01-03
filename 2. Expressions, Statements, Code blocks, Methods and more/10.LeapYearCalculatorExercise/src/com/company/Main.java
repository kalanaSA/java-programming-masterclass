package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean isLeapYear = LeapYearCalculator.isLeapYear(2020);
//        boolean isLeapYear = LeapYearCalculator.isLeapYear(-1);
        boolean isLeapYear = LeapYearCalculator.isLeapYear(2015);

        if (isLeapYear) {
            System.out.println("leap year");
        } else {
            System.out.println("not a leap year");
        }

    }
}
