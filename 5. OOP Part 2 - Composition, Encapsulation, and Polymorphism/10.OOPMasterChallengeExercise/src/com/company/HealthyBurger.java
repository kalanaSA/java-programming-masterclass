package com.company;

public class HealthyBurger extends Hamburger {

    private Additions healthyAddition1;
    private Additions healthyAddition2;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "brown rye roll", meat, price); /* we provide name,breadRollType manually
        because we know the burger we're working on. */
    }

    public void addHealthyAddition1(Additions healthyAddition1) {
        this.healthyAddition1 = healthyAddition1;

    }

    public void addHealthyAddition2(Additions healthyAddition2) {
        this.healthyAddition2 = healthyAddition2;
    }

    @Override
    public double itemizeBurger() {
        double hamBurgerPrice = super.itemizeBurger();

        if (healthyAddition1 != null) {
            hamBurgerPrice += healthyAddition1.getPrice();
            System.out.println("Added " + healthyAddition1.getName() + " for an extra : " + healthyAddition1.getPrice());
        }
        if (healthyAddition2 != null) {
            hamBurgerPrice += healthyAddition2.getPrice();
            System.out.println("Added " + healthyAddition2.getName() + " for an extra : " + healthyAddition2.getPrice());
        }

        return hamBurgerPrice;
    }


}