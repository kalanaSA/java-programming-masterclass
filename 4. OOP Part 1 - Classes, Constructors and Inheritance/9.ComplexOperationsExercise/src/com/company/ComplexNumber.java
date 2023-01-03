package com.company;

public class ComplexNumber {

    //instance variables/class fields --------------------
    private double real;
    private double imaginary;

    //constructor(all args) -----------------------------
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //instance methods/behaviors -----------------------
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        this.real += number.getReal();   //this.real += number.real;
        this.imaginary += number.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        this.real -= number.getReal();
        this.imaginary -= number.getImaginary();
    }

    //getters(instance methods) ----------------------
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

}
