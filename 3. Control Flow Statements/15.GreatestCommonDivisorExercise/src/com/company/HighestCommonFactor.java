package com.company;

public class HighestCommonFactor {

    public static int highestCommonFactor(int firstValue, int secondValue) {

        if (firstValue < 0 || secondValue < 0) {
            return -1;
        }

        int divisor = Math.min(firstValue, secondValue);
        while (firstValue % divisor != 0 || secondValue % divisor != 0) {
            divisor--;
        }
        return divisor;


//        another way 1:
//        int divisor = Math.min(firstValue, secondValue);
//        for (int i = divisor; i > 0; i--) {
//            if (firstValue % i == 0 && secondValue % i == 0) {
//                divisor = i;
//                break;
//            }
//        }
//        return divisor;

//        another way 2:
//        int gcd = 1;
//        for (int i = 2; (firstValue >= i || secondValue >= i); i++) {
//            gcd = (firstValue % i == 0 && secondValue % i == 0) ? i : gcd;
//        }
//        return gcd;

    }

}
