package com.company;

public class Main {

    public static void main(String[] args) {

        int sumOfDigits = DigitSum.digitSum(12);
        String sum = sumOfDigits < 0 ? "Invalid Parameter" : "sum of digits = " + sumOfDigits;
        System.out.println(sum);

        sumOfDigits = DigitSum.digitSum(456);
        sum = sumOfDigits < 0 ? "Invalid Parameter" : "sum of digits = " + sumOfDigits;
        System.out.println(sum);

        sumOfDigits = DigitSum.digitSum(-125);
        sum = sumOfDigits < 0 ? "Invalid Parameter" : "sum of digits = " + sumOfDigits;
        System.out.println(sum);
    }
}
