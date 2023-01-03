package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        * we use for-loops to iterate processing set of statements/code block for a given number of times. when if we know specific
          number of time that we want to iterate.
        * for loop/statement - use to loop some code, in other words allow us to execute code a certain number of time.
          it repeatedly loops something until a condition is satisfied(processing certain amount of code/code block given
          number of times or until a particular condition is satisfied).
        * you can have a loop to go either forward or backward it just depends on the conditions that you're typing in there
          & you just need to make sure you get your range correct.
        * for(init; termination/condition; increment){ code that loop }
          -init step: code that is going to be initialized once at the start of the loop. it's typical in scenarios with for loops
          to start  with '0' because a lot of java things(ex:arrays) start at '0'. but we don't have to start with 0, we can
          change it to any value.
          -termination/condition step : we tell how we want to exit(what's needs to be false to be able to allow the loop exit).
          loop code-block until condition evaluate false. condition should be true when its first iteration, otherwise never happen loop.
          -iteration step(increment/decrement) : expression that's invoke after each iteration of the loop each time the loop goes round.
          sort of like a count. one execution of the loop step is known as one iterator.
        * variables that are declared and initialized in for loops, only exist for that code block. after finished executing that
          for-loop statement they will erase from memory(ex: i,j,k) like any other statement that has in code blocks(if,methods,for,while etc)
        */


        for (int i = 0; i < 5; i++) {
            System.out.println("loop " + i);
        }

        //when you doing for-loop you start with the first element number/initialization variable you want to start with and in this case it's '2'.
        for (int i = 2; i < 9; i++) {
            //System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));  //output the number with just 2 decimal points.
            //this 'i' should be type double(because calculateInterest method's second parameter's type is double) but java smart enough
            //to convert whole number integer to a double. you can cast it as a double there, but it isn't necessary.

        }

        System.out.println(".....................");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        //challenge ----------------------------------------------------------------------------------------------------
        //System.out.println(FindPrimeNumber.isPrime(4));
        FindPrimeNumber.searchPrimeNumbers();

    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

}
