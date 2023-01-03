package com.company;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    /* toString() is a good way to quickly print out an overview of what that particular object for that class is actually set to.
     * if we don't override the 'toString' method coming from 'Object' class (which is parent/super class of every class in java), and if we use as it is we'll get something like
     'com.company.Song@2ef5e5e3' this. it's very much same to if we print an object directly(object reference will print like this, not object). */
    @Override public String toString() {
        return this.title + " : " + this.duration;
    }
}


