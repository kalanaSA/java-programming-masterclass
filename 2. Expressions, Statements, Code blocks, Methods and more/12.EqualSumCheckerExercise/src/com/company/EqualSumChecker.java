package com.company;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {

        if (firstNumber + secondNumber == thirdNumber) {
            return true;
        }

        return false;

        //return firstNumber + secondNumber == thirdNumber;
    }

}
