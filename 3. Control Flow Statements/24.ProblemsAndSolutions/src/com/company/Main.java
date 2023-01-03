package com.company;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //add some logic & validations for previous programme.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year : ");
        //checks to see if the next input entered is an integer number. however it'll not remove entered value from the scanner.
        // it'll ask the user for input and check to see if it qualifies as an int, if it is then method will return true or not
        // then return false only.
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthYear = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();

            int currentYear = Year.now().getValue();
            int age = currentYear - birthYear;

            if (age >= 0 && age <= 100) {
                System.out.println("hey " + name + " your age is now " + age);
            } else {
                System.out.println("Invalid year of birth");
            }

        } else {
            System.out.println("please enter number string for year of birth/unable to parse year of birth");
        }

        scanner.close();
    }


}
