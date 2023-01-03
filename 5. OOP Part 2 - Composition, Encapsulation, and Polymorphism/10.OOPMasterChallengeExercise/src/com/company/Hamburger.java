package com.company;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private Additions additions1;
    private Additions additions2;
    private Additions additions3;
    private Additions additions4;
    private double price;

    public Hamburger(String name, String breadRollType, String meat, double price) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public void addAdditions1(Additions additions1) {
        this.additions1 = additions1;
    }

    public void addAdditions2(Additions additions2) {
        this.additions2 = additions2;
    }

    public void addAdditions3(Additions additions3) {
        this.additions3 = additions3;
    }

    public void addAdditions4(Additions additions4) {
        this.additions4 = additions4;
    }

    public double itemizeBurger() {
        double hamBurgerPrice = this.price;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + " price : " + hamBurgerPrice);

        if (additions1 != null) {    //if (additions1.getName() != null) {  : nullPointer exception
            hamBurgerPrice += additions1.getPrice();
            System.out.println("Added " + additions1.getName() + " for an extra : " + additions1.getPrice());
        }
        if (additions2 != null) {
            hamBurgerPrice += additions2.getPrice();
            System.out.println("Added " + additions2.getName() + " for an extra : " + additions2.getPrice());
        }
        if (additions3 != null) {
            hamBurgerPrice += additions3.getPrice();
            System.out.println("Added " + additions3.getName() + " for an extra : " + additions3.getPrice());
        }
        if (additions4 != null) {
            hamBurgerPrice += additions4.getPrice();
            System.out.println("Added " + additions4.getName() + " for an extra : " + additions4.getPrice());
        }
        return hamBurgerPrice;
    }

}
