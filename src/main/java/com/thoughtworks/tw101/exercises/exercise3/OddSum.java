package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    int oddSum = 0;

    //Of method
    public int of(int start, int end) {
        for(int i = start; i < end; i++){
            if(i%2 != 0){
                oddSum += i;
            }
        }
        return oddSum;
    }
}
