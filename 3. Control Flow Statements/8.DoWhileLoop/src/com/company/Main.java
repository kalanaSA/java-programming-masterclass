package com.company;

public class Main {

    public static void main(String[] args) {

        /* while-loop check the condition at the start before executing the block, but with do-while-loop the code block
           is executed at once and then the condition is checked.
         * do-while loops are very similar to while loops, and only real difference is do-while-loop execute
           code block once/do one iterate anyway even if the test condition was true or false.
         * do-while loops will always execute at least once & if not more times depending on the way you've
           defined your test/conditional expression.
         * be careful with conditional expression when using any loops, it may cause infinite loops & loop that never executes.
         */

        int count = 1;

        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

        count = 1;
        do {
            System.out.println("count value is " + count);
            count++;
        } while (count != 6); //expression to test see whether we should exit the do-while or not is at the end.


        count = 6;
        do {
            System.out.println("count value is " + count);
            count++;
            if (count > 10) {  //used break statement to stop this infinite loop.
                break;
            }
        } while (count != 6);


    }
}
