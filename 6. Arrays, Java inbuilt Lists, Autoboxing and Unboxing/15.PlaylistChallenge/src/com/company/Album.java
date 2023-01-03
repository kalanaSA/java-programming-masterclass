package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>(); //make sure to initialize, so that we can use it without getting any errors.
    }

    //wouldn't necessary to use boolean, but have used in these methods to make sure it's validated.

    /**
     * when we're adding the songs here, we need to add them in the same order that we need those songs to locate on this album. first added entry is track number 01.
     */
    public boolean addSong(String title, double duration) {
        //making sure we're not duplicating songs.
        if (findSong(title) == null) {
            return this.songs.add(new Song(title, duration));
        }
        return false;
    }

    /**
     * * Add the actual songs that are part of this album, to the passed playlist.<br>
     * * the mentioned song will be searched inside the album using track number, and then it will be added to the playlist <br>
     * * Normally we would hide the indexes from users of our classes. but songs on a real album actually do have a track number. so in here we're using that track number as a way to
     * reference(actual entries for this album).
     *
     * @param trackNumber passing the actual track number of a song on this album that we want to add to the passed playlist. track number equates to the index position in the actual arraylist (in real life track number starts from 1, but in arraylist counting starts from 0)
     * @param playList    passed playlist that we need to add songs from this album (parameter reference)
     */
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track: " + trackNumber);
        return false;
    }

    /**
     * * Add the actual songs that are part of this album, to the passed playlist.<br>
     * * the mentioned song will be searched inside the album using song name, and then will add to the playlist
     */
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song '" + title + "' is not in the album");
        return false;
    }

    private Song findSong(String title) {
        //for each: alternative way to go through a list of entries in any type of list. equivalent to normal for loop iterations. this is far easy to read.
        for (Song checkingSong : this.songs) {
            if (checkingSong.getTitle().equals(title)) {
                return checkingSong;
            }
        }
        return null;
    }

    public boolean removeSong(Song song) {
        return this.songs.remove(song);
    }
}

/* we could have added the actual 'addToPlaylist' in the actual song object itself. but we have chose to do was add it on the album because we're actually looking at the album when
 we're actually creating the playlist. but it would be equally valid if we decided to add the mechanism to add a song to the playlist, if we had that code in the actual 'Song' class.
 that would be perfectly fine to do it that way as well.         */
