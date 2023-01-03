package com.company;

public class Main {

    public static void main(String[] args) {

        //String (sequence of characters, 32 bit width) ----------------------------------------------------------------

        // String is data type but not a primitive data type it's actually a class(but not like regular class).
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);

        String numberString = "25.12";
        numberString = numberString + "45.25";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //when you add numeric value to a string it treated as a text & append that to a string.
        System.out.println("lastString is equal to " + lastString);

        double myDouble = 120.45d;
        lastString = lastString + myDouble;
        System.out.println("lastString is equal to " + lastString);

        /*
         * Strings in java are immutable(you can't change String after it created) - what happen then when we change string
         * is discard previous string and create new string by java with previous value and new value combined.
         */

        /*
         * what we use to append strings in above are quite inefficient & not recommended. better way to do that is use StringBuffer(later).
         */

        /*
         * String has more advance features(all sort of things) like insert characters at specific positions, append characters, delete
         * characters etc(later)
         */

        /*
         * classes are the our own data types we can create, consist with different in build java data types.
         */

    }
}
