package com.company;

public class Main {

    /* Encapsulation is a mechanism that allows you to restrict access to certain components in objects that you are
     creating. so you're able to create controlled & valid object by protecting the members of a class & some methods from
     external access to prevent unauthorized setup or access. by encapsulation we got valid object with right amount of
     parameters and they're initialized. but likewise, we're also making sure that there's no unauthorized access to the
     fields directly.
     * we're not talking security here. but we're stopping outsiders, in other words classes or code outside of the class
     that you're working on, from accessing the inner workings of a class. so it can be very useful to hide that inner
     working from another class to sort of give you more control and to be able to enable you to change things without
     breaking code elsewhere.  so we can make sure that the class that we're giving for access, that we're using for access
     is actually valid & that we've got more control over these things.                                              */

    public static void main(String[] args) {

        Player player = new Player();
        /*1. even though we're not in that class, we're able to access those fields directly(it's not good) because of
        public access modifiers & we don't need any setters(public methods to set values for private fields),getters &
        constructors to initialize fields, we can set values directly. no setters & constructors means no validation for
        fields before  assign values for them. this problem occur because of public fields.                           */
        player.name = "kalana";
        player.health = 100;
        player.life = 3;
        player.weapon = "AK47";
        System.out.println("weapon is " + player.weapon);
        /* 4. And we might have forgotten to initialize value for certain fields, because we assign values for fields by
         field manually accessing directly. so there can be a mistake. this problem occur because of public fields & then
         no need of constructor to initialize values for fields. can solve this by making fields private & creating constructor
         to initialize fields & also we can do some validations in constructor before initialize fields.(creates more valid object)
         guarantee all fields that we want to initialize are initialize when the object created.*/

        int damage = 10;
        player.looseHealth(damage);
        System.out.println("remaining health now = " + player.remainingHealth());

        damage = 92;
        player.health = 200; /* 2. because of the ability to access fields directly we can take the control out of the Player
        class. so by being able to access those fields directly you're really potentially opening up your application to be
        accessed in ways that you didn't want it to do. this problem occur because of public fields & then no need of constructor
        & setters because fields can access directly from outside. we can control this by encapsulation like below,
        * if we don't want to change value for a field after initialize we can make field private & create only constructor to initialize it.
        * if we do want to change value for a field after initialize  we can make field private & create setter with validations to change it. */
        player.looseHealth(damage);
        System.out.println("remaining health now = " + player.remainingHealth()); //result should be -2 but it changed because of unwanted access.


        System.out.println("encapsulated solution --------------------------------------------------------------------");

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("kalana", 150, "sword", 3);
        System.out.println("initial health is = " + enhancedPlayer.getHealth());  //cant access fields directly, using public getters

        damage = 10;
        enhancedPlayer.looseHealth(damage);
        System.out.println("remaining health now = " + enhancedPlayer.remainingHealth());

        //cant change health like before. because can't access that field directly thanks to making field private. no setters
        //define for to change health also. because we don't need to change it after initialize(using constructor).

        /*change health to hitPoints later. but we can still use previous code(with health key word) as it is to access from
        outside. because we don't/can't access fields directly after making them private, we can access them only using public methods.
        So with encapsulation we can change class fields later without effecting to outside classes that access/use them. */
        enhancedPlayer.looseHealth(92);
        System.out.println("remaining health now = " + enhancedPlayer.remainingHealth());
        System.out.println("remaining health now = " + enhancedPlayer.getHealth());

    }
}
