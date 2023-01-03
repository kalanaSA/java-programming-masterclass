package com.company;

public class germanShepherd extends Dog {

    /* overriding - always in two classes that have a child-parent or IS-A relationship,
                    must have the same parameters and same name,
                    must have the same return type or covariant return type(child class),
                    must not have a lower access modifier but may have a higher modifier,
                    must not throw a new or broader checked exception.
                    can't override static methods, only instance methods.   */

    @Override
    public void bark() {
        super.bark();
    }

    @Override
    public int bark(int number) { //changed protected to public
        super.bark(number);
        return 1;
    }

    //overloaded overridden method
    private int bark(String volume) {
        System.out.println("overloaded overridden method!");
        return 1;
    }

    //can't override static methods

}
