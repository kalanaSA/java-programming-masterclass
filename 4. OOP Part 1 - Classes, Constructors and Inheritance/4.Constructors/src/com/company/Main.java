package com.company;

public class Main {

    public static void main(String[] args) {

        Account myAccount = new Account();

        /*1. there is a lot of code to set values for object's fields for the first time/initialize object's fields. it's harder
        if there is more fields. so we can set these values/initialize fields using constructor instead of using setters. */
        myAccount.setAccountNumber("1234 4567 7896 7894");
        myAccount.setCustomerName("PRK Sandakelum");
        myAccount.setBalance(5000.0);
        myAccount.setEmail("prksandakelum@gmail.com");
        myAccount.setPhoneNumber("+94771234567");

        System.out.println("account number : " + myAccount.getAccountNumber());
        System.out.println("customer name : " + myAccount.getCustomerName());
        System.out.println("balance : " + myAccount.getBalance());
        System.out.println("email : " + myAccount.getEmail());
        System.out.println("contact number : " + myAccount.getPhoneNumber());

        myAccount.depositFunds(10000);
        myAccount.withdrawFunds(2000);
        myAccount.withdrawFunds(13500);

        //check validations in setters are work or not
        myAccount.setEmail("prksandakelum");
        myAccount.setPhoneNumber("+9477123456");
        System.out.println("email : " + myAccount.getEmail());
        System.out.println("contact number : " + myAccount.getPhoneNumber());
        System.out.println("---------------------------------------------");

        /*2. but there is a another way of doing when you're creating an object for the first time, that is using constructors. what
         you can do with constructor is set initial values for object fields and any other initialization you wanna perform in one hit. */
        Account wifeAccount = new Account("7894 5612 4561 3692", "ashani wadu", 1000.0,
                "ashani@gmail.com", "+94711234567");
        System.out.println("account number : " + wifeAccount.getAccountNumber());
        System.out.println("customer name : " + wifeAccount.getCustomerName());
        System.out.println("balance : " + wifeAccount.getBalance());
        System.out.println("email : " + wifeAccount.getEmail());
        System.out.println("contact number : " + wifeAccount.getPhoneNumber());
        System.out.println("---------------------------------------------");

        /*3. when you try to create an object from Account class (using empty/no args constructor) & you don't pass any
        parameters, but then default values set to the fields of object instead of empty values. this will achieve by
        calling constructor(all args) from another constructor(no args) using 'this()' call. */
        Account sonAccount = new Account();
        System.out.println("account number : " + sonAccount.getAccountNumber());
        System.out.println("customer name : " + sonAccount.getCustomerName());
        System.out.println("balance : " + sonAccount.getBalance());
        System.out.println("email : " + sonAccount.getEmail());
        System.out.println("contact number : " + sonAccount.getPhoneNumber());
        System.out.println("---------------------------------------------");


        /*4. when you try to create an object from Account class(using specific args constructor) & you only pass related values according
        to the parameters of specific args constructor, not all, then set default values to the other fields of object that you are not
        provide values instead of empty values. this will achieve by calling constructor(all args) from another constructor(specific args) using 'this()' statement  */
        Account girlFriendAccount = new Account("hirushi", "hiru@gmail.com", "+94773351456");
        System.out.println("account number : " + girlFriendAccount.getAccountNumber());
        System.out.println("customer name : " + girlFriendAccount.getCustomerName());
        System.out.println("balance : " + girlFriendAccount.getBalance());
        System.out.println("email : " + girlFriendAccount.getEmail());
        System.out.println("contact number : " + girlFriendAccount.getPhoneNumber());
        System.out.println("---------------------------------------------");

        /*5. another specific args constructor with default values also. this will also achieve by calling constructor(all args)
         from another constructor(specific args) using 'this()' statement*/
        Account cousinAccount = new Account("praveen", "+94715624589");
        System.out.println("account number : " + cousinAccount.getAccountNumber());
        System.out.println("customer name : " + cousinAccount.getCustomerName());
        System.out.println("balance : " + cousinAccount.getBalance());
        System.out.println("email : " + cousinAccount.getEmail());
        System.out.println("contact number : " + cousinAccount.getPhoneNumber());


    }
}
