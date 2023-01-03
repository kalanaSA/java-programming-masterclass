package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        there are 8 primitive data types
        whole numbers(byte,short,int,long)
        Decimal number(float,double)
        boolean,char
        */

        // int (width 32) ----------------------------------------------------------------------------------------------
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + minIntValue);
        System.out.println("Integer maximum value = " + maxIntValue);
        System.out.println("Busted minimum value = " + (minIntValue - 1)); //underflow
        System.out.println("Busted maximum value = " + (maxIntValue + 5)); //overflow(when try to put larger number greater
        // than int can hold(space allocate in memory for int), it doesn't fit but computer try it anyway by doing that it overflowed)

        //if we assign larger value as a literal java can figure out this number is clearly outside the range and flag it
        // as an error unlike overflow & underflow that doesn't give us an error(make sure to doesn't happen overflow/underflow, because it's bad)
        // int myMaxInt = 2_147_483_648; error:integer number too large

        /*
         int - is a primitive data type that really only gives us the option  to set variable's value.
         Integer - on the other hand is called wrapper class(java use concept of wrapper class for all 8 primitive types,
         by doing that it gives us ways to perform inbuilt different operations on that data type )
        */
        Integer test = 10;
        System.out.println(test.equals(10));

        // byte (width 8) ----------------------------------------------------------------------------------------------
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;  //this can be help if you have small range and want to save memory & speed
        System.out.println("Byte minimum value = " + minByteValue);
        System.out.println("Byte maximum value = " + maxByteValue);

        // short (width 16) --------------------------------------------------------------------------------------------
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;  //this can be help if you have small range and want to save memory & speed
        System.out.println("Short minimum value = " + minShortValue);
        System.out.println("Short maximum value = " + maxShortValue);

        // Long (width 64) ---------------------------------------------------------------------------------------------
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;  //this can be help if you have large range
        System.out.println("Long minimum value = " + minShortValue);
        System.out.println("Long maximum value = " + maxShortValue);

        long longValue1 = 1000L; //when you are assign a long value you should put letter 'L' on end. otherwise the value consider as an integer
        //by default java consider number you type as an integer unless you add letter on end
        long longValue2 = 1000; //java smart enough to know long data type can hold integer value, if we put int value for long. long width > int width
        // long longValue3 = 2_147_483_648; but if we try to assign long literal value(exceeded max int value) for long without 'L' it will give an error
        long longValue4 = 2_147_483_648L;

        // we can't exceed the max literal values for byte,short,int,long. java will give us an error when we try to.(in java haven't letter
        // for byte & short, so we put int values without exceeding max literal values for each data types)
        //short bigShortLiteralValue1 = 32768; error: require type is short but provide int(if we exceed the max literal value for byte & short we need to specify data type as an int)
        int intValue = 32768;
        short bigShortLiteralValue2 = 32767; //convert int to short(we put max short value as an integer value)
        // it will not occur an error. but we can't put exceeded maximum short value as a short. we need int for it.


        // casting (convert number from one type to another) -----------------------------------------------------------
        //reason to use casting because default data type for whole numbers is int. and casting needed when we use expression instead of literal values.
        byte myNewByteValue1 = -64;  //assign literal value (minByteValue/2)
        //byte myNewByteValue2 =  (minByteValue / 2); assign expression
        int myNewByteValue2 = (minByteValue / 2);
        byte myNewByteValue = (byte) (minByteValue / 2); //we have to use casting if we want byte instead of default int

        short myNewShortValue1 = (short) (minShortValue + 4);
        short myNewShortValue2 = (short) (minByteValue * 2);

    }
}
