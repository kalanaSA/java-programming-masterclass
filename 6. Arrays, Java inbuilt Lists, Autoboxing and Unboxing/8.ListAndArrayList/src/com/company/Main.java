package com.company;

import java.util.Scanner;

/* Iterable<T> interface -> Collection<E> interface -> List<E> interface -> AbstractList<E> class -> ArrayList<E> class
   - E : the type of elements in this Collection/list/ArrayList
   - T : the type of elements returned by the Iterable
 * ArrayList is resizable(dynamic) array. in other words it handles the resizing automatically.
 * it handles it all internally, not only maintains a size of how many elements but also the capacity(the amount of
   memory that is reserved). And as elements are added to an array list, it's capacity grows automatically. so we don't
   need to worry about any of that resizing.                                                                          */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quite = false;
        int choice = 0;
        printInstructions();

        while (!quite) {

            for (int i = 0; i < 3; i++) {
                System.out.print("\nEnter choice : ");
                boolean isInt = scanner.hasNextInt();
                if (isInt) {
                    choice = scanner.nextInt();
                    System.out.println(".........................");
                    break;
                } else {
                    System.out.println("invalid input, try again");
                }
                scanner.nextLine();
            }
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    System.out.println("Thank you!");
                    quite = true;
                    break;
                default:
                    System.out.println("invalid choice selection, try again!");
                    printInstructions();
                    //break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To Print choice options.");
        System.out.println("\t 1 - To Print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the grocery list.");
        System.out.println("\t 3 - To modify an item in grocery list.");
        System.out.println("\t 4 - To remove an item from the grocery list.");
        System.out.println("\t 5 - To search for an item in the grocery list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Enter item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter current item you want to modify : ");
        String currentItem = scanner.nextLine();
        System.out.print("Enter replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item : ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item you are searching for : ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem) != null) {
            System.out.println("Found " + searchItem + " from grocery list");
            System.out.println(groceryList.onFile(searchItem));
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }


}
