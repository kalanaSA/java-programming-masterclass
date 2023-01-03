package com.company;

public class Main {

    public static void main(String[] args) {

        StringBuilder wordOfNumber = NumberToWords.numberToWords(123);
        System.out.println("123 = " + wordOfNumber);

        System.out.println("1221 = " + NumberToWords.numberToWords(1221));
        System.out.println("2002 = " + NumberToWords.numberToWords(2002));
        System.out.println("2020 = " + NumberToWords.numberToWords(2020));
        System.out.println("4200 = " + NumberToWords.numberToWords(4200));
        System.out.println("3000 = " + NumberToWords.numberToWords(3000));

    }
}
