package com.company;

public class Main {

    public static void main(String[] args) {

        // dataType variableName = optionally initialValue;

        int firstNumber; //define variable
        firstNumber = 5; //initialize variable

        int secondNumber = 10; //define & initialize variable (this is a declaration statement)

        //value can be literal or expression
        int thirdNumber = 2; //literal
        int fourthNumber = (5 + 2) + (2 * 10);  //literals with operators
        int fifthNumber = thirdNumber + fourthNumber;  //expression
        System.out.println("thirdNumber is " + fifthNumber);

        fifthNumber = fifthNumber / 2; //variable content can be keep change(after initialize)

    }
}
