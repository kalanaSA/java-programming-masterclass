package com.company;

public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalKilos = (bigCount * 5) + smallCount;
        if (totalKilos == goal) {
            return true;
        } else if (totalKilos < goal) {
            return false;
        }

        

    }

}
