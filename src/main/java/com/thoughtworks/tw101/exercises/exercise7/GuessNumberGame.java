package com.thoughtworks.tw101.exercises.exercise7;


import java.util.Scanner;

public class GuessNumberGame {
    private int guess;
    private int correctNumber;
    private static Scanner scan = new Scanner(System.in);

    private int getRandomNumber(){
        return (int)(Math.random()*100 + 1);
    }


    public boolean wonGame (int guess){
        if(guess == correctNumber){
            System.out.println("Congratulations, you won!");
            return true;
        }else{
            return false;
        }
    }

    public void keepPlaying(){
        while(wonGame(guess)== false){
            if(guess> correctNumber){
                System.out.println("Too high! Guess again");
            }else{
                System.out.println("Too low! Guess again");
            }
            guess = scan.nextInt();
        }
        wonGame(guess);
    }


    //Play the game
    public void beginGame(){
        if(wonGame(guess)){
            System.out.println("You won on the first guess!");
        }else{
            keepPlaying();
        }
    }

    //Constructor
    public GuessNumberGame(int userGuess){
        correctNumber = getRandomNumber();
        guess = userGuess;
    }
}
