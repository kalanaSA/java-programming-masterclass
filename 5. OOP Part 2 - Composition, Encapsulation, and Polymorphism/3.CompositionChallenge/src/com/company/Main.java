package com.company;

public class Main {

    public static void main(String[] args) {

        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("east");
        Wall wall3 = new Wall("south");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(12, "white");
        Bed bed = new Bed("Modern", 2, 3, 2, 1);
        Lamp lamp = new Lamp("classic", false, 75);

        BedRoom bedRoom = new BedRoom("kalana's BedRoom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        //calling object(field) directly via getter to call behaviors of that object
        bedRoom.getBed().makeBed();
        bedRoom.getLamp().turnOn();

        //calling object's behaviors from methods
        bedRoom.makeBed();
        bedRoom.lampTurnOn();

    }
}
