package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(5);
        printArray(myIntArray);
        System.out.println("....................");
        int[] sortedArray = sortIntegers(myIntArray);
        printArray(sortedArray);

    }

    public static int[] getIntegers(int number) {
        int[] array = new int[number];
        System.out.println("Enter " + number + " values ..............");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " value " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    //    public static int[] sortIntegers(int[] array) {
    //
    //        int[] sortedArray = new int[array.length];
    //        for (int i = 0; i < sortedArray.length; i++) {
    //            sortedArray[i] = array[i];
    //        }
    //
    //        boolean flag = true;
    //        while (flag) {
    //            flag = false;
    //
    //            for (int i = 0; i < sortedArray.length - 1; i++) {
    //                if (sortedArray[i] < sortedArray[i + 1]) {
    //                    int temp = sortedArray[i];
    //                    sortedArray[i] = sortedArray[i + 1];
    //                    sortedArray[i + 1] = temp;
    //                    flag = true;
    //                }
    //            }
    //        }
    //        return sortedArray;
    //    }

}