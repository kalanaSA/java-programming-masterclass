package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit, "New York");
        addInOrder(placesToVisit, "Boston");
        addInOrder(placesToVisit, "Houston");
        addInOrder(placesToVisit, "Chicago");
        addInOrder(placesToVisit, "San Antonio");
        addInOrder(placesToVisit, "Omaha");
        printList(placesToVisit);

        /* Java have implemented the LinkedList as a 'double LinkedList'. it stores a reference/link to the previous item(.previous()), as well as a link to the next entry(.next()).
           So it gives us ability go back in both directions(forward/backward). let's try this with enhance program that allows us to decide when to move onto next city and also
           previous city we've already visited.    */
        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            int comparison = listIterator.next().compareTo(newCity);

            if (comparison == 0) {
                //equal, don't add(avoid duplication)
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //lexicographically greater than the newCity, new city should appear before this
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //lexicographically less than the newCity, moved on to the next record
            }
        }//end-of-while loop

        linkedList.add(newCity); //belongs to the end
        return true;
    }

    /**
     * method that gives option of specifying whether we want to go forward or backward
     */
    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;  // to track the direction

        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
            case 0:
                System.out.println("Holiday(Vacation) over");
                quit = true;
                break;

            case 1:
                //there's an extra check, when if we're moving from one direction to another.(line 135)
                if (!goingForward) { // we were going backward, but if user selected to go next
                    //check whether we can go forward, if possible go to the next entry. so we can continue where we left off.
                    if (listIterator.hasNext()) {
                        listIterator.next(); //there's an extra .next()/previous() if we're moving from one direction to another.
                    }
                    goingForward = true; //and point it to right direction
                }

                if (listIterator.hasNext()) {
                    System.out.println("Now visiting " + listIterator.next());
                } else {
                    System.out.println("Reached the end of the list");
                    goingForward = false; //when we reached the end, there is no more way to go forward. so change direction to backward.
                }
                break;

            case 2:
                //there's an extra check, when if we're moving from one direction to another.(line 135)
                if (goingForward) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous(); //there's an extra .next()/previous() if we're moving from one direction to another.
                    }
                    goingForward = false;
                }
                
                if (listIterator.hasPrevious()) {
                    System.out.println("Now visiting " + listIterator.previous());
                } else {
                    System.out.println("We're at the start of the list");
                    goingForward = true; //when we reached the start, there is no more way to go backward. so change direction to forward.
                }
                break;

            case 3:
                printMenu();
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nAvailable Actions: press");
        System.out.println("\n0 - to quit\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - print menu option");
    }

}

 /* problem: Well the problem is that Java does not implement the link list in quite the way that we've actually described. problem actually is that, listIterator
    has no current position as such. So it actually hovers between the items that would be returned when you go to previous, or you go to next. So if you go forward
    with one and then go back with two, then go forward with one etc., you never actually leave the city that you're actually in. So this is actually a problem.
                                      Element(0)   Element(1)   Element(2)   ... Element(n-1)
                 cursor positions:  ^            ^            ^            ^                  ^
  * reason: But there actually is a good reason for this. So, it's ahead of actually allowed access to the item at .next or previous in the normal way, Then an error
    would actually lead to loops in the list. So this is like a really sufficiently serious problem in the past that algorithms have been developed for detecting and
    fixing loops in structures like linked lists. so that's about this linked list sort of looping over itself. But the great thing is that Java have it set up in such
    a way, that that is not going to happen to you. So it doesn't really allow you to make that type of mistake where you'll get into a loop.
  * solution: What it does mean, is we need to keep tracking of which direction we're going, and allow for the in between nature of the iterator. So in other words,
    there's a little more work that you need to do to get that to work. But in the scheme of things, it's not really that hard.                                  */
