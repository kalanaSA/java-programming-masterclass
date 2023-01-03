package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        //call second constructor, anyway finally called major constructor.
        this("default name", 0.0);
    }

    public VipCustomer(String name, double creditLimit) {
        /*call major constructor with default values for empty fields in specific args constructor. calling major(all args) constructor
         will helps to set default values for empty fields instead of only initializing fields that has provide values like below*/
        this(name, creditLimit, "unknown@gmail.com");

//        this.name = name;
//        this.creditLimit = creditLimit;
    }

    //major constructor
    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
