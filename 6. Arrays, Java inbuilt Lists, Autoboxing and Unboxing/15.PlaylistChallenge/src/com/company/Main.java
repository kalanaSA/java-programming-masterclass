package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        //create playlist
        Album album = new Album("Believe", "Justin Bieber");
        album.addSong("All around the world", 3.12);
        album.addSong("Be alright", 4.36);
        album.addSong("Beauty and a beat", 5.85);
        album.addSong("One Love", 3.45);
        albums.add(album);

        album = new Album("Fine Line", "Harry Style");
        album.addSong("Golden", 3.29);
        album.addSong("Adore You", 3.27);
        album.addSong("Watermelon Sugar", 2.54);
        album.addSong("To Be So Lonely", 3.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        Album believeAlbum = albums.get(0);  //'Believe' album
        believeAlbum.addToPlayList("All around the world", playList);
        believeAlbum.addToPlayList("One Love", playList);
        believeAlbum.addToPlayList(2, playList); /* exist in a different album - we've bound 'addPlayList' functionality to 'Album' class. so we can't add a song to
        the playlist that isn't belongs to that particular album. first it(song) has to match(index or song name), secondly it has to be a song that was added to that album.
        otherwise it's going to get an error.   */
        believeAlbum.addToPlayList("Adore You", playList);

        Album fineLineAlbum = albums.get(1);  //'Fine Line' album
        fineLineAlbum.addToPlayList("Watermelon Sugar", playList);
        fineLineAlbum.addToPlayList(1, playList);
        fineLineAlbum.addToPlayList("The rain", playList); //does not exit, shouldn't work.
        fineLineAlbum.addToPlayList(24, playList); //there is no track 24

        //play playlist
        play(playList);

    }

    private static void play(LinkedList playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.isEmpty()) {
            System.out.println("No songs in the playlist, please add songs to the list first");
            return;
        } else {
            System.out.println("Now playing '" + listIterator.next().toString() + "'");
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
            case 1:
                //quite
                System.out.println("Player closed");
                quit = true;
                break;
            case 2:
                //skip
                if (!goingForward) {
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    }
                    goingForward = true;
                }
                if (listIterator.hasNext()) {  //to avoid NoSuchElementException
                    System.out.println("Now Playing '" + listIterator.next().getTitle() + "'");
                } else {
                    System.out.println("We've Reached the end of the playlist");
                }
                break;

            case 3:
                //previous
                if (goingForward) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    goingForward = false;
                }
                if (listIterator.hasPrevious()) {  //to avoid NoSuchElementException
                    System.out.println("Now playing '" + listIterator.previous().getTitle() + "'");
                } else {
                    System.out.println("We're at the start of the list");
                }
                break;
            case 4:
                //replay: have implemented taking advantage of the fact that the ListIterator is actually somewhere between previous & next.
                if (goingForward) {
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing '" + listIterator.previous().toString() + "'");
                        goingForward = false; //replaying song means going backward
                    } else {
                        System.out.println("We're at the start of the playlist");
                    }
                } else {
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing '" + listIterator.next().toString() + "'");
                        goingForward = true;
                    } else {
                        System.out.println("We've reached the end of the playlist");
                    }
                }

                break;
            case 5:
                //show play list
                printPlayList(playList);
                break;
            case 6:
                //remove song from play list
                /* !playList.isEmpty() - we may think probably don't need this, because we did this test above in this method. but since we introduce remove functionality, could
                have deleted all the records, so it's better to check each time to avoid it throw error/exception automatically.                                                                                                  */
                if (!playList.isEmpty()) {
                    listIterator.remove(); //removing current one
                    //if we delete a song from the playlist which is currently playing, by default the next song automatically starts playing.
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if (listIterator.hasPrevious()) {
                        //but if we happen to be end of the playlist, then it would go back to the previous song.
                        System.out.println("Now playing " + listIterator.previous());
                    }
                }
                break;
            }
        }
    }

    private static void printPlayList(LinkedList playList) {
        /* because we're not going both backward and forwards(only forward) in here, we don't need to use ListIterator. regular Iterator would be enough. both are very much to
        same, but Iterator doesn't give us a capability of going backwards, only continually go through forward. perfect for sort of looping through something once.         */
        Iterator iterator = playList.iterator();
        System.out.println("=====================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("=====================================");
    }

    private static void printMenu() {
        System.out.println("1. Quit\n" + "2. Skip\n" + "3. Previous Song\n" + "4. Replay\n" + "5. List of songs\n" + "6. remove this song from play list");
        System.out.println("Please select the option : ");
    }

}

/* issue in removing song: if we try and delete currently playing song, it'll work. but if we try to delete again, we actually get an error(IllegalStatementException). so actual
   issue is here is to do with the way that the ListIterator is actually set up the linked-list. so it can only be made once per call to next or previous. so it actually throws an
   exception if neither the .next() or .previous() has been called. so in other words,each time we delete a record then we've to do .next() or .previous() to avoid getting an error
if you try to do it again. so we need to guard against that and that's actually built into the linked-list code itself.
    solutions 1: trap the exception(haven't dealt with exception yet) (try code and catch that error/exception if it's comes through in that code and perform some action to guard against that)
    solutions 2: just change the code to avoid this 'exception coming'. if we can do that, we're not actually getting these exceptions, that's good rather than dealt with exceptions.
                 code change: ensure we call either .next() or .previous() immediately after removing a song. that'll ensure if we try to delete the next record we don't actually get an error again.
*/

  /*
  * Create a program that implements a playlist for songs
  * Create a Song class having Title and Duration for a song.
  * The program will have an Album class containing a list of songs.
  * The albums will be stored in an ArrayList.
  * Songs from different albums can be added to the playlist and will appear
    in the list in the order they are added.
  * Once the songs have been added to the playlist, create a menu of options to :-
    Quit, Skip forward to the next song, skip backwards to a previous song.
    Replay the current song. List the songs in the playlist.
  * A song must exist on an album before it can be added to
    the playlist (so you can only play songs that you own that you've already got in your catalog).
  * Hint: To replay a song, consider what happened when we
    went back and forth from a city before we started
    tracking the direction we were going.
  * As an optional extra, provide an option to remove the current song from
    the playlist (hint: listIterator.remove())
*/