package com.company;

import java.util.ArrayList;

/* be sure not to expose any of the inner workings of the ArrayList to any class that accessing this. so in other words
  no direct ints, no using .get(i) in the ArrayList.  */
public class MobilePhone {

    //class fields/instance variables
    private String myPhoneNumber;
    private ArrayList<Contact> myContacts; //composition(MobilePhone has Contact(list of Contact))

    //constructor
    public MobilePhone(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
        this.myContacts = new ArrayList<Contact>();
        /* when you've got an ArrayList that you're using in a class like this, you want to initialize it in a constructor,
        normally. in this case we initialize it with empty list.                                                        */
    }

    //instance methods
    public String showMyPhoneNumber() {
        return this.myPhoneNumber;
    }

    public void printContacts() {
        int numberOfContacts = this.myContacts.size();

        if (numberOfContacts != 0) {
            System.out.println("you've " + numberOfContacts + " contacts in your contact list");
            for (int i = 0; i < numberOfContacts; i++) {
                System.out.println((i + 1) + ". " + this.myContacts.get(i).printContact());
            }
        } else {
            System.out.println("you've not any contact in your contact list yet");
        }
    }

    public boolean createNewContact(Contact contact) {
        /* we can put implementation of findContact() method in this public method also, but we didn't, because that
        method use direct ints which is used for ArrayList. we're not to expose any of the inner workings of the
        ArrayList to any class that accessing this class. we use only private methods for that kind of implementations. */
        int foundPosition = findContact(contact.getName());
        if (foundPosition > -1) {
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact currentContact, Contact newContact) {
        /* we can put implementation of findContact() method in this public method also, but we didn't, because that
        method use direct ints which is used for ArrayList. we're not to expose any of the inner workings of the
        ArrayList to any class that accessing this class. we use only private methods for that kind of implementations. */
        int foundPosition = findContact(currentContact.getName());
        if (foundPosition > -1) {
            this.myContacts.set(foundPosition, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        /* we can put implementation of findContact() method in this public method also, but we didn't, because that
        method use direct ints which is used for ArrayList. we're not to expose any of the inner workings of the
        ArrayList to any class that accessing this class. we use only private methods for that kind of implementations. */
        int foundPosition = findContact(contact.getName());
        if (foundPosition > -1) {
            this.myContacts.remove(foundPosition);
            //this.myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public Contact searchContact(String contactName) {
        /* we can put implementation of findContact() method in this public method also but we didn't, because that
        method use direct ints which is used for ArrayList. we're not to expose any of the inner workings of the
        ArrayList to any class that accessing this class. we use only private methods for that kind of implementations. */
        int foundPosition = findContact(contactName);
        if (foundPosition > -1) {
            return this.myContacts.get(foundPosition);
        }
        return null;
    }

    public Contact searchContact(Contact contact) { //created but not used
        /* we can put implementation of findContact() method in this public method also but we didn't, because that
        method use direct ints which is used for ArrayList. we're not to expose any of the inner workings of the
        ArrayList to any class that accessing this class. we use only private methods for that kind of implementations. */
        int foundPosition = findContact(contact);
        if (foundPosition > -1) {
            return this.myContacts.get(foundPosition);
        }
        return null;
    }

    // we don't want to expose these private methods publicly, they're using ints which is used for ArrayList.
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // we don't want to expose these private methods publicly, they're using ints which is used for ArrayList.
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }


}
