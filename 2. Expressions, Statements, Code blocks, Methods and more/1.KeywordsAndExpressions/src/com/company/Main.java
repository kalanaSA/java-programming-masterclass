package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        * keyword - in java we have predefined 53 reserved keywords. we can't use keywords for naming variables, methods
        etc. & we have to use keywords in correct order.

        * expressions - are building blocks for all java programs.expressions builds with combining literals, variables,
        operators, method callings.

        double kilometres = (100 * 1.609344);
        expression - kilometres = (100*1.609344)  data type doesn't form part of expression
        statement - double kilometres =(100*1.609344); with data type & semicolon it's a valid statement
        */

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("this is an expression");
        }

        /*
         expressions - highScore = 50, highScore == 50, "this is an expression" (method call)
         statements - int highScore = 50; , if(highScore == 50){
                                                System.out.println("this is an expression");
                                             }
        */


    }
}
