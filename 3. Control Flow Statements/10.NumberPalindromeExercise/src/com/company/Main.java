package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 12321;
        boolean isPalindrome = NumberPalindrome.isNumberPalindrome(number);
        System.out.println(number + " is palindrome : " + isPalindrome);

        number = 453;
        isPalindrome = NumberPalindrome.isNumberPalindrome(number);
        System.out.println(number + " is palindrome : " + isPalindrome);

        number = 11;
        isPalindrome = NumberPalindrome.isNumberPalindrome(number);
        System.out.println(number + " is palindrome : " + isPalindrome);

        number = 1330;
        isPalindrome = NumberPalindrome.isNumberPalindrome(number);
        System.out.println(number + " is palindrome : " + isPalindrome);

        number = 10;
        isPalindrome = NumberPalindrome.isNumberPalindrome(number);
        System.out.println(number + " is palindrome : " + isPalindrome);

    }
}
