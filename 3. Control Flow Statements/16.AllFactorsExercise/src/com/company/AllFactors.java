package com.company;

public class AllFactors {

    public static void findAllFactors(int number) {
        if (number < 0) {
            System.out.println("invalid parameter");
        }

        int copyNumber = number;
        while (number > 0) {
            if (copyNumber % number == 0) {
                System.out.println(number);
            }
            number--;
        }

    }

}
