package com.company;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal1 = 5000 + 10;
        long longTotal2 = 5000L + 10L * (byteValue + shortValue + intValue);  //(byteValue + shortValue + intValue) this part return integer value
        System.out.println("longTotal1 " + longTotal1); //don't need casting here because long value * int value = long value
        System.out.println("longTotal1 " + longTotal2); //don't need casting here because long value * int value = long value

        short shortTotal1 = (1000 + 10 * (10 + 20 + 50)); // int + int * int = int       : literals
        short shortTotal2 = (short) (1000 + 10 * (byteValue + shortValue + intValue)); // int + int * int = int   : expression
        //this will return int so we have to cast to get short value
        System.out.println(shortTotal1);
        System.out.println(shortTotal2);

        /*
         * integer is the best primitive data type to use generally, even if you're using type long we don't need casting
          reason for that long accept integer (maximum integer value will always fit within long)
         */
    }
}
