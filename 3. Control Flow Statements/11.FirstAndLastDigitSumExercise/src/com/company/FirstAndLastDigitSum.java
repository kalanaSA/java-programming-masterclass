package com.company;

public class FirstAndLastDigitSum {

    public static int firstAndLastDigitSum(int number) {

        if (number < 10) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }

        return lastDigit + number;

//        int lastDigitOfOriginNUmber = number % 10;
//        int reverseNumber = 0;
//
//        while (number != 0) {
//            int lastDigit = number % 10;
//            reverseNumber = (reverseNumber * 10) + lastDigit;
//            number /= 10;
//        }
//
//        int firstDigit = reverseNumber % 10;
//        return firstDigit + lastDigitOfOriginNUmber;

    }

}
