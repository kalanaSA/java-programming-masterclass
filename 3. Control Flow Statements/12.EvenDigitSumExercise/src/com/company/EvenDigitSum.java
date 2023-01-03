package com.company;

public class EvenDigitSum {

    public static final String INVALID_PARAMETER_MESSAGE = "invalid parameter";

    public static String evenDigitSum(int number) {

        if (number < 1) {
            return INVALID_PARAMETER_MESSAGE;
        }

        int originNumber = number;
        int evenDigitSum = 0;
        int oddDigitSum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            evenDigitSum += (lastDigit % 2 == 0) ? lastDigit : 0; //evenDigitSum = (lastDigit % 2 == 0) ? (evenDigitSum += lastDigit) : (evenDigitSum += 0);
            oddDigitSum += (lastDigit % 2 != 0) ? lastDigit : 0; //oddDigitSum = (lastDigit % 2 != 0) ? (oddDigitSum += lastDigit) : (oddDigitSum += 0);
            number /= 10;
        }

        return "even digit sum of " + originNumber + " = " + evenDigitSum + "\n " +
                "odd digit sum of " + originNumber + " = " + oddDigitSum;
    }


}
