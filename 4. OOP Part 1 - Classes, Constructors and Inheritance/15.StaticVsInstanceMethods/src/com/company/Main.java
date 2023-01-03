package com.company;

public class Main {

    /* static methods
       - static methods are declared using a static modifier.
       - static methods can't access instance methods and instance variables directly.
       - they are usually used for operations that don't require any data from an instance of the class(from 'this')
       - if you remember, the this keyword is the current instance of a class.
       - in static methods we can't use this keyword.
       - whenever you see a method that does not use instance variables/methods that method should be declared as a static method.
       - ex: main is a static method and it is called by the JVM when it starts an application.

    * instance methods
      - instance methods belong to an instance of a class.
      - to use an instance method we have to instantiate the class first usually by using the new keyword.
      - instance methods can access instance methods and instance variables directly.
      - instance methods can also access static methods and static variables directly.

    * when to create static, when to create instance method? : generally speaking if you're not using any fields or instance
      methods with the new proposed method instead of making that method static instead of regular instance method.
    */

    public static void main(String[] args) {

        //access static variables & methods (static variables, methods don't require an instance to be created);
        Dog.printPlace();
        printHello(); //shorter form of Main.printHello(); only if in same class

        //access instance variables & methods
        Dog dog = new Dog();
        dog.bark();

    }

    public static void printHello() {
        System.out.println("Hello!");
    }

}
