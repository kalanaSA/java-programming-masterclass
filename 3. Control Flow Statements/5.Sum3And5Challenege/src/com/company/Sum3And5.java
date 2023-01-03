package com.company;

public class Sum3And5 {

    public static void sumThreeAndFive() {

        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1000 && count < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("found value: " + i);
            }
        }

        System.out.println("sum is " + sum);
    }

}

/*
for (int i = 1; i < 1000 && count < 5; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                count++;
                System.out.println("found value: " + i);
            }

            if(count == 5){
                break;
            }
        }
*/
