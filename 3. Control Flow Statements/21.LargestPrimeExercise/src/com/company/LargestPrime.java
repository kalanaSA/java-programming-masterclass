package com.company;

public class LargestPrime {

    public static int findLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int divisor = number;

        while ((number % divisor != 0) || !(isPrimeNumber(divisor))) { //while (!((number % divisor == 0) && (isPrimeNumber(divisor))))
            divisor--;
        }
        return divisor;

//        int largestPrimeFactor = 0;
//        while (divisor > 0) {
//            boolean isPrimeNumber = isPrimeNumber(divisor);
//            if (number % divisor == 0 && isPrimeNumber) {
//                largestPrimeFactor = divisor;
//                break;
//            }
//            divisor--;
//        }
//        return largestPrimeFactor;

    }

    public static boolean isPrimeNumber(int number) {

        //prime number should be whole number greater than
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
