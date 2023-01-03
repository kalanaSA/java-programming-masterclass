package com.company;

public class MinutesToYearsAndDaysCalculator {

    public static final String INVALID_VALUE_MESSAGE = "invalid value";

    public static String minutesToYearsAndDays(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int totalSeconds = (minutes * 60) + seconds;
        int year = minutes / (60 * 24 * 365);
        int remainingMinutes = (minutes % (60 * 24 * 365));
        int days = remainingMinutes / (60 * 24);
        remainingMinutes %= (60 * 24);
        int hours = remainingMinutes / 60;
        remainingMinutes %= 60;

        String yearsString = (year < 10 ? "0" + year : year) + " years ";
        String daysString = (days < 10 ? "0" + days : days) + " days ";
        String hoursString = (hours < 10 ? "0" + hours : hours) + "h ";
        String minutesString = (remainingMinutes < 10 ? "0" + remainingMinutes : remainingMinutes) + "m ";
        String secondsString = (seconds < 10 ? "0" + seconds : seconds) + "s";

        return totalSeconds + "s equals to " + yearsString + daysString + hoursString + minutesString + secondsString;

    }

    public static String minutesToYearsAndDays(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return minutesToYearsAndDays(minutes, remainingSeconds);

    }

}
