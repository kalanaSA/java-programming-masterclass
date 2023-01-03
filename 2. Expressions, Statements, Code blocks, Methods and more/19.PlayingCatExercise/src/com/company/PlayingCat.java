package com.company;

public class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temperature) {

        int upperLimit = isSummer ? 46 : 36;
        return temperature > 26 && temperature < upperLimit;

//        if (!isSummer && (temperature > 26 && temperature < 36)) {
//            return true;
//        }
//        return isSummer && (temperature > 26 && temperature < 46);

    }

}
/*
 * in method with return type, if return type was boolean we can just return conditional expression unlike check condition &
 * return boolean value again.
 * */