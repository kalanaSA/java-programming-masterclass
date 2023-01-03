package com.company;

//composition - creating objects within objects(composite 2 or more objects together)
public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(com.company.Case theCase, Monitor monitor, com.company.Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    /* instead of creating getters to access these class fields(actually objects) from outside to call behaviors of these objects.
     create methods to access them. so we don't need to access these objects directly from outside to call behaviors. */
    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
        startProgram();
    }

    private void drawLogo() {
        //fancy graphics
        monitor.drawPixelAt(1200, 5, "green");
    }

    private void startProgram() {
        motherboard.loadProgram("windows 7");
    }

    //getters
//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
