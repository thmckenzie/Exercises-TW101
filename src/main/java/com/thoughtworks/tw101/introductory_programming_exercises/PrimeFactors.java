package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
    static List<Integer> pfactors = new ArrayList<Integer>();

    private static List<Integer> generate(int n) {
        for(int i= 2; i< n; i++){
            if(n%i == 0 && isPrime(i)){
                pfactors.add(i);
            }
        }
    return pfactors;
    }

    //Checks to see if a number is prime
    private static boolean isPrime(int n){
        //check if it's even
        if(n > 2 && n%2 == 0){
            return false;
        }

        //check odd numbers
        for(int i = 3; i*i< n; i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    //Main method
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors);
    }
}
