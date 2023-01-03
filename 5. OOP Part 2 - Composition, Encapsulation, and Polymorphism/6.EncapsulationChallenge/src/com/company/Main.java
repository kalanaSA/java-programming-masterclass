package com.company;

public class Main {

    public static void main(String[] args) {

        //we are using encapsulation, so we aren't access fields directly.(we can't access fields directly because they are private)
        Printer printer = new Printer("printer 1", 10, true);
        System.out.println("initial page count = " + printer.getPrintedPages());
        int pagesPrinted = printer.printPages(5);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count for printer = " + printer.getPrintedPages());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count for printer = " + printer.getPrintedPages());

        System.out.println("toner level = " + printer.getTonerLevel() + "%");
        System.out.println("added toner amount was " + printer.fillUpToner(80) + "%, " +
                "new toner level now " + printer.getTonerLevel() + "%");

        //reached maximum toner level, denied this action
        System.out.println("added toner amount was " + printer.fillUpToner(20) + "%, " +
                "new toner level now " + printer.getTonerLevel() + "%");


    }
}
