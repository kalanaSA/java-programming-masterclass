package com.company;

public class SecondsAndMinutesChallenge {

    /* constant is a variables that cannot change the value once we've assigned a value. when we repeat same value(string, int,
     double etc.)more than one place we can use constant instead of repeating value & it'll help to prevent from typos. final
     keyword used to make constant.we used static keyword that's because  we're using this constant in static methods. if we change
     the value of constant both methods affect it. to use this constant for both methods we declared it outside the methods.*/
    public static final String INVALID_PARAMETER_MESSAGE = "Invalid Parameter!";

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_PARAMETER_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = (hours < 10 ? "0" + hours : hours) + "h ";
        String minutesString = (remainingMinutes < 10 ? "0" + remainingMinutes : remainingMinutes) + "m ";
        String secondsString = (seconds < 10 ? "0" + seconds : seconds) + "s";

        return hoursString + minutesString + secondsString; //we can use join in java for join 3 strings also.
    }

    public static String getDurationString(long seconds) {

        if (seconds < 0) {
            return INVALID_PARAMETER_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }

}
