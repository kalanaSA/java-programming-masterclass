package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean hasTeen = TeenNumberChecker.hasTeen(13, 58, 45);
        boolean hasTeen = TeenNumberChecker.hasTeen(9, 25, 30);

        if (hasTeen) {
            System.out.println("There is a teen");
        } else {
            System.out.println("There is a no teen");
        }

    }
}
