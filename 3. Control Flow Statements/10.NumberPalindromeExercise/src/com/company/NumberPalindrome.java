package com.company;

public class NumberPalindrome {

    public static boolean isNumberPalindrome(int number) {

        if (number < 10) {
            return false;
        }

        int reverseNumber = 0;
        int copyNumber = number;

        while (number != 0) {
            int leastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + leastDigit; //reverseNumber = number < 10 ? (reverseNumber + leastDigit) : (reverseNumber + leastDigit) * 10;
            number /= 10;
        }

        return copyNumber == reverseNumber;
    }

}
