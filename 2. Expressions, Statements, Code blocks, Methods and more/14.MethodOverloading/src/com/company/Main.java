package com.company;

public class Main {

    public static void main(String[] args) {

        int score = calculateScore("kalana", 500);
        int score1 = calculateScore(1000);
        int score2 = calculateScore();

        //challenge ----------------------------------------
        double centimeters = calcFeetAndInchesToCentimeters(25);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameter!");
        }

        double centimeters1 = calcFeetAndInchesToCentimeters(0, 8);
        if (centimeters1 < 0.0) {
            System.out.println("Invalid feet or inches parameters");
        }
//        calcFeetAndInchesToCentimeters(5, 0);
//        calcFeetAndInchesToCentimeters(5, 4);

    }

    /*
       * method overloading is a feature that allow us to have more than one method with same name, using different
         parameter signature/unique method signature(different number of parameters or parameters with different data types)
       * it's the ability to create multiple methods of the same name with different implementations.
       * calls to an overloaded method will run a specific implementation of that method.
       * it improves code readability & re-usability
       * it's easier to remember one method name instead of remembering multiple names.
       * achieve consistency in naming. one name for *methods that are commonly used for*. example println
         System.out.println("test");  System.out.println(12);  System.out.println(24.25);
       * over loaded methods give programmers the flexibility to call a similar method with different types of data.
     */
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no score");
        return 0;
    }
    /* unique method signature means unique parameter signature, data type of return type won't work.
    public static void calculateScore() {
        System.out.println("No player name, no score");
    }
    */

    // challenge -------------------------------------------------------------------------------------------------------
    /*
    1 feet = 12inch
    1 inch = 2.54cm
    */
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0.0) || (inches < 0.0) || (inches > 11.0)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimetres = (feet * 12) * 2.54;
        centimetres += (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimetres + "cm");
        return centimetres;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0.0) {
            System.out.println("Invalid inches parameter");
            return -1;
        }

        //convert inches to feet & inches. in this method accept any number of inches unlike above method that accept only 11 inches.
        double feet = (int) (inches / 12);
        double remainingInches = inches % 12;
        System.out.println(inches + " inches equals to " + feet + " feet & " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

}