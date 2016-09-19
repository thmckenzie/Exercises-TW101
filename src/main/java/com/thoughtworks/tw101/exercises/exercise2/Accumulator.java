package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    static int total = 0;

    //Increment method
    public void increment(){
        total++;
    }

    //Total method
    public void total(){
        System.out.println(total);
    }
}
