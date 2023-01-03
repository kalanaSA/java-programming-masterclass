package com.company;

/* definition 1 : polymorphism is override super class method(s) in sub classes with providing own implementation for that base class method.
 * definition 2 : Polymorphism is the ability of an object to take on many forms, and it occurs when we have many classes that
   are related to each other by inheritance. The most common use of polymorphism in OOP occurs when a parent class reference is
   used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be polymorphic.                                                                */
class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine() initialize in Car class";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate() initialize in Car class";
    }

    public String brake() {
        return getClass().getSimpleName() + ".brake() initialize in Car class";
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    //create getters for engine & wheels is meaningless, because we set values for both.
}

class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        //return "Mitsubishi.startEngine()";
        return getClass().getSimpleName() + ".startEngine()";  /*another way of get class name rather than hard code.
        behaviors like getClass() are inherited from 'Object' class that all classes get inherited default. */
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }
}

class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }

}

class Holden extends Car {

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }

}

class Forgettable extends Car {
    public Forgettable(String name, int cylinders) {
        super(name, cylinders);
    }
    //no overriding for derived methods from super class.
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base Car", 8);
        System.out.println(car.brake());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println("............................................");

        //Mitsubishi mitsubishi = new Mitsubishi("Outlander VRW 4WD", 6);
        Car mitsubishi = new Mitsubishi("Outlander VRW 4WD", 6);
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println("............................................");

        //Ford ford = new Ford("Ford Falcon", 6);
        Car ford = new Ford("Ford Falcon", 6);
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println("............................................");

        //Holden holden = new Holden("Holden commodore Falcon", 6);
        Car holden = new Holden("Holden commodore Falcon", 6);
        System.out.println(holden.brake());
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println("............................................");

        //if we didn't override derived methods from super class in sub class, method that derived from base class will be called.
        Car forgettable = new Forgettable("forgettable", 10);
        System.out.println(forgettable.brake());
        System.out.println(forgettable.startEngine());
        System.out.println(forgettable.accelerate());

    }


}
