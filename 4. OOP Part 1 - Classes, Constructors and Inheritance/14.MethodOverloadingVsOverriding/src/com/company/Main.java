package com.company;

public class Main {

    /* 1. method overloading -------------------------------------------------------------------------------------------
       * method overloading means providing two or more separate methods in a class with the same name but different parameters.
       * method return type may or may not be different and that allows us to reuse the same method name.
       * overloading is very handy, it reduces duplicated code and we don't have to remember multiple method names.
       * overloading doesn't  have anything to to do with polymorphism but java developers often refer to overloading as
         Compile-Time-Polymorphism.
       * in other words the compiler decided which method is going to be called based on the method name, return type and
         argument list.
       * we can overload both static and instance methods.
       * usually overloading happens inside a single class, but a method can also be treated as overloaded in the sub class
         of that class.
       * that is because a sub class inherits one version of the method from the parent class and then the subclass can have
         another overloaded version of that method.
       * methods will be considered overloaded if both follow the following rules:
         - methods must have the same method name
         - methods must have different parameters
       * if methods follow the rules above then they may or may not,
         - have different return types
         - have different access modifiers
         - throw different checked or unchecked exceptions

       2. method overriding --------------------------------------------------------------------------------------------
       * method overriding means defining a method in a sub class that already exist in the super class with same
         signature(same name, same argument)
       * by extending parent class the child class gets all the methods defined in the parent class(those methods also known
         as derived methods)
       * method overriding is also known as Runtime-Polymorphism and Dynamic-Method-Dispatch, because the method that is
         going to be called is decided at runtime by the JVM.
       * when we override a method it's recommended to put @override immediately above the method definition. this is an
         annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.
       * we can't override static methods, only instance methods.
       * method will be considered overridden if we follow these rules
         - it must be have same name and same arguments.
         - return type can be a subclass of the return type in the parent class.
         - it can't have lower access modifier
         - for example if the parent method is protected then using private in the child is not allowed but using public
           in the child would be allowed.
       * there are also some important points about method overriding to keep in mind,
         - only inherited/derived methods can be overridden, in other words methods can be overridden only in child classes.
         - constructors and private methods cannot be overridden.
         - methods that are final cannot be overridden.
         - sub class can use super.methodName() to call super class version of an overridden method.
    */

    public static void main(String[] args) {

    }
}
