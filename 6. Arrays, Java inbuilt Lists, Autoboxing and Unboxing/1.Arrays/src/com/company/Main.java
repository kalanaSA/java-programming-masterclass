package com.company;

import java.util.Arrays;
import java.util.Scanner;

/* standard variables : is data structures that can hold only a single value.
 * Arrays : is data structure that allows you to store sequence of values that all the same data type into a single variable.
   this actually works for all primitive types and even objects like String.
 * arrays are zero indexed: an array with n elements is indexed from 0 to n-1, Ex: 10 elements index range is from 0 to 9.
   index starts at zero & ends at length least one. indexes can't be minus values.
 * if we try to access index that is out of range java will give us an 'ArrayIndexOutOfBoundException', which indicates
   that the index is out of range in other words out of bounds.
 * to access array elements we use the square braces [index], and also known as array access operator.
 * the 'new' operator/keyword is used to create a new array and initialize the array elements to their default values.
   for an int array default initialize values are zeros, for boolean false & for String or other objects that would be null.
 * when we declare an array we have to define size of array also directly or indirectly & we can't change size of an array
   after declare(allocate sequence of adjacent memory locations when we declare an array, we can't resize it later)  */
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myVariable = 50;

        //declare & initialize array with default values(zero,null,false).
        int[] myIntArray1;
        myIntArray1 = new int[10]; //define number of element(size) we want to assign to this array in square brackets.

        int[] myIntArray2 = new int[10];
        myIntArray2[0] = 14;
        myIntArray2[1] = 2;
        myIntArray2[5] = 8;

        int element1 = myIntArray2[1];
        System.out.println(element1);
        System.out.println(myIntArray2[1]);

        double[] myDoubleArray = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(myDoubleArray));
        /* we can also initialize array with values in the same line(inline) by using array initializer block{} if we know
        ahead of time the values we want actually save in array, and indirectly we told to java how many elements are in
        this array. aka anonymous array.
        myDoubleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; X and this way is only applicable the first time we define the array.
        myDoubleArray[11] = 4;  - Index 11 out of bounds for length 5
        System.out.println(myDoubleArray);  */

        //but this way we can change initialized/defined array later. dereference myDoubleArray & assign to a new array with initial values or not.
        myDoubleArray = new double[4];
        myDoubleArray = new double[]{11, 22, 33, 44, 55, 66};
        System.out.println(Arrays.toString(myDoubleArray));

        /* another way to initialize, if you've got some sort of formula to let you know ahead of time that you can actually
        use to assign to the particular element in the array. */
        int[] myIntArray3 = new int[10];
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }
        for (int i = 0; i < myIntArray3.length; i++) {
            System.out.println("element " + i + " value " + myIntArray3[i]);
        }
        printArray(myIntArray3);

        //real life use of array --------------------------------------------
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        double averageOfArray = getAverage(myIntegers);
        System.out.println("average of my integers array = " + averageOfArray);

    }

    //we can pass arrays to a methods as parameters just like variables.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + " value " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " values...................................... \r");
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

}