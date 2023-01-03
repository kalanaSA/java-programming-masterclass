package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* goal - make interactive application.
         * Scanner is one of the java's inbuilt class that allow us to read user inputs/ we can parse(convert) primitive types
         * & strings using methods from this Scanner(nextLine(),nextInt()).
         * System.out.println - print text to the console.
         * System.in - allow you to type input into the console, which then gets returned back to the programme/ read inputs
         * using new keyword we're defining a variable of type Scanner/create instance of Scanner class/create new object
           of class Scanner.  */
        Scanner scanner = new Scanner(System.in);

        // String birthYearString = scanner.nextLine();
        // int birthYear = Integer.parseInt(birthYearString);
        System.out.println("Enter your birth year : ");
        int birthYear = scanner.nextInt(); //nextInt() - read & parse input string to integer/ Scanner use parseInt internally for us.
        scanner.nextLine(); //handle next line character(Enter key). after you reading a *number with a scanner there must be
        // nextLine() method call to handle the Enter key issue. if we didn't, it'll not give a chance to enter below input.

        System.out.println("Enter your name : ");
        String name = scanner.nextLine(); //nextLine() - read & parse input string to string.

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("hey " + name + " your age is now " + age);

        scanner.close(); //after we finished using Scanner we should close it using close() method. after closing Scanner,
        // calling Scanner methods cause errors. so before close Scanner ensure we're done with using scanner. then it
        // releases underlying memory that Scanner was using internally.
    }
}

/*
 * whenever we read a number from the scanner, being an int,float,double or some other type, we press the enter key on the
 * keyboard as we just did with the age above. so doing that ends the line. so it's recommended after a next Enter or call to
 * nextInt() to call nextLine() again without assigning it to a variable. i.e to handle the enter key issue we have to call
 * nextLine(). so scanner works as expected. now internally the scanner is checking for a line separator and when we hit Enter,
 * we're typing a line separator. so that's interpreted as input. when we reach the nextLine() method that retrieves/read the name,
 * the input for a name becomes enter, so is essentially skipped.
 */