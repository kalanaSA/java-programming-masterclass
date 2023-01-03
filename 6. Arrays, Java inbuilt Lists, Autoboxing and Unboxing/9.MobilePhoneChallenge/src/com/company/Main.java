package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone("0773381752"); //create an object of MobilePhone

    public static void main(String[] args) {

        boolean quite = false;
        int choice = 0;
        startPhone();
        printMenu();

        while (!quite) {

            System.out.print("\nEnter your choice(6 to show available actions) : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    System.out.println(mobilePhone.showMyPhoneNumber());
                    break;
                case 8:
                    quite = true;
                    System.out.println("Shutting down .......");
                    break;
                default:
                    System.out.println("Please enter valid choice");
                    //break;
            }

        }

    }

    private static void addNewContact() {

        System.out.print("Enter contact name : ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number : ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);

        boolean isCreated = mobilePhone.createNewContact(contact);
        if (isCreated) {
            System.out.println(name + " contact added successfully");
        } else {
            System.out.println(name + " contact is already exist");
        }
    }

    private static void updateContact() {
        System.out.print("Enter name of contact you want to update : ");
        String currentContactName = scanner.nextLine();
        Contact currentContact = mobilePhone.searchContact(currentContactName);

        if (currentContact == null) {
            System.out.println("there is a no contact called " + currentContactName + " to update");
            return;
        }

        System.out.print("Enter new contact name : ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter new phone number : ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newContactName, newPhoneNumber);

        Contact checkingContact = mobilePhone.searchContact(newContact.getName());
        if (checkingContact != null) {
            System.out.println(newContactName + " contact already is exist, please try again");
            return;
        }

        boolean isUpdated = mobilePhone.updateContact(currentContact, newContact);
        if (isUpdated) {
            System.out.println(currentContactName + " has been updated to " + newContactName + " successfully");
        } else {
            /* we shouldn't actually get an error because we've already done test beforehand to see whether it existed,
            but in a multi-user type world for example the record could have been deleted since the time we retrieved,
            determined whether it was on file or not. so it would be good to actually still test for that anyway */
            System.out.println("Error updating contact");
        }

    }

    private static void removeContact() {

        System.out.print("Enter name of contact you want to delete : ");
        String contactName = scanner.nextLine();
        Contact contact = mobilePhone.searchContact(contactName);

        if (contact == null) {
            System.out.println("there is no contact named " + contactName + " to delete");
            return;
        }

        boolean isDeleted = mobilePhone.removeContact(contact);
        if (isDeleted) {
            System.out.println(contactName + " has been deleted successfully");
        } else {
            /* we shouldn't actually get an error because we've already done test beforehand to see whether it existed,
            but in a multi-user type world for example the record could have been deleted since the time we retrieved,
            determined whether it was on file or not. so it would be good to actually still test for that anyway */
            System.out.println("Error deleting contact");
        }

    }

    private static void queryContact() {
        System.out.print("Enter contact name you want to find : ");
        String contactName = scanner.nextLine();

        Contact foundContact = mobilePhone.searchContact(contactName);
        if (foundContact == null) {
            System.out.println("there is no contact name " + contactName + " in your contact list");
            return;
        }
        System.out.println(foundContact.printContact());

    }

    private static void startPhone() {
        System.out.println("Starting ........");
    }

    public static void printMenu() {
        System.out.println("\nAvailable Actions : \nPress");
        System.out.println("1. Print list of contacts \n" +
                "2. Add new contact\n" +
                "3. Update contact\n" +
                "4. Remove contact\n" +
                "5. Search contact\n" +
                "6. Menu\n" +
                "7. print your contact number\n" +
                "8. Shut down\n");
    }

}
