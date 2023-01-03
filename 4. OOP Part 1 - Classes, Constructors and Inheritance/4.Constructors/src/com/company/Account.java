package com.company;

public class Account {

    private String accountNumber;
    private String customerName;
    private double balance;
    private String email;
    private String phoneNumber;

    /* constructor is a special method that has public access modifier, no return type, exact class name. purpose of
       constructor is it creates the objects from class for us.
       constructor will call only once when object creation. -> new Account();
     * like methods constructors can be overloaded. we can have more than one same constructor with different parameters.
     * By default java will automatically create no args constructor for a class (that's what we use to create a object/object without
       initialize values for object fields)
     * but by manually we can create all args constructor or specific args constructor(s) according to our purpose.
     * but if we create a constructor(s) manually, we have to create no args constructor again if we want create object
       without initialize values for fields.
     * also we can call constructor from another constructor(suitable for situations like if an empty(no args) constructor called
       to create new object, and but we also want to create that object with some default values instead of empty values for fields)
       to achieve this we use 'this()' call & that statement needs to be the first statement within that code block.(on line 26) */

    //no args constructor
    public Account() {
        this("0000 0000 0000 0000", "firstname lastname", 0.0, "name@gmail.com",
                "+940000000"); //in this case we called all args constructor in this no args constructor.
        System.out.println("Account() constructor with no args called!");
    }

    //all args/major constructor(do all initializations in one constructor(this), other constructors should just call the major constructor using 'this')
    public Account(String accountNumber, String customerName, double balance, String email, String phoneNumber) {
        System.out.println("Account() constructor with all args called!");
        this.accountNumber = accountNumber;  //setAccountNumber(accountNumber);
        this.customerName = customerName;
        this.balance = balance;
        this.email = email;
        this.phoneNumber = phoneNumber;
        /* there is a alternative way to update fields using setters in here. advantage of this is if we had some validation
           in setter, the value assign to field will be valid value(create valid object)
         * but save values for the fields directly is better than calling setters to save values. because there can be scenarios
           setter isn't execute. so don't call setters or any other method within constructors except calling constructor from
           another constructor using 'this()' call.
         * other reason for that is, this is the point in the constructor where the object is being created. so consequently,
           some aspects of the initialization may not have been finished while you're in the constructor.
         * so if u want to valid values, you can also valid fields inside the constructor also before initialize/set them to fields.   */
    }

    //specific args constructor
    public Account(String customerName, String email, String phoneNumber) {
        this("0000 0000 0000 0000", customerName, 0.0, email, phoneNumber);
        System.out.println("Account() constructor with specific args called!");
    }

    //another specific args constructor
    public Account(String customerName, String phoneNumber) {
        this("0000 0000 0000 0000", customerName, 0.0, "unknown@gmail.com", phoneNumber);
        System.out.println("Account() constructor with specific args called!");
    }

    public void depositFunds(double amount) {
        this.balance += amount;
        System.out.println("you have credited " + amount + ", new balance is now " + this.balance);
    }

    public void withdrawFunds(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("your balance is insufficient for this action");
        } else {
            this.balance -= amount;
            System.out.println("you have withdraw " + amount + ", remaining balance is now " + this.balance);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber.length() == 19 ? accountNumber : "";
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = (email.contains("@") && email.contains(".com")) ? email : "";
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber.length() == 12 ? phoneNumber : "";
    }

}
