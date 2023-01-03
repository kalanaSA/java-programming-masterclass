package com.company;

public class Main {

    public static void main(String[] args) {

        boolean wakeup = BarkingDog.shouldWakeUp(true, 7);
        //boolean wakeup = BarkingDog.shouldWakeUp(true, 8);
        //boolean wakeup = BarkingDog.shouldWakeUp(false, 7);

        if (wakeup) {
            System.out.println("wakeup!");
        } else {
            System.out.println("don't wakeup");
        }

    }
}
