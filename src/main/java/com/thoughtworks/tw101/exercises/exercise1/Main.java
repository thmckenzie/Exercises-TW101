package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    int sum = 0;

    //Print method
    public void print(){
        for(int i = 1; i < 101; i++){
            if(i%2 != 0){
                sum+= 1;
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Main test = new Main();
        test.print();
    }
}
