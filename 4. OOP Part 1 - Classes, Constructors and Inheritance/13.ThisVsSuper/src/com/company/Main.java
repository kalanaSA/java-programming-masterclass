package com.company;

public class Main {

    /* super keyword : used to access/call the parent class members(variables & methods). super is commonly used with method
       overriding, when we call a method with the same name from the parent class.

     * this keyword : used to call the current class members(variables & methods). this is required when we have a parameter
       with the same name as an instance variables/class fields. this is commonly used with constructors & setters since
       there is a parameter with the same name ,and optionally in getters. in getters we don't have any parameters so
       this keyword is optional.

       NOTE : we can use both of them anywhere in a class except static areas(the static block or a static method). any
       attempt to do so will lead to compile-time errors.

     * this() call : use this() call a constructor from another overloaded constructor in the same class. this() call can be
       used only in constructor, and it must be the first statement in a constructor. it's used with constructor chaining,
       in other words when constructor calls another constructor, and helps to reduce duplicated code.

     * super() call : the only way to call a parent constructor is by calling super(). this calls the parent constructor.
       the call to super() must be the first statement in each constructor. java compiler puts a default call to super()
       if we don't add it, and it is always the no-args super which is inserted by compiler(constructor without args).
       even abstract classes have constructors, although you can never instantiate an abstract class using the new key word.
       an abstract class is still a super class, so its constructors run when someone makes an instance of a concrete subclass.

       NOTE : a constructor can have a call to super() or this(), but never both.   */

    public static void main(String[] args) {
    }

}