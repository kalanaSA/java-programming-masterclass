package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        * if statement identifies which statement(s) or code block to run based on the value of expression/specific condition.
        * use else if statement to test multiple conditions.
        * else block will execute after if or else if conditions were false.
        * conditions inside the if or else if can be one condition or multiple conditions.
         when one of the condition was true in if else statement section, it's automatically jumping out of the section
         after it's executed something in the code block that belongs to that condition. if one condition was true they
         are not going through the remain section to check other conditions.
        */
        boolean isGameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score > 5000) {
            System.out.println("your score greater than 5000");
        } else if (score <= 5000 && score < 1000) {
            System.out.println("your score was greater tha 1000 but less than or equals to 5000");
        } else {
            System.out.println("got here");
        }


        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        // int savedFinalScore = finalScore; X cannot resolve symbol finalScore, can't access variables that were created
        // inside the code block from outside the code block.

        /*
        * code block - { statements/code } code that define by the curly braces & code block can be 1 statement or multiple :
        they are able to access variables that were created outside the code block. but we can't access variables that
        created inside the code block from outside the code block. because variables that were created inside the code block are
        delete from memory after executing the code inside the code block. if else statements, methods, loops etc. have code blocks.
        * scope - variables inside the code block called scope. And scope really deals with accessibility of variables in
        certain situations or in certain places in the code for example code block.
        */

        //challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (isGameOver) {
            int finalScore = score + (levelCompleted * bonus); //we can recreate same finalScore variable in this code block
            // also. because it was deleted after execution of above code block. so we can recreate another variable with the same name.
            System.out.println("Your final score was " + finalScore);
        }

        /*
         * in above, we were coping & pasting code (duplicate code), main disadvantage of duplicating is if we need to make change
         * we need to do is change it in more than one place, and it may occur errors. solution for duplication is concept called method.
         */

    }
}
