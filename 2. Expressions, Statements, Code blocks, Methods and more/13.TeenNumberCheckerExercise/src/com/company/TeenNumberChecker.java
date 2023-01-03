package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber) {

        if (isTeen(firstNumber) || isTeen(secondNumber) || isTeen(thirdNumber)) {
            return true;
        }
        return false;

    }

    public static boolean isTeen(int number) {
        return number > 12 && number < 20; //simplified if
    }

}
