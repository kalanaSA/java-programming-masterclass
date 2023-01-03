package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer("kalana", 15.23);
        Customer anotherCustomer;
        /*when we do this assignment, what actually happens is java internally assigning existing Customer Object's reference(memory address that holds Object memory address) to a
        new Customer reference called anotherCustomer. then it has a different memory address(reference) but it points to the same Object address that has existing Customer Object. */
        anotherCustomer = customer;
        //changing the balance of second-instance will affect to the first instance also. because both instances referring to the same object address(that has firstly created Object) now.
        anotherCustomer.setBalance(20.36);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
        /*so java doesn't let us pointers, in other words we cant just point to these objects directly. it's important to learn these things before learn LinkedList and the
        advantages that it can give us over an array.  */
        System.out.println("==============================================================================================");

        ArrayList<Integer> intList = new ArrayList<>();
        //ArrayList maintains insertion order, don't need to mention index if you add values in the order that you wanted.
        intList.add(1);
        intList.add(3);
        intList.add(4);

        printArray(intList);
        intList.add(1, 2);
        printArray(intList);

        /* According to the results, in order to be inserted a new value between the array, the other all below entries have to be moved down to make space for new entry.
         * Also, when removes a record in between records, after removed that value all the other below values needs to be moved up to fill the gap.
         * This is not a big deal in terms of computer processing time when we're dealing with a small array. but when we're dealing/manipulate(like add a new value or remove
           existing value in between existing records) an array containing thousands, millions of existing records with it. it'll get a lot slower to process and starts using a lot
           of resources (lot more work/manipulations the computer has to do). because there are so many records to process.
         * LinkedList is an alternative to arrays that can be really useful in some situations like the above. LinkedList is another type of List.
         * So hence the name LinkedList, each element in the list actually holds a link(memory address) to the next item(item that follows it), as well as the actual value we're
           wanting to actually store as well.
         * if we created LinkedList, we could iterate through the list of items in it. we could start on the first one, and what that code would be doing is we'll be checking to
           see whether the link has got anything else attached to it(i.e:linking to anything/different memory address). if it does, we pick up the value, store it at the location
           and actually save that.                                                                                                                                                    */

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Colombo");
        placesToVisit.add("kandy");
        placesToVisit.add("Jaffna");
        placesToVisit.add("Badulla");
        System.out.println(placesToVisit);

        /* insertion in between : what java would do is change the link of 'Kandy' from wherever before it was pointing to originally('Jaffna'), to the actual memory address of new
        value("Ella"). and set new entry's("Ella") link/pointer to the memory address of where 'Kandy' used to point to('Jaffna').                                                */
        placesToVisit.add(2, "Ella");
        System.out.println(placesToVisit);

        /* removing in between : what java would do is make 'Ella' point to wherever 'Jaffna' was originally pointing to('Badulla'). so now we can see 'Ella' which was pointing to
        'Jaffna' now pointing to 'Badulla'
        note: note here that 'Jaffna' still pointing to 'Badulla'. But because nothing is now referring to 'Jaffna' anymore(because 'Ella' now referring to 'Badulla'), the Object
        will automatically destroy by java during it's garbage collection.(java will figure out this is no longer in use and remove that automatically) */
        placesToVisit.remove(3);
        System.out.println(placesToVisit);

        //so as we can see its heck of lot easy and no records have actually had to be moved down or up to make room for anything.

    }

    public static void printArray(ArrayList<Integer> intArrayList) {
        for (int i = 0; i < intArrayList.size(); i++) {
            System.out.println(intArrayList.get(i));
        }
    }
}



/*
* RECAP that helps to understand way LinkedLists works.
* arrays are index based(Array, ArrayList). access individual elements by using an index.
* we can use primitive types and Objects in the case of normal array.
* we can use only Objects in the case of ArrayList.

# Arrays(Primitive Types)

            byte	    1 byte	  Stores whole numbers from -128 to 127
            short	    2 bytes	  Stores whole numbers from -32,768 to 32,767
            int	      4 bytes   Stores whole numbers from -2,147,483,648 to 2,147,483,647
            long    	8 bytes	  Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
            float   	4 bytes	  Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
            double	  8 bytes   Stores fractional numbers. Sufficient for storing 15 decimal digits
            boolean	  1 bit	    Stores true or false values
            char	    2 bytes	  Stores a single character/letter or ASCII values

    -  The values store/grab mechanism for arrays that java handles internally. in other words formula that java can be used to actually figure out which physical memory
       address to use to grab the values.

             ex: int array(4 bytes: needs upto that amount to be able to store the highest value integer)
                    index           memory address/location          value
                     0                100(base address)               34
                     1                104(100+(4*1))                  18
                     2                108(100+(4*2))                  91
                     3                112(100+(4*3))                  57

    -  Java will add values to the arrays this way by doing contiguously. (figure out & allocate the memory location according to formula and add the value to that address)
    -  To access(figure out which physical memory address to use grab the value) 3rd index = base address + (data type size * index)
    -  This is how java handles things internally. this type of things works for all primitive types(known size) much same way.
    -  it's always going to be the same link. ex: integers always going to consume 4 bytes of memory. But Strings don't work the same, because Strings of course can
       be a variable size.

# Arrays(String/Object Types)
    -  But Strings don't work the same, because Strings of course can be a variable size. And this also applies in general to Objects as well.

                    index    m address(reference)    String/Object address.     |          memory address          value
                     0           100                     1034                   |               1024             Hello world
                     1           108                     1037                   |               1034             Tim
                     2           116                     1046                   |               1037             Australia
                     3           124                     1024                   |               1046             Java

    - In the calculation it's 8 bytes, because memory that's being allocated in the array is actually itself 8 bytes. But that's actually points to another location in
      memory where the String/Object is. Consequently By doing that, java can actually keep track of the actual strings that are in the array.
    - Also the Strings can be a variable link(different link), so they can be different links. String can be variable link unlike integers(primitives) which has to be always 4 bytes.
    - once our program stops executing or goes out of scope in some way, and then the variables are no longer needed and there's process called Java Garbage
      collection which goes through automatically and frees up that memory. so it(memory) can actually be use again.
    - Actual String/Object address do not need to be contiguous. there are completely different addresses/locations. but references of an arrays has contiguous memory locations.

*/