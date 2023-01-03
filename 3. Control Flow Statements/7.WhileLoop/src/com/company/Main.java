package com.company;

public class Main {

    public static void main(String[] args) {

        /* we can use while loops/statements when you might want to loop instead of specific number of times(for-loop),
         you might want to loop until certain expression evaluates to false. for example, you may not know how many times
         you want to loop ahead of time.
         * if we want to use variable in the condition we have to declare that variable outside the while-loop
         unlike for-loop that has initialization, condition & iteration in the same line.
         */

        int count = 1; //initialization
        while (count != 6) { //condition-: make sure going in the for very first time that expression doesn't evaluate false,
            // which means it won't execute any of the code.
            System.out.println("count value is " + count);
            count++; //iterator - when you use counter in your while loop don't forget to increment count(this statement)
            // otherwise it'll be infinite loop.
        }

        //for-loop that identical to above while-loop
        for (count = 1; count != 6; count++) { //initialization, condition, iterator
            System.out.println("count value is " + count);
        }

        //above while-loop but slightly different fashion. this while true is an infinite loop. but the way to get out of
        // the loop is done a test & break.
        count = 1;
        while (true) {
            if (count == 6) {
                break; //breaks out of the loop
            }
            System.out.println("count value is " + count);
            count++;
        }

        //challenge ----------------------------------------------------------------------------------------------------
        int number = 4;
        int finishNumber = 20;
        count = 0;
        int sum = 0;

        while (number <= finishNumber) {  // while (number <= finishNumber && count < 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //skip part of the code (depending on the if condition) - by continue statement loop will bypass
                // the part of code block that is below and continue with the next iteration. continue won't do any code
                // any further down & goes back to the start of the loop instead. so loop get finished & goes back & start
                // on the next number again.
            }
            count++;
            sum += number;
            System.out.println("Even number " + number);

            if (count > 4) {
                break; //exit the loop (depending on the if condition)
            }
        }

        System.out.println("sum of first 5 even numbers = " + sum);

    }


    //challenge --------------------------------------------------------------------------------------------------------
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}
    /*
     * both break & continue to have the effect of interrupting the code.
     * break - stop executing code down below after break statement & stop whole loop statement/loop process.
     * continue - it's allows the loop to continue, but it doesn't actually process any more code any further down in the
     while-loop, it just goes right straight to the end of the loop and then back on start again while condition is actually
     still valid. it says stop where you are and continue on to the next iteration of while loop.
     */