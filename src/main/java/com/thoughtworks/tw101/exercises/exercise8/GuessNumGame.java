package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;
import java.util.ArrayList;

public class GuessNumGame {
    public static int intGuess;
    private int correctNumber;
    private static Scanner scan = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList();

    private int getRandomNumber(){
        return (int)(Math.random()*100 + 1);
    }

    private void printGuesses(){
        for(int i = 0; i< guesses.size(); i++){
            System.out.println(guesses.get(i));
        }
    }

    private boolean wonGame (int guess){
        if(guess == correctNumber){
            System.out.println("Congratulations, you won!");
            System.out.println("Here are all the numbers you guessed:");
            printGuesses();
            return true;
        }else{
            return false;
        }
    }

    private void keepPlaying(){
        while(wonGame(intGuess)== false){
            if(intGuess> correctNumber){
                System.out.println("Too high! Guess again");
            }else{
                System.out.println("Too low! Guess again");
            }
            String input = scan.next();
            // guess = scan.nextInt();


            intGuess = checkInt(input);
            //System.out.println("users guess: " + intGuess); //for debugging purposes
            guesses.add(intGuess);
        }
        wonGame(intGuess);
    }


    //Play the game
    public void beginGame(int intGuess){
        //System.out.println("correct: " + correctNumber); //for debugging purposes
        //System.out.println("guess: " + this.intGuess); //for debugging purposes
        if(wonGame(intGuess)){
            System.out.println("You won on the first guess!");
        }else{
            keepPlaying();
        }
    }

    //Recursively ensure the input is an integer
    /*NOTE: currently having issue with this check:
        - if a string is entered, 0 is returned and set as the guess of the user, providing the wrong feedback
     */
    public static int checkInt(String input){
        try{
            int guess = Integer.parseInt(input);
            return guess;
        }catch(NumberFormatException e){
            System.out.println("This is not a number, please enter a number");
            checkInt(scan.next());
            return 0;
        }
    }

    //Constructor
    public GuessNumGame(int userGuess){
        correctNumber = getRandomNumber();
        intGuess = userGuess;
        guesses.add(intGuess);

        //System.out.println("int guess: " + intGuess); //for debugging purposes

        beginGame(intGuess);
    }
}