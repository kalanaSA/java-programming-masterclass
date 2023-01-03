package com.example;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();  //mention type,generics as String. LinkedLists are type safe.
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        printList(placesToVisit);

        placesToVisit.add("New Castle");  //LinkedList manage the insertion order(insert value to the edge if it hasn't mentioned the index)
        printList(placesToVisit);
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit); //now 'Sydney' pointing to 'Alice Springs' and 'Alice Spring' pointing to the 'Melbourne'
        placesToVisit.remove(4);
        printList(placesToVisit); //now 'Brisbane' pointing to 'Canberra', before it was pointing to 'Perth'. so 'Perth' has been removed completely.
        /* actual linkedList inbuilt functionalities done these things(linking/unlinking records) automatically for us. with this mechanism if we have thousands of records, it's
        not really going to be slowdown in performance. because it's literally only changing one or two entries at the most and everything remains the same position unlike Arrays
        & ArrayLists.                                                                                                                                                           */


        /* Advantage of LinkedLists(things couldn't be done using Arrays,ArrayLists) : in above case we have to count into the list to find out the entry, index position to add or
        remove. So lets see how to add new cities alphabetical order unlike mentioning positions to add.                                                                                                                        */
        LinkedList<String> cities = new LinkedList<>();
        addInOrder(cities, "New York");
        addInOrder(cities, "Boston");
        addInOrder(cities, "Houston");
        addInOrder(cities, "Chicago");
        addInOrder(cities, "San Antonio");
        addInOrder(cities, "Omaha");
        addInOrder(cities, "Houston");
        printList(cities);

    }

    private static void printList(LinkedList<String> linkedList) {
        //Iterator is another way of accessing and going through all entries that are in particular Array, ArrayList or LinkedList etc.(equivalent to for loop)
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) { //go through all the records
            System.out.println("Now visiting : " + iterator.next()); /* iterator.next() : change the value of iterator. it's equivalent to i++ in for loop. it gives us the current
            record but that also then moves onto the next record as well. it's actually returning what the current value is before it moves on.                                                                                                           */
        }
        System.out.println("=====================================");
    }

    /* linkedList: parameter reference(refer actual linkedList, by doing this we don't have to create another LinkedList with correct order and return, we can make modifications
    directly to the origin linkedList by this parameter reference. because both are referencing to the same Object.                                                             */
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        /* similar to Iterator, it gives more flexibility than a traditional Iterator, and it's really made for situations like this where we're inserting and inserting certain
        records etc.                                                                                                                                                            */
        ListIterator<String> listIterator = linkedList.listIterator();

        while (listIterator.hasNext()) {
            //compare using String compareTo method
            int comparison = listIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, don't add(avoid duplication)
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //lexicographically greater than the newCity, new city should appear before this
                listIterator.previous(); /* we've already used .next() and so iterator already  moved onto the next record. so we have to move back to previous one. one that we're
                at. .previous() : can't do this with regular iterator that can only just go through records, but ListIterator unable us to go back to a previous record.        */
                listIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //lexicographically less than the newCity, moved on to the next record
            }
        }//end-of-while loop

        linkedList.add(newCity); //belongs to the end
        return true;
    }

}