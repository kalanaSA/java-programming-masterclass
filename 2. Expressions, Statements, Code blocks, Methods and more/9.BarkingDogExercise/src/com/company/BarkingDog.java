package com.company;

public class BarkingDog {

    //We have to wake up if the dog is barking before 8:00 or after 22:00
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        // !barking check with || logical operator so if this conditional expression was not true, it means (!barking) not true.
        // so in below barking should be definitely true.
        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // return barking && (hourOfDay < 8 || hourOfDay > 22); - condition barking was always true
        return hourOfDay < 8 || hourOfDay > 22;

    }

//    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//
//        if (!barking) {
//            return false;
//        }
//        return hourOfTheDay > -1 && hourOfTheDay < 8 || hourOfTheDay == 23;
//
//    }

}
