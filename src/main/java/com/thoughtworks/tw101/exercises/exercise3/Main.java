package com.thoughtworks.tw101.exercises.exercise3;

/*    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
      and ending integer value. */
public class Main {
    public static void main(String[] args) {
        OddSum test = new OddSum();

        int sum = test.of(1, 100);

        System.out.println(sum);
    }
}
