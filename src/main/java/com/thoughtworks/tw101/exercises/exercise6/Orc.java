package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Tafarii on 9/12/16.
 */
public class Orc implements Monster  {
    //Instance variables
    String name;
    static int hitPoints;

    public void takeDamage(int amount){
        hitPoints = (hitPoints-amount);
    }
    public void reportStatus(){
        System.out.println("Status of Orc: " + hitPoints);
    }

    //Constructor
    public Orc(){
        name = "Orc";
        hitPoints = 20;
    }
}
