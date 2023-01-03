package com.company;

import java.util.ArrayList;

public class GroceryList {

    /* defining a new ArrayList - array of objects
     * ArrayList<E>, E - defining type of ArrayList(the type of elements in the ArrayList). this is different from an arrays
       because ArrayList can hold objects but cannot hold primitive data types such as int, double, char, and long.
       but an arrays can hold both primitive types & objects.
       int[] array = new int[50];
       Item[] item = new Item[10];
       private ArrayList<int> groceryList = new ArrayList<int>(); - X Type argument cannot be of primitive type
     * ArrayList is actually builtin java class. so it can have its own constructor. by adding () parenthesis
       to the end what we're going to be doing is calling an empty/default constructor.
     * And no need to define how many elements in the ArrayList like in arrays(directly or indirectly) when declare &
       initialize it. because ArrayLists are resizeable anytime & it handles that for us automatically.                                 */
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        /*String[] array = {"milk","jelly","oats","chicken"} or
          array[0] = item;  we have to address each element by a particular number to save value for an array(saving a
          value into a particular element).

        .add() - no need to specify index of array to save a value. take care of where to save element(add the new value to end
        of the ArrayList automatically), how many elements can we assign to ArrayList(because ArrayList is resizable), the
        amount of spaces to allocate and so on. ArrayList manage All functionalities automatically. that's abstracted away from us.                                                                               */
        groceryList.add(item);
        System.out.println(item + " added successfully");
    }

    public void printGroceryList() {
        if (groceryList.size() != 0) {
            System.out.println("You have " + groceryList.size() + " items in your grocery list.");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        } else {
            System.out.println("you have no any item in the grocery list yet!");
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position > -1) {
            modifyGroceryItem(position, newItem);
        } else {
            System.out.println("there is no item called " + currentItem + " in the list to update, please try again");
        }
    }

    private void modifyGroceryItem(int position, String item) {  //make private, methods that we don't want to access from outside, only this class only.
        //array[position] = item;
        //groceryList.add(position, item); add new element to the specific index by pushing currently exist element to the next index.
        String previousItem = groceryList.get(position);
        groceryList.set(position, item);
        System.out.println("grocery item : " + previousItem + " has been updated to : " + item);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position > -1) {
            removeGroceryItem(position);
        } else {
            System.out.println("there is no item called " + item + " in the list to delete, please try again");
        }
    }

    private void removeGroceryItem(int position) {  //make private, methods that we don't want to access from outside, only this class only.
        /*remove() - after remove an element in the ArrayList, fulfill that index(position) with next value in the ArrayList.
         And  this will flow until the end of the ArrayList & all these things will happen automatically & manage by ArrayList.
         in Arrays can't remove value from array, only replace value. because arrays are not resizable.*/
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("grocery item : " + theItem + " has been removed from list!");
    }

    private int findItem(String searchItem) {  //make private, methods that we don't want to access from outside, only this class only.
        return groceryList.indexOf(searchItem);
    }

    public String onFile(String searchItem) {
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            int index = findItem(searchItem);
            return groceryList.get(index); //return searchItem;
        }
        return null;
    }


    /*
    ArrayList<String> groceryList = new ArrayList<String>();
    String item = "egg";
    groceryList.add(item);
    int position = indexOf(item);
    groceryList.add(position, item);
    groceryList.set(position, item);
    groceryList.get(position);
    groceryList.remove(position);
    */

}