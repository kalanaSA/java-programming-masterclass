package com.company.covariantexample;

public class HealthyBurgerFactory extends BurgerFactory {

    //overridden methods must have the same return type or covariant return type(child class)
    @Override
    public HealthyBurger createBurger() {
        return new HealthyBurger();
    }

}
