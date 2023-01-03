package com.company;

public class Main {

    public static void main(String[] args) {

        /* parse the values from string - convert string into a some other (number) data type. eg:number string into an int.
         * one use case is where we might need to convert number string is when reading input from the user(by been entered
           into a console(read these using Scanner class) or after being retrieved from user interface).
         * goal is to convert piece of number string/text into a number. we use parse methods(static methods) in wrapper
           classes for primitive data types. */

        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        //parsing is useful when we need to convert string into a number in order to use that number to perform calculations.
        numberAsString += 1;  //if we try to add a number to a string java will automatically convert int value into a string & then concatenate these two strings.can't perform calculations.
        number += 1; //can be performed calculations, because it's an int value now not a string.

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        /* parse methods only can convert number string(2018) into a some other data type. can't convert string(2018a) into
        a some other data type. if we try to convert string java will throw numberFormatException indicating format isn't
        correct. if we did it accidentally we can handle that by handling actual exception or create our own class as an
        alternative. */

        numberAsString = "1220.125";
        double doubleNumber = Double.parseDouble(numberAsString);

        System.out.println(numberAsString);
        System.out.println(doubleNumber);

        doubleNumber += 12.56;
        numberAsString += 12.56;

        System.out.println(numberAsString);
        System.out.println(doubleNumber);

        //there are similar parsing process that can be used for other types like float/long.

    }
}
