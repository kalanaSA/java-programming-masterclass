package com.company;

public class EnhancedPlayer {

    //private (class fields/instance variables/states)
    private String name;
    private int hitPoints; //change health to hitPoints later, but didn't effect it to the outside classes that access this class.
    //because those class can't/not access this class private fields directly. only using public methods(getters/setters or any behaviors)
    private String weapon;
    private int life;  //private int life=3;

    //constructor with validations to initialize fields/guaranteeing all fields that we want to initialize are initialize
    //when the object created.
    public EnhancedPlayer(String name, int health, String weapon, int life) {
        this.name = name;
        this.hitPoints = (health < 0 || health > 100) ? 100 : health;
        this.weapon = weapon;
        this.life = (life < 0 || life > 3) ? 3 : life;
    }

    //public (behaviors/instance methods)
    public void looseHealth(int damage) {
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("player knocked out!");
            hitPoints = 0;
            this.life -= 1;
        }
        if (this.life <= 0) {
            System.out.println("Game Over");
        }
    }

    public int remainingHealth() {
        return this.hitPoints;
    }

    //public getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return hitPoints;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getLife() {
        return life;
    }

    //no public setters in this case

}
