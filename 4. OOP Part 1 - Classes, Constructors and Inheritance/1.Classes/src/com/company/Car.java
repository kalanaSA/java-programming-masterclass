package com.company;

/* As is recommended when you're creating a classes in java first letter should be upper case letter.
 * statement of creating class consist access modifier, class keyword, <class_name>, {}
 * access modifier(optional) - determine what access we want to allow others to have to this class that we are creating.
 * class is actually a -> <class_name>.java source code file
 * class fields/instance variables & instance methods that we're define in class, attached to the all objects that we're creating
   from that particular class. but not static methods & variables, they're the only thing that belongs to the only for class.  */

public class Car {
    /* local variables - variables that are defined/declared inside the method. they are only belongs to that method,
       can't access those from outside of the method(means they're local). because they are in code block.
     * class/member/instance variables/ class fields -
       - classes allow us to create variables that can be seen and are accessible from anywhere within the class.
       - when you're creating a class field you need to specify access modifier also unlike local variables.
       - And as a general rule class fields in class should be private. so what private means when talking about class fields
         is we're hearing to encapsulation. encapsulation used to hide the class fields & methods from access publicly.
         it really means that the internal representation of an object is gonna be hidden from view, outside of the object's
         definition i.e. we're only allowing the internals to be accessed by this class or by this object, we're not allowing
         outside access to that. */

    private String model;
    private int doors;
    private int wheels;
    public String engine;
    public String color;

    //setter standard method
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        this.model = (model.equals("carrera") || model.equals("commodore")) ? model : "Unknown";
    }

    //getter standard method
    public String getModel() {
        return this.model;
    }

    /* so that's the way to access(set/update/get) data for object, using this public set & get methods respect to the encapsulation
       instead of accessing directly(public class fields).
     * advantage of set/get methods is we could do some validations before setting values.
     * it means when you're creating a class, what you are doing is you can setup all the rules related to that class,
       what is valid, what is not valid. And have it all setup, all that functionality setup within the class itself, so
       that is inherited when we create the objects from it. what that means is the code that is creating objects, can't
       make invalid objects. so that's the whole concept of encapsulation is that, we're not allowing to access(set/get)
       the class fields directly, we can make sure that data within our objects are more valid & correct.  */

}
