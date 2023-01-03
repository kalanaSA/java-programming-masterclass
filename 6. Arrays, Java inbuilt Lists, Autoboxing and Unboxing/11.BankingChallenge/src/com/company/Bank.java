package com.company;

import java.util.ArrayList;

public class Bank {

    private String name;
    private String licence;
    private ArrayList<Branch> branches; //composition over inheritance

    public Bank(String name, String licence) {
        this.name = name;
        this.licence = licence;
        this.branches = new ArrayList<>();
    }

    public boolean addNewBranch(Branch branch) {
        if (this.searchBranch(branch.getName()) == null) {
            return branches.add(branch);
        }
        System.out.println("Something Went Wrong! '" + branch.getName() + "' branch already exist");
        return false;
    }

    public boolean getCustomerList(String branchName, boolean showTransactions) {
        Branch existingBranch = this.searchBranch(branchName);
        if (existingBranch != null) {
            ArrayList<Customer> existingCustomers = existingBranch.getCustomers();
            if (!existingCustomers.isEmpty()) {
                System.out.println("\nCustomers of '" + branchName + "' branch:\n");
                for (Customer customer : existingCustomers) {
                    System.out.println("#customer: " + customer.getName());
                    ArrayList<Double> transactions = customer.getTransactions();
                    if (showTransactions && transactions != null) {
                        System.out.println(" transactions have made:");
                        for (Double trans : transactions) {
                            System.out.println("  * amount:" + trans + " LKR");
                        }
                        System.out.println();
                    }
                }
            } else {
                System.out.println("there are no any customer records for '" + existingBranch.getName() + "' branch");
            }
            return true;
        }
        System.out.println("Something Went Wrong! '" + branchName + "' branch doesn't exist");
        return false;
    }

    private Branch searchBranch(String branchName) {

        for (Branch checkingBranch : this.branches) {
            if (checkingBranch.getName().equals(branchName)) {
                return checkingBranch;
            }
        }
        return null;
    }

    /**
     * 3. search a customer(get the specific branch(branch record/object) that looking for a customer first, and then find a customer)
     *
     * @param branchName
     * @param customerName
     */
    public Customer searchCustomer(String branchName, String customerName) {
        /* checking only branch existence part in here(Bank), and leaving customer searching part to the appropriate class(Branch) to separate data validation into right areas to avoid
        putting huge amount of data validations in one spot. that's a keys to OOP(validate only specific things in a specific area). then code will be compact and easy to maintain. */
        Branch existingBranch = this.searchBranch(branchName);
        if (existingBranch != null) {
            //leaving customer searching part to the appropriate class(Branch)
            //accessing Branch class code within Bank class since functionalities are separate to each related classes.
            Customer existingCustomer = existingBranch.searchCustomer(customerName);
            if (existingCustomer != null) {
                return existingCustomer;
            } else {
                System.out.println("Something Went Wrong! '" + customerName + "' customer doesn't exist");
                return null;
            }
        }
        System.out.println("Something Went Wrong! '" + branchName + "' branch doesn't exist");
        return null;
    }

    /**
     * 2. add a new customer(get the specific branch that we want to add customer first, and then add a customer)
     *
     * @param branchName
     * @param customer
     */
    public boolean addCustomer(String branchName, Customer customer) {
        /* checking only branch existence part in here(Bank), and leaving add customer part to the appropriate class(Branch) to separate data validation into right areas to avoid
        putting huge amount of data validations in one spot. that's a keys to OOP(validate only specific things in a specific area). then code will be compact and easy to maintain. */
        Branch existingBranch = this.searchBranch(branchName);
        if (existingBranch != null) {
            //leaving add customer part to the appropriate class(Branch)
            //accessing Branch class code within Bank class since functionalities are separate to each related classes.
            return existingBranch.addCustomer(customer);
        }
        System.out.println("Something Went Wrong! '" + branchName + "' branch doesn't exist");
        return false;
    }

    /**
     * 1. add a customer transaction(get the specific branch that looking for a customer first, and then find the customer and then add transaction for that branch's customer)
     *
     * @param branchName
     * @param customerName
     * @param amount
     */
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        /* checking only branch existence part in here(Bank), and leaving customer existence checking part(Bank) and add customer transaction part(Customer) to the appropriate
        classes to separate data validation into right areas to avoid putting huge amount of data validations in one spot. that's a keys to OOP(validate only specific things
        in a specific area). then code will be compact and easy to maintain. */
        Branch existingBranch = this.searchBranch(branchName);
        if (existingBranch != null) {
            //leaving customer existence checking part to the appropriate class(Branch). and in there after customer existence checking part, will be leaving add transaction part to
            //appropriate class(Customer)
            //accessing Branch class code within Bank class since functionalities are separate to each related classes.
            return existingBranch.addCustomerTransaction(customerName, amount);
        }
        System.out.println("Something Went Wrong! '" + branchName + "' branch doesn't exist");
        return false;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getLicence() {
        return licence;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

}
