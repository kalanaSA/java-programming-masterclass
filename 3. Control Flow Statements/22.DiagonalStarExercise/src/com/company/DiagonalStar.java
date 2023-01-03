package com.company;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < number; i++) { //rows

            for (int j = 0; j <= i; j++) {  //columns
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
