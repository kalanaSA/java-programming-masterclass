package com.company;

public class DataConverter {

    public static void printMegabytesAndKilobytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid parameter");
        } else {
            int megaByte = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + megaByte + "MB & " + remainingKiloBytes + "KB");
            //this is not a method with return type(with if-else statement), so this code should be inside else statement.
        }

    }


}
