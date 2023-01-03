package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MoreAboutRefAndValueTypes {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //reference types - refer using object reference variables (Classes, String, Arrays) ---------------------------
        int[] myIntArray = {1, 2, 3, 4, 5};

        //int[] sortedArray = sortIntegers(myIntArray);
        //Arrays.toString(sortedArray);

        sortIntegers(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

        //value types - refer using primitive variables (Primitive data types) -----------------------------------------
        double salary = 5000;

        //double netSalary = addBonus(basicSalary);
        //System.out.println(netSalary);

        addBonus(salary);
        System.out.println(salary);

    }


    /* reference types -------------------------------------------------------------------------------------------------
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
    */


    public static void sortIntegers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = (i + 1); j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

    /* value types -----------------------------------------------------------------------------------------------------
    public static double getNetSalary(double basic) {
        return basic += (basic / 100.0) * 1.5;
    }
    */

    public static void addBonus(double basic) {
        basic += (basic / 100.0) * 1.5;
    }

}
