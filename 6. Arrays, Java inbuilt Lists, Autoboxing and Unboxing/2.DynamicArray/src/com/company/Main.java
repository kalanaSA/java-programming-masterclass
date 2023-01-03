package com.company;

import java.util.Scanner;

/* resizing array with preserving data that's actually in the existing array.
 * this way would get quite unwieldy if we have to continually resize the array, it would be quite tedious to implement
   all the time you'd be continually having to copy all those elements so, it wouldn't be the case where you've got lots
   of elements, it wouldn't be very productive to do that.so there has to be a better way of actually resizing arrays.
   so java introduced concept of list and also an arraylist as a solution.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        getInput();
        printArray();
        resizeArray(12);
        baseData[10] = 11;
        baseData[11] = 12;
        printArray();
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            System.out.print("enter value " + (i + 1) + " : ");
            baseData[i] = scanner.nextInt();
        }
    }

    private static void printArray() {
        for (int i = 0; i < baseData.length; i++) {
            System.out.print(baseData[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray(int numOfElements) {
        int[] original = baseData;
        baseData = new int[numOfElements]; //dereference baseData reference from previous array & assign memory address of new array.

        for (int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }

}
