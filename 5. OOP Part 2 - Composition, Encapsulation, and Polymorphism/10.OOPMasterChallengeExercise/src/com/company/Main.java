package com.company;

public class Main {

    public static void main(String[] args) {

        Additions lettuce = new Additions("Lettuce", 20);
        Additions potato = new Additions("Potato", 50);
        Additions carrot = new Additions("Carrot", 20);
        Additions onion = new Additions("Onion", 20);
        Additions cheese = new Additions("Cheese", 150);
        Additions tomatoSauce = new Additions("Tomato sauce", 100);
        Additions hotSauce = new Additions("Hot sauce", 80);
        Additions omelet = new Additions("Omelet", 50);
        Additions bacon = new Additions("Bacon", 150);

        Hamburger hamBurger = new Hamburger("Basic", "white roll", "sausage", 450);
        hamBurger.addAdditions1(lettuce);
        hamBurger.addAdditions2(potato);
        hamBurger.addAdditions3(bacon);
        System.out.println("Net worth = " + hamBurger.itemizeBurger());
        System.out.println("--------------------------------------------------");

        HealthyBurger healthyBurger = new HealthyBurger("beef", 650);
        healthyBurger.addAdditions1(lettuce);
        healthyBurger.addAdditions2(carrot);
        healthyBurger.addAdditions3(tomatoSauce);
        healthyBurger.addAdditions4(cheese);
        healthyBurger.addHealthyAddition1(omelet);
        System.out.println("net worth = " + healthyBurger.itemizeBurger());
        System.out.println("--------------------------------------------------");

        DeluxeHamburger deluxeHamBurger = new DeluxeHamburger("2 grilled chicken slice with pork", 1050);
        deluxeHamBurger.addAdditions1(lettuce); //can't add addition items.
        System.out.println("net worth = " + deluxeHamBurger.itemizeBurger());


    }

}
