package com.company;

public class Main {

    public static void main(String[] args) {

        //to call a method of class from another class, we have to write the class name & then the period & method name.
        SpeedConverter.printConversion(7.50);

        long miles = SpeedConverter.toMilesPerHour(7.50);
        if (miles < 0) {
            System.out.println("invalid parameter");
        } else {
            System.out.println(miles + " miles per hour");
        }

    }

}

/*
* main method is a method that will start your application/standard entry point for java to be able to run our code.
  the class that contain main method called main class.
* .java file can have only one public class & it should has same name as .java file name. other than that it can have
  non-public classes.
* <name>.java -> public class <name>{}  if not error: Class '<name>' is public, should be declared in a file named '<name>.java'
*/