package com.company;

public class Floor {

    private String flooring;
    private Dimensions dimensions;

    public Floor(String flooring, Dimensions dimensions) {
        this.flooring = flooring;
        this.dimensions = dimensions;
    }

    public void printFloor() {
        System.out.println("--------------- Floor ---------------");
        System.out.println("flooring : " + flooring);
        dimensions.printDimensions();
    }

}
