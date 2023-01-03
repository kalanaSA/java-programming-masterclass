package com.company;

public class SimpleCalculator {

    /* instance variables(class fields) & instance methods - can't access those in one class from another class directly
       they belongs to object. if you want to access instance methods or variables of a class from another class you have
       to create object from that class and access using object reference. but if they are private you can't access either
       even you have create object. you have to create public setters & getter methods to access those.
       A a = new A();
       a.interest();
       a.getInterest(); if instance variable/class field is private
     * static variables & static methods - can access directly. belongs to class. not inherit to object, when you create
       object from that class.
       A.interest;
     * local variables - variable define inside the code block.                                                      */

    //instance variables/class fields(with private access modifier respective to encapsulation)
    private double firstNumber;
    private double secondNumber;

    //instance methods/setters & getters
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    //other instance methods
    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult() {
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        //validation
        if (this.secondNumber == 0) {
            return 0;
        }
        return this.firstNumber / this.secondNumber;
    }

}
