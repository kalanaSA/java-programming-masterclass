package com.company;

public class Main {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("kalana", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("praveen", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("praveen", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) { // (score >= 500 && score < 1000) Condition 'score < 1000' is always 'true' when reached
            return 2;
        } else if (score >= 100) {  // (score >= 100 && score < 500) Condition 'score < 500' is always 'true' when reached
            return 3;
        } else {
            return 4;
        }

        /* another way to implement
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
        */
    }


}
