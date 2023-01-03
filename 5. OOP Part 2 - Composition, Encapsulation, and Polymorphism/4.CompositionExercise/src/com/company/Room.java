package com.company;

public class Room {

    private String name;
    private RoomDimensions roomDimensions;
    private Wall north;
    private Wall east;
    private Wall south;
    private Wall west;
    private Wall ceiling;
    private Floor floor;
    private Lamp lamp;
    private AirConditioner airConditioner;

    public Room(String name) {
        this.name = name;
        this.roomDimensions = new RoomDimensions(20, 15, 8);
        this.north = new Wall("North", new Dimensions(40, 40));
        this.east = new Wall("East", "blue", new Dimensions(40, 30));
        this.south = new Wall("East", new Dimensions(40, 40));
        this.west = new Wall("West", "blue", new Dimensions(40, 30));
        this.ceiling = new Wall("ceiling", new Dimensions(40, 30));
        this.floor = new Floor("bamboo", new Dimensions(40, 30));
        this.lamp = new Lamp("classic", "orange");
        this.airConditioner = new AirConditioner("air conditioner 1");
    }

    //remove getters for access objects(fields) from outside & create methods for access those object's behaviors.
    public void turnOnAirConditioner() {
        airConditioner.turnOn();
    }

    public void turnOffAirConditioner() {
        airConditioner.turnOff();
    }

    public void warmUp(int celsiusAmount) {
        airConditioner.warmUp(celsiusAmount);
    }

    public void coolDown(int celsiusAmount) {
        airConditioner.coolDown(celsiusAmount);
    }

    public void printRoom() {
        System.out.println("room name : " + this.name);
        this.roomDimensions.printDimensions();
        this.north.printWall();
        this.east.printWall();
        this.south.printWall();
        this.west.printWall();
        this.ceiling.printWall();
        this.floor.printFloor();
        this.lamp.printSpecifications();
        this.airConditioner.printTemperature();
    }

    //no getters for access fields(objects in here) from outside
//    public String getName() {
//        return name;
//    }
//
//    public Wall getNorth() {
//        return north;
//    }
//
//    public Wall getEast() {
//        return east;
//    }
//
//    public Wall getSouth() {
//        return south;
//    }
//
//    public Wall getWest() {
//        return west;
//    }
//
//    public Wall getCeiling() {
//        return ceiling;
//    }
//
//    public Floor getFloor() {
//        return floor;
//    }
//
//    public Lamp getLamp() {
//        return lamp;
//    }
//
//    public AirConditioner getAirConditioner() {
//        return airConditioner;
//    }
}
