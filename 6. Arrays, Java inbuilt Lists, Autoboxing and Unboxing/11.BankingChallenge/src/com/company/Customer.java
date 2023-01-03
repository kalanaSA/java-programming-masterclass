package com.company;

import java.util.ArrayList;

public class Customer {

    private String name;
    private String address;
    private Integer age;
    private ArrayList<Double> transactions;

    //no setters only way to create a object(instantiate) from this class is by constructor
    public Customer(String name, String address, Integer age, double initialAmount) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.transactions = new ArrayList<>(); //instantiate Double arraylist first before try to add anything it/ ready to use.(constructors are great place for initializing)
        this.addCustomerTransaction(initialAmount); //according to the scenario when the time a new customer creates there should be an initial transaction also.
    }

    /**
     * 1. add a customer transaction/ handling initial and also subsequent transactions (still be attached to the branch and bank)
     *
     * @param amount
     */
    public boolean addCustomerTransaction(double amount) {
        //adding transaction here then
        return this.transactions.add(amount); //autoboxing(primitive to the object wrapper)
    }

    //getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    @Override public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", age=" + age + '}';
    }
}
