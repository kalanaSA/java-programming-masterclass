package com.company;

import java.util.Scanner;

public class ReadingUserInput {

    public static int sumOfTenNumbers() {
        int sum = 0;
        int validCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (validCount < 10) {
            System.out.println("Enter number " + (validCount + 1) + " : ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                validCount++;
            } else {
                System.out.println("Invalid Input!");
            }

            scanner.nextLine(); /*handle the end of line/ handle Enter key being pressed & remove any invalid input from
            the scanner & it's also ensures that we don't accidentally end up in an endless loop due to unforeseen input.
            we can put this nextLine() statement inside the both if and else or after the else statement to trigger
            after execute if or else. however since the user did enter content it would need to be read & removed from
            the scanner before additional content is entered. so since the nextLine() call handles that by reading input
            and not storing it, it needs to be after the else statement not only in the if statement. otherwise invalid
            content would not be removed & our application wouldn't run as desired.  */

        }

        scanner.close();
        return sum;


//        while (validCount < 10) {
//            System.out.println("Enter number " + (validCount + 1) + " : ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                scanner.nextLine();
//                sum += number;
//                validCount++;
//                continue;
//            }
//            System.out.println("Invalid Input!");
//            scanner.nextLine();
//
//        }
//        scanner.close();
//        return sum;


//        while (true) {
//            System.out.println("Enter number " + (validCount + 1) + " : ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                sum += number;
//                validCount++;
//                if (validCount == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Input!");
//            }
//
//            scanner.nextLine();
//        }
//        scanner.close();
//        return sum;


//        for (int i = validCount; i < 10; i++) {
//            System.out.println("Enter number " + (i + 1) + " : ");
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                sum += number;
//            } else {
//                System.out.println("Invalid Input!");
//                i--;
//            }
//            scanner.nextLine();
//        }
//        scanner.close();
//        return sum;

    }

}