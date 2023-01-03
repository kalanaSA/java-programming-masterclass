package com.company;

public class Dog {

    /*overloading - usually happens in single class,
                    must have same name,
                    must have different parameters,
                    may have different return types,
                    may have different access modifiers,
                    may throw different exceptions.
                    can overload both static and instance methods      */

    public void bark() {
        System.out.println("Woof");
    }

    protected int bark(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("woof");
        }
        return 1;
    }

    //overloaded static method
    public static void bark(double frequency) {
        System.out.println("can overload static methods also");
    }

}
