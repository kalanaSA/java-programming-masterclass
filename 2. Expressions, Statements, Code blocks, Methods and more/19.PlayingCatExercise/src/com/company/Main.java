package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean isCatPlay = PlayingCat.isCatPlaying(false, 40);
//        boolean isCatPlay = PlayingCat.isCatPlaying(false, 35);
//        boolean isCatPlay = PlayingCat.isCatPlaying(true, 50);
        boolean isCatPlay = PlayingCat.isCatPlaying(false, 45);

        if (isCatPlay) {
            System.out.println("yes cat is playing");
        } else {
            System.out.println("no cat isn't playing");
        }


    }
}
