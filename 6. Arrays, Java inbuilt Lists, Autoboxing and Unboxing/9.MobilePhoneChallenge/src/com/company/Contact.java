package com.company;

public class Contact {

    //class fields/instance variables
    private String name;
    private String phoneNumber;

    //constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    /* static method for create new contact without creating a new separate object, static means we don't have to
     create a new object/instance for this contact class. aka factory method. */
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber); //calling constructor to create new contact object/record
    }

    public String printContact() {
        return "name -> " + this.name + ", phone number -> " + this.phoneNumber;
    }

}
