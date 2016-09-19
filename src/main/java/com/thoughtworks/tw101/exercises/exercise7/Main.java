package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game! Please enter a guess between 1 and 100");
        int guess = scan.nextInt();


        GuessNumberGame game = new GuessNumberGame(guess);
        game.beginGame();

    }
}
