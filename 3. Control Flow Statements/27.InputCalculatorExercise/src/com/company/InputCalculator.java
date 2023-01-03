package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        double sum = 0.0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter value : ");
            boolean isDouble = scanner.hasNextDouble();

            if (isDouble) {
                double number = scanner.nextDouble();
                scanner.nextLine();
                sum += number;
                count++;
            } else {
                //double average = (sum / count);
                break;
            }
            //scanner.nextLine(); in this case we'll not take any inputs(indicate that using break statement) after enter
            // invalid input(if entered value not double)/else statement. but we can put this statement here without any
            // problem. but only the place that we need to put this statement is in if-statement after the scanner.nextDouble() .
        }

        double average = (sum / count);
        System.out.println("sum = " + sum + ", average = " + String.format("%.2f", average));
    }

}
