package com.company;

import jdk.jfr.Relational;

public class Main {

    public static void main(String[] args) {

        /*
         * operator - special symbols that perform specific operations on one or more operands, and then return result.
         * operand - term used to describe any object that manipulated by an operator. variables used instead of literals are also operands.
         * expression - formed by combining variables, literals, method return values and operators.
         * int myVariable = 5+2; operators(=,+) operands(5,2) expression(5+2)
         */

        //single assignment operator -----------------------------------------------------------------------------------
        int result = 0;

        //arithmetic operators (+ - * / %) -----------------------------------------------------------------------------
        result = 2 + 3;
        System.out.println("2+3=" + result);

        result = result - 1;
        System.out.println("5-1=" + result);

        result = result * 6;
        System.out.println("4*6=" + result);

        result = result / 2;
        System.out.println("24/2=" + result);

        result = result % 5;
        System.out.println("12%5=" + result);

        //abbreviating operators (+= -= *= /= ) ------------------------------------------------------------------------
        result += 8;
        System.out.println("2+=8 = " + result);
        result -= 2;
        System.out.println("10-=2 = " + result);
        result *= 4;
        System.out.println("8*=4 = " + result);
        result /= 3;
        System.out.println("32/=3 = " + result);

        //unary operators (+ - ++ -- !) --------------------------------------------------------------------------------
        //plus & minus operators
        int a = -3;
        a = +2;

        //pre increment & decrement
        result = ++a;
        System.out.println("++2 =" + result);

        result = --a;
        System.out.println("--3 =" + result);

        //post increment & decrement
        result = a++; //result =5 + a++;  result=7
        System.out.println("2++ = " + result);
        System.out.println("after operation a = " + a);

        result = a--; //result =5 + a--;  result=8
        System.out.println("3-- = " + result);
        System.out.println("after operation a = " + a);

        //Logical complement operator
        if (!false)
            System.out.println("true");


        //equality and relational operators(== != > < >= <=) with conditional operators(&& || ?:) ------------------------------------------

        /*
        * relational operators operate on literal or variable operands and check given condition is t or f then return boolean true or false
        * conditional/logical operators operate on boolean operands and check given conditions is t or f then return boolean true or false
        * in here we use those operators to perform some conditional statements(basic control flow statements like if-then or if-else)
        if(conditional expression that returns a boolean(t/f)){
            //code block/statements in here will execute if conditional expression will return true
         }
         code block - {statements}
        */

        boolean isAlien = false;
        if (isAlien == false) { //!isAlien
            System.out.println("it is not an alien!");
        }

        boolean isAbsent = false;
        double mark = 74;

        if (mark == 100) {
            System.out.println("You Got HighScore, congrats!");
        } else if (mark >= 75) {
            System.out.println("you got A grade!");
        } else if ((mark >= 65) && (mark < 75)) {
            System.out.println("you got B grade!");
        } else if ((mark >= 55) && (mark < 65)) {
            System.out.println("you got C grade!");
        } else if ((mark < 55) || (isAbsent != false)) {
            System.out.println("you are repeat!");
        }

        //assignment operator vs equals to operator
        int newValue = 50;
        if (newValue == 50) { // X if(newValue = 50)  condition on parentheses should return boolean t or f or value should be boolean(t or f)
            System.out.println("this is true");
        }

        boolean isCar = false; // it's happen but don't use
        if (isCar = true) {
            System.out.println("this is not supposed to happen");
        }

        if (isCar) {  //if(isCar==true) equals to
            System.out.println("this is car");
        }

        if (!isCar) {  //if(isCar!=true) or if(isCar==false) not equals to
            System.out.println("this is not a car");
        }

        //ternary operator(three operators = ? :)-----------------------------------------------------------------------

        //shortcut for one if then else statement(assigning one of two values to a variable depending on given condition)
        //variable = (condition-needs to return t/f) ? (assign value for variable if condition will true) : (assign value for variable if condition will false)

        boolean wasCar = isCar ? true : false;
        System.out.println("was a car : " + wasCar);

        String grade = (mark > 50) ? "A" : "B";
        System.out.println("you grade is : " + grade);

        //operator precedence challenge --------------------------------------------------------------------------------
        double myDouble1 = 20.00;
        double myDouble2 = 80.00;
        double theRemainder = ((myDouble1 + myDouble2) * 100.00) % 40.00;
        boolean isNoRemainder = (theRemainder == 0) ? true : false;

        System.out.println("isNoRemainder = " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }

        //Type Comparison Operator (instanceof) & Bitwise and Bit Shift Operators(~ << >> >>> & | ^) (later) -----------

    }
}
