package com.company;

public class RoomDimensions extends Dimensions {

    private double length;

    public RoomDimensions(double height, double width, double length) {
        super(height, width);
        this.length = (length < 0) ? 0 : length;
    }

    public double getLateralArea() {
        return 4 * getArea();
    }

    public double getVolume() {
        return getLateralArea() * length;
    }

    @Override
    public void printDimensions() {
        System.out.println("-------Room Dimensions--------------------");
        System.out.println("height : " + getHeight() + "ft, width: " + getWidth() + "ft, length = " + length + "ft, " +
                "lateral area = " + getLateralArea() + ", volume = " + getVolume() + "\n");
    }
}
