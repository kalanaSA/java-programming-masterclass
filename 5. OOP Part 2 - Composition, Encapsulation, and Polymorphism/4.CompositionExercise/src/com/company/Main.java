package com.company;

public class Main {

    public static void main(String[] args) {

        Room room = new Room("Room #1");
        room.turnOnAirConditioner();
        room.coolDown(10);
        room.printRoom();
        room.turnOffAirConditioner();

    }
}
