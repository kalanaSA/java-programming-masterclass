package com.company;

/* sub class (this class inherit from base class) & we can specify some specific state & behaviors only specific to this sub class also.
 * we can use extends keyword to inherit(access/use states & behaviors that's define on the base/super/other class from this sub class)
 * after extends super class, states & behaviors inherit to this sub class automatically. we can access them in sub class &
   if we need we can override them */
public class Dog extends Animal {

    //specific states & behaviors for this sub class(Dog) --------------------------------------------------------------
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public void chew() {
        System.out.println("Dog.chew() method called!");
    }

    public void walk() {
        System.out.println("Dog.walk() method called!");
        super.move(5); //if we use super keyword then base class method will be called.
    }

    public void run() {
        System.out.println("Dog.run() method called!");
        move(10); //but if we didn't use super, it'll first search for override version of called base class method from this sub
        //class & if there isn't any override version then called base class method. this is better because sub class can have override methods.
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() method called!");
    }

    //also we can override behaviors/instance methods inherited from base class in sub class ---------------------------
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() method called!");
        super.move(speed); //override with base class move() method functionalities (called base class method again/not overriding)
        moveLegs(8); //override method body by performing another code(in this case called another method)
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() method called!");
        chew(); //override method of base class without inherited functionalities(code/super.eat()), changed base class method completely in sub class.
    }

    /*2.if we extends another class, it means all the states & behaviors belongs to that base class will inherit to sub classes.
        so when we create a object of sub class, & the same time try to initialize the values for object's fields using constructor,
        we need to initialize the values for base class states & behaviors also. because they are also a part of this class now.
        we can achieve this calling base class constructor within sub class constructor using super() call.   */
    public Dog(String name, int brain, int body, int size, double weight, int eyes, int legs, int tail, int teeth, String coat) {
        /* using super() statement, initialize values for states that are inherited from base class, when we try to create object
        from this sub class using constructor.  */
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public Dog(String name, int size, double weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //getters(instance methods) ----------------------------------------------------------------------------------------
    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }

    //set all-args constructor to initialize object's fields instead of setters.
}