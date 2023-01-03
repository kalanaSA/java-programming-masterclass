package com.company;

public class Main {

    public static void main(String[] args) {

        //object creation
        SimpleCalculator simpleCalculator = new SimpleCalculator();

        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4);

        System.out.println("sum = " + simpleCalculator.getAdditionResult());
        System.out.println("sub = " + simpleCalculator.getSubtractionResult());
        System.out.println("mul = " + simpleCalculator.getMultiplicationResult());
        System.out.println("div = " + simpleCalculator.getDivisionResult());
        simpleCalculator.setFirstNumber(5.25);
        simpleCalculator.setSecondNumber(0);
        System.out.println("mul = " + simpleCalculator.getMultiplicationResult());
        System.out.println("div = " + simpleCalculator.getDivisionResult());

    }
}
