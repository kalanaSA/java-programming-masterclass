package com.company;

//class that doesn't use encapsulation
public class Player {

    //public class fields
    public String name; /*3. public String fullName; can't change internal field later. if we do that other classes that
    access this field say that it can't find that field anymore. reason for that is we're access these fields directly,
    so we've got an error there. so we have to change the field name in other classes that access this field also. it's very
    difficult to change in larger apps. we can solve this by,
    * making fields private & create public setters/getters/constructor/certain methods to access them. so we're access
    fields only using that public methods. we can change fields name without doubt anytime.*/
    public int health;
    public String weapon;
    public int life;

    /* no need of constructor or setters to initialize/change values for fields, because of public fields we can access them directly
       to initialize or change. */

    public void looseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("player knocked out!");
            this.life -= 1;
        }
        if (this.life <= 0) {
            System.out.println("Game Over");
        }
    }

    /*getter as a function(useless because we can access fields directly from outside(because fields are public), no need
    to create public method to access those) */
    public int remainingHealth() {
        return this.health;
    }


}
