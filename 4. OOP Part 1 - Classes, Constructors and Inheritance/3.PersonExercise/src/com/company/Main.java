package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(12);
        System.out.println("is Teen = " + person.isTeen());
        System.out.println("full name : " + person.getFullName());

        person.setFirstName("kalana");
        System.out.println("full name : " + person.getFullName());

        person.setFirstName("");
        person.setLastName("sandakelum");
        System.out.println("full name : " + person.getFullName());

        person.setFirstName("kalana");
        person.setLastName("sandakelum");
        person.setAge(16);
        System.out.println("is Teen = " + person.isTeen());
        System.out.println("full name : " + person.getFullName());

        System.out.println("first name : " + person.getFirstName());
        System.out.println("last name : " + person.getLastName());
        System.out.println("age  : " + person.getAge());

    }
}
