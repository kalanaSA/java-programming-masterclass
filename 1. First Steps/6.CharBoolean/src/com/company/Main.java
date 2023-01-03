package com.company;

public class Main {

    public static void main(String[] args) {

        //char (16 bits/2 byte width)-----------------------------------------------------------------------------------

        /*
         * one character/symbol/digit = 1 byte(8 bits)/1 digit
         * char can have only one character, but its width is 2 byte. reason for that is a single byte doesn't allow
         * to store unicode characters. then char can have both regular characters or unicode characters.
         */
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightUnicodeChar = '\u00A9';

        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightUnicodeChar);


        //boolean (in java boolean primitive data type can be true or false only)---------------------------------------
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
