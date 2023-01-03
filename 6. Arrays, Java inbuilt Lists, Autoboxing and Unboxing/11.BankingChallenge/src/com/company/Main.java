package com.company;

import java.util.Scanner;

/*
 * In here we've done all the operations using only bank instance because other branch, customer objects should have inside the bank object(parent object of the nested objects)
   in order to perform operations correctly.
 * We've tried in here to keep the functionality relating to each class separate. relationship between classes more important in this case(then Bank class would be calling code from other classes).
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean isExit = false;
    private static Bank aBank;

    public static void main(String[] args) {
        createBank();
        while (!isExit) {
            printMenu();
            System.out.print("\nEnter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            process(choice);
        }

    }

    public static void printMenu() {
        System.out.println(
            "\nWelcome!\n" + "1. Create a Branch\n" + "2. Open a Bank Account\n" + "3. Make a Transaction\n" + "4. List Of Customers\n" + "5. A Customer Details\n" + "6.EXIT");
    }

    public static void process(int choice) {
        switch (choice) {
        case 1:
            createBranch();
            break;
        case 2:
            openBankAcc();
            break;
        case 3:
            makeTransaction();
            break;
        case 4:
            getCustomerList();
            break;
        case 5:
            getCustomerDetails();
            break;
        case 6:
            quite();
            break;
        }
    }

    private static void quite() {
        isExit = true;
    }

    private static void getCustomerDetails() {
        System.out.print("Enter name customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter name branch name: ");
        String branchName = scanner.nextLine();
        Customer returnedCustomer = aBank.searchCustomer(branchName, customerName);
        if (returnedCustomer == null) {
            System.out.println("Failed getting customer details for customer : '" + customerName + "'");
            return;
        }
        System.out.println(returnedCustomer);
    }

    private static void getCustomerList() {
        System.out.print("Enter name branch name: ");
        String branchName = scanner.nextLine();
        System.out.print("show transactions(true/false): ");
        boolean showTransactions = scanner.nextBoolean();
        boolean isCustomerList = aBank.getCustomerList(branchName, showTransactions);
        if (!isCustomerList) {
            System.out.println("Retrieving customer list has been failed!");
        }
    }

    private static void makeTransaction() {
        System.out.print("Enter name of the customer: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the name of the branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the amount of transaction: ");
        double transactionAmount = scanner.nextDouble();
        scanner.nextLine();

        boolean isTransactionSucceed = aBank.addCustomerTransaction(branchName, customerName, transactionAmount);
        if (!isTransactionSucceed) {
            System.out.println("Transaction has been failed! amount: '" + transactionAmount + "'");
            return;
        }
        System.out.println("Transaction has been completed successfully!");
    }

    private static void openBankAcc() {
        System.out.print("Enter name of the customer: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the branch Name: ");
        String branchName = scanner.nextLine();
        System.out.print("Enter the initial amount of deposit: ");
        double iniDeposit = scanner.nextDouble();
        scanner.nextLine();
        Customer aCustomer = new Customer(customerName, address, age, iniDeposit);
        String createdCustomerName = aCustomer.getName();

        boolean isCustomerAdded = aBank.addCustomer(branchName, aCustomer);
        if (!isCustomerAdded) {
            System.out.println("Account creation for customer: '" + createdCustomerName + "' has been failed");
            return;
        }
        System.out.println(createdCustomerName + " account has been create successfully!");
    }

    private static void createBranch() {
        System.out.print("Enter name of the new branch:");
        String branchName = scanner.nextLine();
        System.out.print("Enter the location of new branch:");
        String location = scanner.nextLine();
        Branch aBranch = new Branch(branchName, location);
        boolean isBranchAdded = aBank.addNewBranch(aBranch);
        if (!isBranchAdded) {
            System.out.println("'" + branchName + "' branch creation has been failed");
            return;
        }
        System.out.println("'" + branchName + "' branch has been create successfully!");
    }

    private static void createBank() {

        aBank = new Bank("Sampath Bank", "L1002");
        System.out.println(aBank.getName() + " has been create successfully!");
    }

}




















