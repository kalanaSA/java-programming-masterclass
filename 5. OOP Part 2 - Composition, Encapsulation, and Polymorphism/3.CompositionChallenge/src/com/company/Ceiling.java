package com.company;

public class Ceiling {

    private double height;
    private String paintedColor;

    public Ceiling(double height, String paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //getters
    public double getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }

}
