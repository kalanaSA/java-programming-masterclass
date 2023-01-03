package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private String location;
    private final ArrayList<Customer> customers; //composition over inheritance

    //no setters only way to create object(instantiate) from this class is by constructor
    public Branch(String name, String location) {
        this.name = name;
        this.location = location;
        customers = new ArrayList<Customer>(); //instantiate customers arraylist
    }

    /**
     * 3. search a customer
     *
     * @param customerName
     */
    public Customer searchCustomer(String customerName) {
        //searching customer here then
        for (Customer checkingCustomer : this.customers) {
            if (checkingCustomer.getName().equals(customerName)) {
                return checkingCustomer;
            }
        }
        return null;
    }

    /**
     * 2. add a new customer(still be attached to the bank)
     *
     * @param customer
     */
    public boolean addCustomer(Customer customer) {
        //adding customer here then
        String customerName = customer.getName();
        if (searchCustomer(customerName) == null) {
            return this.customers.add(customer);
        }
        System.out.println("Something Went Wrong! '" + customerName + "' customer already exist");
        return false;
    }

    /**
     * 1. add a customer transaction(still be attached to the bank)
     *
     * @param customerName
     * @param amount
     */
    public boolean addCustomerTransaction(String customerName, double amount) {
        //checking customer existence here then
        Customer existingCustomer = this.searchCustomer(customerName);
        if (existingCustomer != null) {
            //leaving add transaction part to the appropriate class(Customer)
            return existingCustomer.addCustomerTransaction(amount);
        }
        System.out.println("Something Went Wrong! '" + customerName + "' customer doesn't exist");
        return false;
    }

    //getters
    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

}
