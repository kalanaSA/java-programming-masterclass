package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* we can define arrays of both primitive data types(elements gonna be variables/values) & classes(elements gonna
        be objects) */
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        // but with ArrayList we can define only ArrayLists of classes(elements going to be objects).
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("suzuki");  //add an object of type String as an element to the ArrayList

        /* ArrayList<int> intArrayList = new ArrayList<int>();  Type argument cannot be of primitive type. because primitive
        type is not a class. we need class reference to be able to use ArrayList & we can add only the objects of that class. */

        // but there should be way to define primitive types ArrayLists. ------------------------------------------------
        // manual way to define ArrayList of primitive data types(int in here)
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(55));
        intClassArrayList.add(new IntClass(10));

        /* above way is a bit of messy. so there is a better way to use all the primitive data types as objects. using
        java inbuilt wrapper classes of primitive data types. object wrappers equivalence for the primitive data types.  */
        IntClass intClass = new IntClass(23);
        Integer integer = new Integer(24);
        Double doubleValue = new Double(12.21);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 11; i++) {
            //Autoboxing - create/convert base primitive type (int) into a class/object wrapper(Integer).
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 11; i++) {
            //Unboxing - taking it from the class/object wrapper(Integer) & converting it back to a primitive type(int).
            System.out.println(integerArrayList.get(i).intValue());
        }

        // there is the easiest way also.
        Integer integer1 = 56; //at compile time this code will be executed/convert to -> Integer.valueOf(56);  Autoboxing
        int myInt = integer1; //at compile time this code will be executed/convert to -> integer1.intValue();   Unboxing

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double d = 0.0; d <= 10.0; d += 0.5) {
            doubleArrayList.add(d);
        }

        for (int i = 0; i < doubleArrayList.size(); i++) {
            System.out.println(doubleArrayList.get(i));

        }

    }
}

/* wrapper class - intValue is the variable that's going to contain the value for this class. And we wrapped up in a class.
we made sure that it wasn't publicly available with a variable. we can only update the variable using a constructor
initially and then a setter. And we can retrieve the value only by using getter. so that's sort of the concept of a wrapper.
where we're actually wrapping this functionality and the way to use access modifiers. so that not everyone can access it. */
class IntClass {

    private int intValue;

    public IntClass(int intValue) {
        this.intValue = intValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
