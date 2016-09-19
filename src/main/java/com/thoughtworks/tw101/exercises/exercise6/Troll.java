package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Tafarii on 9/12/16.
 */
public class Troll implements Monster {
    //Instance variables
    String name;
    int hitPoints;

    public void takeDamage(int amount) {
        hitPoints = (hitPoints - (amount / 2));
    }

    public void reportStatus() {
        System.out.println("Status of Troll: " + hitPoints);
    }

    //Constructor
    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }
}
