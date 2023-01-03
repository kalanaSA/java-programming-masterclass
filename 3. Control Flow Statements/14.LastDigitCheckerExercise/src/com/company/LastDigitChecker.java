package com.company;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int firstValue, int secondValue, int thirdValue) {

        if (!isValid(firstValue) || !isValid(secondValue) || !isValid(thirdValue)) {
            return false;
        }

        int lastDigitOfFirstValue = firstValue % 10;
        int lastDigitOfSecondValue = secondValue % 10;
        int lastDigitOfThirdValue = thirdValue % 10;

        return lastDigitOfFirstValue == lastDigitOfSecondValue || lastDigitOfSecondValue == lastDigitOfThirdValue ||
                lastDigitOfFirstValue == lastDigitOfThirdValue;
    }

    public static boolean isValid(int value) {
        return (value > 9) && (value < 1001);
    }

}
