package com.company.composition;

  /* obvious advantage of composition is if you're using the extends option to inherit, in java you can extend only one
  class at a time. so we run into limitations quite quickly if we're using standard java inheritance where we can only
  extend from one class. so we can use compositions instead.
   */

//public class PC extends Case,Monitor,Motherboard{
public class PC {

    private Case theCase;  //Pc has Case
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //getters for access private class fields(actually objects in this case)
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
