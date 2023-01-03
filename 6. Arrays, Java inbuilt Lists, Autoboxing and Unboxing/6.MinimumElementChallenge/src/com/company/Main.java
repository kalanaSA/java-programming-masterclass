package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    /* By setting scanner as a static field, other static methods be able to access this field directly(can't access non-static
     contexts inside the static contexts). in other words the static methods can use scanner without creating separate
     instances of that class. set private to restrict access from another class respect to encapsulation(hide the internal
     workings of a class from outside classes/code to create more controlled & valid object from class)  */

    public static void main(String[] args) {
        System.out.print("Enter count of integers : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min of integer array is : " + returnedMin);
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("enter number " + (i + 1) + " : ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                array[i] = scanner.nextInt();
            } else {
                System.out.println("invalid input!");
                i--;
            }
            scanner.nextLine(); /*handle enter key being pressed once we've entered the number, after adding this we can
            continue to enter more numbers, so we're avoiding the problem that will happen if we don't do that. */
        }
        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(array[i], min);
            //min = (array[i]<min)? array[i]:min;
        }
        return min;
    }

}
