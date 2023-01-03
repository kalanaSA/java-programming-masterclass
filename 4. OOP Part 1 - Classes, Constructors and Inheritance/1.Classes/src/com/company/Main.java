package com.company;

public class Main {
    /* fundamentals of OOP - classes, objects, constructors.
     * 4 major components/concepts of OOP - inheritance, composition, encapsulation, polymorphism, abstraction.

        fundamentals of OOP -----------------------------
        1. Objects
           * 2 major characteristics of objects :
            - state/properties(store object's state in instance variables/class fields)
            - behavior(expose object's behaviors with instance methods)
           eg:
           state of computer - amount of ram, os, hard drive size etc
           behavior of computer - booting up, shutting down, printing etc
           software objects are very similar to real world objects

        2. Classes
           * class is a template/blueprint for creating objects.
           * benefits do classes give us in our everyday programming :
            - primitive data types are fairy limiting, there's only so much we can do with them. so, a case could be made
              here where class could be *thought of as a powerful *user-define data type, sort of an extra data type way
              more powerful than a regular primitive data types. that's not correct in the true meaning, but it gives an
              idea of what classes are. we can treated it as a data type.   */


    /* create different objects from Car class/blueprint/template(create an object which sort of take that blueprint
       that definition that we've defined in the class and create an object that we can start using) */
    public static void main(String[] args) {
        //define a variable of type int(create variables using data types)
        int a;
        a = 0;
        //define & initialize variable
        int b = 0;

        //define/create reference variable of type Car(create reference variables using classes)
        Car holden;
        holden = null;
        holden = new Car();
        //define reference variable of class Car & assign new Car object to that reference variable(object creation/create object from class)
        Car porsche = new Car();

        //java has added extra functionalities(inbuilt variables & methods) for objects automatically whenever new object
        //has been created. every new class has inherited these from a base java class.
        porsche.hashCode();
        porsche.toString();

        //And we're also free to add extra functionalities by adding states(class fields) & behaviors(methods).
        porsche.color = "red"; //set a value for porsche object
        String engine = porsche.engine; //get a value from porsche object

        //but accessing/setting data that way(public class fields) is violate encapsulation concept.
        System.out.println("model is " + porsche.getModel()); //internal default state for class fields are null or 0.(null is the internal default state for class/String/Integer, 0 for primitives)
        porsche.setModel("carrera"); //set data for model class field in porsche object
        System.out.println("model is " + porsche.getModel()); //get value of doors class field from porsche object

    }

}
