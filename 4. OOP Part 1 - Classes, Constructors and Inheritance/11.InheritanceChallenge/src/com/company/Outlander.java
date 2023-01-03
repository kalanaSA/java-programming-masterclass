package com.company;

public class Outlander extends Car {

    private int roadServiceMonths;

    /*provide hardcode values for size,wheels,doors,gears,isManual by assuming we have only one type of outlander. we can
      hardcode vehicle name as outlander because this is a outlander class so we know it's a outlander. */
    public Outlander(int roadServiceMonths) {
        super("outlander", "4wd", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    @Override
    public void stop() {
        super.stop();
        changeGear(1);
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop(); //first search for override version to call, if there isn't one call super class method.
            //changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(2);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(3);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(4);
        } else if (newVelocity > 30 && newVelocity <= 40) {
            changeGear(5);
        } else if (newVelocity > 40 && newVelocity <= 50) {
            changeGear(6);
        }

        //to assign newVelocity to currentVelocity
        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }

    }

}