package com.company;

public class Main {

    public static void main(String[] args) {

        Car ford = new Ford("Ford Aspire", 3);
        ford.startEngine();

        Car ferrari = new Ferrari("Ferrari 812", 10, true);
        ferrari.startEngine();

        Car forgettable = new Forgettable("Forgettable", 5);
        forgettable.startEngine();

    }
}
