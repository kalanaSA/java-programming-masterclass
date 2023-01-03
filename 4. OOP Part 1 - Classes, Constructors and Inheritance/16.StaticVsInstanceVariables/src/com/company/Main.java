package com.company;

public class Main {

    /* static variables -------------------------------
       - declared by  using static keyword.
       - static variables are also known as static member variables.
       - every instance of that class shares the same static variable.
       - if changes are made to that variable, all other instances will see the effect of the change.
       - static variables are not used very often but can sometimes be very useful.
       - for example when reading user input using Scanner we will declare scanner as a static variable.
       - that way static methods can access it directly.

     * instance variables -----------------------------
       - they don't use the static keyword.
       - instance variables are also known as fields or member variables.
       - unlike static variables, instance variables belong to an specific instance of a class.
       - every instance has it's own copy of an instance variable.
       - every instance can have a different value(state).
       - instance variables represent the state of an specific instance of a class.
     */

    public static void main(String[] args) {

        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy"); //once we change static variable(in here using constructor) all instances
        //will see that change we made because all instances are sharing that variable.

        rex.printName(); //prints fluffy
        fluffy.printName(); //prints fluffy

        Cat kitty = new Cat("kitty");
        Cat milo = new Cat("milo");  //using instance variables & each instance of the class has its own state/values
        //for any instance variable. it basically not share like static variables.

        kitty.printName(); //prints kitty
        milo.printName();  //prints milo

    }
}
