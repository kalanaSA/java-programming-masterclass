package com.company;

import java.util.Scanner;

public class MaxAndMin {

    public static void findMaxAndMin() {

        //MAX_VALUE & MIN_VALUE are constants in Integer class. every primitive numeric type has these MAX_VALUE & MIN_VALUE
        // constants in their respective wrapper class.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);

        while (true) {  //endless loop/loop that doesn't complete/infinite loop

            System.out.println("Enter number : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                min = Math.min(number, min);
                max = Math.max(number, max);

            } else {
                //System.out.println("Invalid Input!");
                break; //way to exit infinite loop
            }

        }

        scanner.close(); //handle input (enter key)
        System.out.println("min = " + min + ", max = " + max);


//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        boolean first = true;
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter number : ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                scanner.nextLine();
//                if (first) {  //this if-statement execute once & set first number that we entered for both min & max.
//                    first = false;
//                    min = number;
//                    max = number;
//                }
//                min = (number < min) ? number : min;
//                max = (number > max) ? number : max;
//
//            } else {
//                System.out.println("Invalid Input!");
//                break;
//            }
//
//        }
//
//        scanner.close();
//        System.out.println("min = " + min + ", max = " + max);
    }


}
