package com.company;

public class Dog {

    //instance variables(fields) & instance methods --------------------------------------------------------------------
    public void eat() {
        System.out.println("eat");
    }

    public void bark() {
        System.out.println("woof");
        eat(); //instance methods can access instance methods and instance variables directly.
        printPlace(); //instance methods can also access static methods and static variables directly.
    }


    //static variables & static methods --------------------------------------------------------------------------------
    public static int place;

    public static void printPlace() {
        //bark();  static methods can't access instance methods and instance variables *directly.
        //this.bark();  in static methods we can't use this keyword.
        System.out.println("place according to weight :" + place);
    }

}
