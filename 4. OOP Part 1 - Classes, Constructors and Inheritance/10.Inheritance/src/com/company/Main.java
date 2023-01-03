package com.company;

public class Main {

    public static void main(String[] args) {
        // oop allow you to create classes to inherit/extend commonly used state & behavior(common basic states & behavior) from other classes.

        Animal animal = new Animal("Animal", 1, 1, 5, 65);
        Dog goldenRetriever = new Dog("yorkie", 1, 1, 5, 65, 2, 4, 1, 34, "long");
        Dog labrador = new Dog("adam", 5, 65, 2, 4, 1, 34, "short");

        animal.eat();
        System.out.println(".........................");

        //access states/behaviors from class itself
        System.out.println(goldenRetriever.getEyes());
        goldenRetriever.chew();
        System.out.println(".........................");

        //access states/behaviors inherited from base class
        System.out.println(goldenRetriever.getBrain());
        goldenRetriever.grow();
        System.out.println(".........................");

        //access behaviors inherited from base class & override in sub class
        goldenRetriever.move(5);
        goldenRetriever.eat();
        System.out.println(".........................");

        //methods that called base class methods.
        goldenRetriever.walk();  //called directly base class method using super keyword.
        goldenRetriever.run();  //called method name only. it'll first search for overridden version of that base class method
        //in sub class, and if there isn't overridden one called method in base class.

    }
}