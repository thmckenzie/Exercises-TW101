package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    //Recursively ensure the input is an integer
    public static int checkInt(String input){
        try{
            int guess = Integer.parseInt(input);
            return guess;
        }catch(NumberFormatException e){
            System.out.println("This is not a number, please enter a number");
            checkInt(scan.next());
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Guess the Number Game! Please enter a guess between 1 and 100");

        //get input, ensure its an integer, begin the game
        String input = scan.next();

        if(checkInt(input)> 1){
            int intGuess = checkInt(input);
        }else{
            checkInt(scan.next());
        }
        int intGuess = checkInt(input);
        //System.out.println("intGuess main: " + intGuess); //for debugging purposes
        GuessNumGame game = new GuessNumGame(intGuess);
        //game.beginGame(intGuess);
    }
}

