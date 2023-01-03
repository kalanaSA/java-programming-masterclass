package com.company;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int copyNumber = number;
        int sum = 0;

        while (number > 1) {   //(number > 0) X because we decrement the number again next below.
            number--;         //iterator put first because we have to exclude the number itself.
            if (copyNumber % number == 0) {
                sum += number;
            }
        }

        System.out.println("number:" + copyNumber + " , sum:" + sum);
        return sum == copyNumber;

    }

}

/*
 *In number theory, a perfect number is a positive integer that is equal to the sum of its positive divisors, excluding
 * the number itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.
 */
