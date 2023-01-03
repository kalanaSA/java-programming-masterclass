package com.company;

public class Main {

    /* inheritance gives us lots of flexibility to model real world object in software.
     * inheritance very powerful & save lot of coding.     */

    public static void main(String[] args) {

        Outlander outlander = new Outlander(36);
        outlander.accelerate(12);

        System.out.println(".......................");
        outlander.steer(45);
        outlander.accelerate(30);

        System.out.println(".......................");
        outlander.accelerate(-5);

    }
}
