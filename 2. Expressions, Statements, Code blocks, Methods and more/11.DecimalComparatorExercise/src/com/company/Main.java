package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean isEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//        boolean isEqual = DecimalComparator.areEqualByThreeDecimalPlaces(6.456, 4.452);
        boolean isEqual = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);

        if (isEqual) {
            System.out.println("both double numbers are the same up to three decimal places");
        } else {
            System.out.println("double numbers are not same up to three decimal places");
        }

    }
}
