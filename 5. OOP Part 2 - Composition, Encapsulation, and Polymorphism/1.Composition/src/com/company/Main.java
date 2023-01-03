package com.company;

import com.company.composition.*;
import com.company.inheritance.Car;

public class Main {

    /* inheritance : enable reuse code by modeling IS-A Relationship between objects    ex: Car is a Vehicle.
     * composition : enable reuse code by modeling HAS-A Relationship between objects   ex: Computer has a MotherBoard,Case,Monitor.
       the composition is achieved by using an instance variable that refers to other objects.
     * decide what is the relationship between objects before use inheritance or composition, is it IS-A Relationship or
       HAS-A Relationship. As a general rule when you're design a program in java you probably wanna look at composition first.
       Car is a Vehicle - inheritance
       Computer has a MotherBoard,Case,Monitor - composition                                                          */

    public static void main(String[] args) {

        //composition --------------------------------------------------------------------------------------------------
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        /* Resolution resolution = new Resolution(2540, 1440);
           Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, resolution);
           don't need to create reference, if you're not going to use it for anything else & only want to pass it
           to a method. then you can just follow below way.  new Resolution(2540, 1440) */
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(theCase, theMonitor, motherboard);

        //access states/behaviors of other objects that has a HAS-A Relationship with PC class.
        Case caseObject = thePc.getTheCase(); //get object of Case
        caseObject.pressPowerButton();        //access states/behaviors using object of Case
        thePc.getTheCase().pressPowerButton();
        thePc.getMonitor().drawPixelAt(1500, 1200, "red");
        thePc.getMotherboard().loadProgram("windows 10");


        //Inheritance --------------------------------------------------------------------------------------------------
        Car ferrari = new Car("ferrari", 3, 6000);
        //access inherits states/behaviors from super class in sub class.
        ferrari.move();

    }

}