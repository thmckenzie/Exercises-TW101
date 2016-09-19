package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.List;
import java.util.ArrayList;

public class Main {
    //ArrayList of type Monster
    static List<Monster> monsterList = new ArrayList<Monster>();

    public static void main(String[] args) {
        //Instances of Orcs and Trolls created
        Orc orc1 = new Orc();
        Troll troll1 = new Troll();


        //Add Monsters to ArrayList of type Monster
        monsterList.add(orc1);
        monsterList.add(troll1);

        //Iterate through MonsterList to first take 10 points of damage then report status
        for(int i=0; i < monsterList.size(); i++){
            monsterList.get(i).takeDamage(10);
        }

        for(int i=0; i< monsterList.size(); i++){
            monsterList.get(i).reportStatus();
        }
    }
}
