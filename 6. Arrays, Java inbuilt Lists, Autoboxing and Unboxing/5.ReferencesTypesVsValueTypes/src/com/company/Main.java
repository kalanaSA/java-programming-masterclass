package com.company;

import java.util.Arrays;

public class Main {

    /* value types - all the primitive types are value types, in other words they hold a value directly.
     * reference types - An arrays & classes are reference types. in other words they refer an address of value(array/object)
       in memory rather than hold data itself.     */

    public static void main(String[] args) {

        /* value types (when we created an int variable, a single space in memory is allocated to store the value of variable
        & that variable directly holds a value. now if we'll sign it to another variable the value is copied directly and then
        both variables work independently and each have their own copies of a specific value.)                          */
        int myIntValue = 5;
        int anotherIntValue = myIntValue; //copy value

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValues = " + anotherIntValue);

        anotherIntValue = 10;

        System.out.println("after changed myIntValue = " + myIntValue);
        System.out.println("after changed anotherIntValue = " + anotherIntValue);

        /* reference types(reference types are used by a reference. so a reference variables holds reference(an address to the
        object/array in memory) but not the object/array itself. with reference types we're using a reference to control the
        object in memory, so we can access the object directly. so a reference is like an address of some objects in memory.
        one way to know it's a reference type is 'new' operator, because that creates a new object in memory)           */
        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray; /* copy memory address of myIntArray(reference) rather than value of itself - declaring
        another reference & point/refer it to the same array in memory. so now we got 2 references pointing to the same array in memory.
        both myIntArray & anotherIntArray holds the same memory address. */


        /*toString() is a useful static method from the class Arrays which is build into java to print arrays. toString() method converts
        element of array into string and return new string with every element separate by commas. we can print whole array in one line */
        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //
        System.out.println("anotherMyIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        /* reference types represent the address of the value(object/array) rather than data itself. so in this case both reference
        variables represent the address pointing to the same array in memory. so in effect we've got only one array in memory that
        both are pointing. both reference see the change made because both are pointing(refer) to the same array.*/
        System.out.println("after changed myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after changed anotherMyIntArray = " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[]{6, 5, 4, 3, 2}; //dereference anotherIntArray and refer to the new array.
        modifyArray(myIntArray); //passing reference type to the method
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherMyIntArray = " + Arrays.toString(anotherIntArray));

    }

    private static void modifyArray(int[] array) {  //parameter array is the 3rd reference to the same array
        array[0] = 2;
        array = new int[]{1, 2, 3, 4, 5}; /*dereference parameter reference and refer to the new array(since we use new
        keyword, dereference that parameter reference & refer/point to new array that has been created in new area of memory).
        after dereference and point to new array, this array reference no longer refer origin array.   */
    }

}
