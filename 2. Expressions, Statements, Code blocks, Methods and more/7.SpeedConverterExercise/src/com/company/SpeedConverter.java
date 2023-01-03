package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);  /* also we can put this inside the else statement or leave as like this. however
         java consider this belongs to else. so this will only execute if all above condition(s) were not true. don't think
         this will execute anyway. if one of the above condition were true and also returned something this will not execute */

        /* (this will applicable when you put return statement in at least one if/elseif/else statement)
           when we create method with return type and use if, elseif, else statements, and think one of the condition was true
           then return something & elseif and else statements will not execute. but when you not specify else statement java will
           consider all the below code belongs to else statement. so they will not execute if one of the above condition was true and
           returned something.
           eg: when we have a 3 conditional statement(if,elseif) with return statements without else in method with return type,
           it's like 4 different methods.*/
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }

}

/*
 * Math is a class that contains many useful mathematical methods that you can use in your class. it's inbuilt & comes as
   a part of java(java.lang)
 * math.round() - round float or double value to long value(whole number).
 * instead of Math.round() to round value if we use type casting to return whole number(long), it'll not round value it'll
   just remove decimal points only.
   * 3.781 type casting to long = 3
   * 3.781 Math.round() = 4
 */