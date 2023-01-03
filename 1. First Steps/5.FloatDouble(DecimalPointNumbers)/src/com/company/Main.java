package com.company;

public class Main {

    public static void main(String[] args) {

        // there are 2 primitive data types for expressing floating/decimal point numbers.(float & double). we use floating
        // point numbers (aka real numbers) when we need more precision in calculations.

        // float (single precision/32 bits width)-----------------------------------------------------------------------
        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + minFloatValue);
        System.out.println("Float maximum value = " + maxFloatValue);

        // double (double precision/64 bits width)----------------------------------------------------------------------
        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + minDoubleValue);
        System.out.println("Double maximum value = " + maxDoubleValue);

        /*
        in general the double data type is accept as the default for floating point numbers(if you're not define the literal value type
         by putting letter on the end) like integer for whole number. so it's better put 'f' letter on end of literal value
         when you want to define float type. it's a good practice put letter('f','d') on the end of the literal for both float & double.
        */
        //float floatValue1 = 5.4545;  error:require float but provide double
        float floatValue1 = 5.4545f;
        double doubleValue1 = 5.4546; //for double values you can put 'd' or either not(because it's default data type).
        double doubleValue2 = 5.2385d;

        float floatValue2 = (float) 5.4545;  //casting - telling java yes we typed literal double value in here but we
        // want to treat it as a float. not recommend this way. because floats aren't recommend for used these days & it's
        // easier to put 'f' letter end of the literal rather than casting.


        int myIntValue = 5;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        //double myDoubleValue = 5.00 / 3.00; you don't really need specify 'd' when you're using literal there like this in double(not applicable for float)

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //even if double take more memory space, it's recommended for floating point numbers. because it's faster &
        // java libraries(math functions) often process & return doubles not floats for reason that doubles more precise
        // and can handle large range. and doubles treated as a default for floating point numbers. *so don't use float data type anymore.


        //challenge ----------------------------------------------------------------------------------------------------
        double numOfPounds = 200.00;  //or double numOfPounds = 5d;
        double convertedKilos;
        //1 pound= 0.45359237 kg
        convertedKilos = numOfPounds * 0.45359237;  //or convertedKilos = numOfPounds * 0.45359237d;
        System.out.println("converted kilos : " + convertedKilos);

        double pi = 3.1415927;
        double anotherPi = 3.1_415_927;
        System.out.println(pi);
        System.out.println(anotherPi);

    }
}
