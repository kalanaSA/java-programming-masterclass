package com.company;

public class DeluxeHamburger extends Hamburger {

    //create deluxe burger with 2 additions(chips & drink) at the time object is created.
    public DeluxeHamburger(String meat, double price) {
        super("Deluxe", "white roll", meat, price);
        super.addAdditions1(new Additions("Chips", 250));
        super.addAdditions2(new Additions("Drink", 150)); /* calling addAdditions methods of base Hamburger
        class.if we didn't use super keyword then it'll called derived methods, it is ok if they're not overridden(in this
        case overridden methods, because derived methods in here are overridden)    */
    }

    /* override addAdditions methods to deny adding extra addition items to just for this deluxe burger. because deluxe burger
     is not allowed to have extra additions rather than chips & drink. so that's how we go about overriding it and preventing
     functionality from being processed. */
    @Override
    public void addAdditions1(Additions additions1) {
        //super.addAdditions1(additions1);  not enabling that code to be called
        System.out.println("Cannot add additional items for deluxe burger!");
    }

    @Override
    public void addAdditions2(Additions additions2) {
        System.out.println("Cannot add additional items for deluxe burger!");
    }

    @Override
    public void addAdditions3(Additions additions3) {
        System.out.println("Cannot add additional items for deluxe burger!");
    }

    @Override
    public void addAdditions4(Additions additions4) {
        System.out.println("Cannot add additional items for deluxe burger!");
    }

}
