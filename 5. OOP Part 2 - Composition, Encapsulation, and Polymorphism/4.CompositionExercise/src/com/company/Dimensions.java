package com.company;

public class Dimensions {

    private double height;
    private double width;

    public Dimensions(double height, double width) {
        this.height = (height < 0) ? 0 : height;
        this.width = (width < 0) ? 0 : width;
    }

    public double getArea() {
        return height * width;
    }

    public void printDimensions() {
        System.out.println("height = " + height + "ft, width = " + width + "ft, Area = " + getArea() + "\n");
    }

    //getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

}
