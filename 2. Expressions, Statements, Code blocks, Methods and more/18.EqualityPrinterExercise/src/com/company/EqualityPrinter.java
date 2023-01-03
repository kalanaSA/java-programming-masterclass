package com.company;

public class EqualityPrinter {

    public static void printEqual(int firstNum, int secondNum, int thirdNum) {

        if (firstNum < 0 || secondNum < 0 || thirdNum < 0) {
            System.out.println("Invalid parameter");
        }

        String message = "Neither all are equal or different";
        if ((firstNum == secondNum) && (secondNum == thirdNum)) {
            message = "All numbers are equal";
        } else if (firstNum != secondNum && secondNum != thirdNum && firstNum != thirdNum) {
            message = "All numbers are different";
        }
        System.out.println(message);

    }


}
