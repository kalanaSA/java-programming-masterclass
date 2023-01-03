package com.company;

//challenge
public class FindPrimeNumber {

    public static void searchPrimeNumbers() {
        int count = 0;
        for (int i = 50; i < 101 && count < 3; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            }
        }

        /*
        for (int i = 1; i < 101 && count < 3; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
        //break actually exit out of the for loop completely */

    }

    /*prime number can only divide evenly only by one or itself and has to be a whole number greater than one.
     *like if/switch statements inside the method with return type, if we return something in for-loop inside the method
      with return type for-loop & method won't execute anything even condition of for-loop not evaluate false. */
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        /*value of initialization variable set to 2 because we keep check by dividing passed value(n) from 2 to n.
          whole numbers haven't remaining when it divides by 1.
         *(n/2) is just optimization technique just to save a bit of time(less processing). considering (n/2) = n */
        for (int i = 2; i <= (n / 2); i++) {   // for (int i = 2; i <= (long) Math.sqrt(n); i++) {}  sqrt slightly fast & less processing than (n/2)

            System.out.println("looping " + i);
            if (n % i == 0) {
                System.out.println("return false");
                return false;
            }
        }
        return true;
    }
}