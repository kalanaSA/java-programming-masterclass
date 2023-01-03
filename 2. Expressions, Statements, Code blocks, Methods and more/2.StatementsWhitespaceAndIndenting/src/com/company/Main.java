package com.company;

public class Main {

    public static void main(String[] args) {

        //statements (statements no need to in one line)
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("this is test");

        //java doesn't care about white space we put between literals,variables,operators,expressions. java will manage it.
        int intValue =
                100;
        System.out.println("this is " +
                "about white spaces" +
                " we put");

        //indenting for readability & make it easy for you to see logical flow
        if (myVariable > 40) {
            System.out.println("printed");
        }

        if (myVariable == 50) {
        System.out.println("printed");
        }

    }
}
