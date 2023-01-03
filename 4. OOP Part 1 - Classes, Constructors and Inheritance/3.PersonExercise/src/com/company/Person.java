package com.company;

public class Person {

    //class fields/instance variables(with private access modifier) (not static variables) -----------------------------
    private String firstName;
    private String lastName;
    private int age;

    //setters & getters /instance methods (not static methods/public instead of public static) -------------------------
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        //validation for create a valid object
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    //another instance methods -----------------------------------------------------------------------------------------
    public boolean isTeen() {
        //validation for this instance method
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        //fullName is a just local variable(not a class field/instance variable or static variable)
        String fullName = "";
        if (!this.firstName.isEmpty() && !this.lastName.isEmpty()) {
            fullName = " ";
        }
        return this.firstName + fullName + this.lastName;

//        if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
//            return "";
//        } else if (this.lastName.isEmpty()) {
//            return firstName;
//        } else if (this.firstName.isEmpty()) {
//            return this.lastName;
//        } else {
//            return this.firstName + " " + this.lastName;
//        }
    }

}
