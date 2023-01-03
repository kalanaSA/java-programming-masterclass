package com.company;

public class Wall {

    private String name;
    private String color;
    private Dimensions dimensions;

    public Wall(String name, Dimensions dimensions) {
        this(name, "white", dimensions);
    }

    public Wall(String name, String color, Dimensions dimensions) {
        this.name = name;
        this.color = color;
        this.dimensions = dimensions;
    }

    public void printWall() {
        System.out.println(this.name + " wall, colour : " + this.color);
        this.dimensions.printDimensions();
    }


}
