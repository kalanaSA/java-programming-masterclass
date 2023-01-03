package com.company;

public class Main {

    public static void main(String[] args) {

        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());
        System.out.println("--------------------");

        VipCustomer customer2 = new VipCustomer("kalana sandakelum", 500000.0, "kalana@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());
        System.out.println("--------------------");

        VipCustomer customer3 = new VipCustomer("hirushi perera", 200000.0);
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());
        System.out.println("--------------------");

    }
}
