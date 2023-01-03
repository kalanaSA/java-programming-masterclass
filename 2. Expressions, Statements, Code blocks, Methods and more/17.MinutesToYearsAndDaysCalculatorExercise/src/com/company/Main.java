package com.company;

public class Main {

    public static void main(String[] args) {

        String duration = MinutesToYearsAndDaysCalculator.minutesToYearsAndDays(207407340);
        System.out.println(duration);

        String duration1 = MinutesToYearsAndDaysCalculator.minutesToYearsAndDays(3456789, 0);
        System.out.println(duration1);

        String duration2 = MinutesToYearsAndDaysCalculator.minutesToYearsAndDays(3456789, 59);
        System.out.println(duration2);

        String duration3 = MinutesToYearsAndDaysCalculator.minutesToYearsAndDays(3456789, 60);
        System.out.println(duration3);

    }
}
