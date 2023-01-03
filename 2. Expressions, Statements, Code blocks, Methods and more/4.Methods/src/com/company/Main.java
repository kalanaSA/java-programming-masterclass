package com.company;

public class Main {

    public static void main(String[] args) {
        /*
         * methods make lot easier to maintain code, because we've got only one place to modify our code.
         * a parameter - datatype and variable name that we define inside the parentheses when we're setting up a method.
         * an argument - an actual value we give inside the parentheses when we're calling the method.
         */
        print();

        System.out.println(returnPrint());
        //or
        String returnString = returnPrint();
        System.out.println(returnString);

        calculateCircumference(5.00);
        //or
        double radius = 12.00;
        calculateCircumference(radius);

        System.out.println(subtraction(6.00, 2.00));
        //or
        double num1 = 6.00;
        double num2 = 3.00;
        double sub = subtraction(num1, num2);
        System.out.println(sub);

        //challenge --------------------------
        boolean isGameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println(calculateScore(isGameOver, score, levelCompleted, bonus));

        int savedScore = calculateScore1(false, 5000, 5, 100);
        if (savedScore == -1) {
            System.out.println("game is not over");
        } else {
            System.out.println(savedScore);
        }

    }

    //method without parameters & without return type
    public static void print() {
        System.out.println("method without parameters & without return type");
    }

    //method without parameters & with return type
    public static String returnPrint() {
        String quote = "method without parameters & with return type";
        return quote;
    }

    //method with parameters & without return type
    public static void calculateCircumference(double radius) {
        double pi = 3.14d;
        double circumference = 2 * pi * radius;
        System.out.println("circumference is " + circumference);
    }

    //method with parameters & with return type
    public static double subtraction(double value1, double value2) {
        double sub = value1 - value2;
        return sub;
    }

    // challenge -------------------------------------------------------------------------------------------------------
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        } else {
            return -1;
        }
        // return -1; or

        //all program variations have to be accounted for, and we've got to return something everytime if we specify that
        // we are going to be returning data. (also you have return something even if condition isn't true)
        //in programming terms -1 is conventionally used for indicate an error. in algorithms -1 indicate invalid value or
        // value not found.

    }

    public static int calculateScore1(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = -1;
        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return finalScore;
    }

}
