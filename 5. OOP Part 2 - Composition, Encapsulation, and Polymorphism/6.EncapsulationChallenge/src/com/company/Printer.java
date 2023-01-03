package com.company;

/*we use encapsulation to hide the functionality(internal workings) of this class from outside the class. so we can't access this
 any field directly from other class & we've got proper methods that actually doing the appropriate functionality. so if we use this
 class in another class, we've got no idea of the internal working of this class. And in fact we don't need to know it. because all we
 doing is we're using any of these methods that have been set to public(scope of public) And we have to use those in a correct manner. */
public class Printer {

    //private fields
    private String name;
    private double tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    /*constructor to initialize private fields(can't access fields directly from outside of this class because of fields
    are private. so constructor help to initialize fields. we can use setters also initialize & change after initialized.) */
    public Printer(String name, double tonerLevel, boolean isDuplex) {
        this.name = name;
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.printedPages = 0; //set to 0 because default initial value for this field should be zero.
        this.isDuplex = isDuplex;
    }

    //behaviors/instance methods
    public double fillUpToner(double tonerAmount) {   //setter as a function
        if (this.tonerLevel + tonerAmount > 100 || tonerAmount < 0) {
            System.out.println("Toner level : " + (this.tonerLevel + tonerAmount) + "% maximum level reached!, denied this action.");
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return tonerAmount;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            System.out.println("printing in duplex mode");
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2); //to avoid error could happen, if odd number of pages in duplex mode
        }
        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }

    //define needed getters(behaviors/instance methods)
    public int getPrintedPages() {
        return printedPages;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }
}
