package com.company;

public class DigitSum {

    public static int digitSum(int number) {

        if (number < 10) { //remove negative numbers & 1 digit values
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int leastSignificantDigit = number % 10;
            sum += leastSignificantDigit;
            number /= 10; //iteration step
        }

        return sum;
    }

}

/*
 * hints:
 * n%10 - extract least significant digit
 * n= n/10 - discard least significant digit
 * */