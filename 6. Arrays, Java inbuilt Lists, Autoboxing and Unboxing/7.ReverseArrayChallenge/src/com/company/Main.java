package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] originArray = {1, 2, 3, 4, 5};   //initialize array ahead of time that declare array.
        System.out.println("origin array : " + Arrays.toString(originArray));
        //reverse(originArray);
        reverse(originArray);
        System.out.println("reversed array : " + Arrays.toString(originArray));

        //originArray = {6, 7, 8, 9, 10, 11, 12, 13};  X Array initializer is not allowed here.
        originArray = new int[]{6, 7, 8, 9, 10, 11, 12, 13};  //dereference & assign new array with initialize values to the previous array reference.
        System.out.println("origin array : " + Arrays.toString(originArray));
        reverse(originArray);
        System.out.println("reversed array : " + Arrays.toString(originArray));

        int value = 4;
        test(value);
        System.out.println(value);
    }

    public static void test(int a) {
        a = a * 10;
    }

    /*way 1 : swap elements on same array to reversed that array. each element swap with its mirror elements.
    if we make any change to the parameter reference(array) it'll effect to the origin reference(because both references
    point to the same array). can't expect this behavior from value types. */
    private static void reverse(int[] array) {
        int maxIndex = (array.length - 1);
        int halfArray = (array.length / 2);
        for (int i = 0; i < halfArray; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    /* way 2: create new reversed array from previous array.
    private static void reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = (array.length - 1);
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[maxIndex];
            maxIndex--;
        }
        System.out.println("reversed array : " + Arrays.toString(reversedArray));
    }
     */

}
