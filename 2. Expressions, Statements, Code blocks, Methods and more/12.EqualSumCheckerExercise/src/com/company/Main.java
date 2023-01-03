package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean hasEqual = EqualSumChecker.hasEqualSum(5, 4, 9);
//        boolean hasEqual = EqualSumChecker.hasEqualSum(5, 4, 10);
        boolean hasEqual = EqualSumChecker.hasEqualSum(-5, -4, -9);

        if (hasEqual) {
            System.out.println("sum of first number & second number equal to third number");
        } else {
            System.out.println("sum of first number & second number not equal to third number");
        }
    }
}
