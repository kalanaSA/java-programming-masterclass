package com.company;

public class Point {

    //instance variables/class fields
    private int x;
    private int y;

    //constructors
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //instance methods(3 overloaded methods called distance)
    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        double distance = Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2);
        return Math.sqrt(distance);
    }

    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }

    //setters & getters instance methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
