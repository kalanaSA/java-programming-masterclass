package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {

        if (firstNumber < 10 || secondNumber < 10) {
            return false;
        }

        while (firstNumber > 0) {
            int lastDigitOfFirstNumber = firstNumber % 10;
            int originSecondNumber = secondNumber;

            while (originSecondNumber > 0) {
                int lastDigitOfSecondNumber = originSecondNumber % 10;
                if (lastDigitOfSecondNumber == lastDigitOfFirstNumber) {
                    return true;
                }
                originSecondNumber /= 10;
            }

            firstNumber /= 10;
        }

        return false;
    }


}
