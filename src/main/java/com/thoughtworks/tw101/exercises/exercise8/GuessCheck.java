package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Ronnie on 9/2/16.
 */
public class GuessCheck {
    private int correctAnswer;
    private ArrayList<Integer> listOfUserGuesses;
    private boolean gameCompleted;

    public GuessCheck(){
        Random r = new Random();
        this.correctAnswer = r.nextInt(100)+1;
        this.listOfUserGuesses = new ArrayList<Integer>();
        this.gameCompleted = false;
    }

    public void answerCheck(int userGuess){
        this.listOfUserGuesses.add(userGuess);

        if(this.correctAnswer == userGuess) {
            System.out.println("You are correct! Exiting program.\n");
            this.gameCompleted = true;
            this.printGuesses();
        }
        //greater than guess
        else if (this.correctAnswer > userGuess) {
            System.out.println("Try again! Your guess was too low.\n");

        }
        //greater than guess
        else {
            System.out.println("Try again! Your guess was too high.\n");
        }

    }

    public void printGuesses(){
        System.out.println("Below is a list of your previous guesses:\n" + this.listOfUserGuesses.toString());

    }

    public boolean isGameCompleted() {
        return this.gameCompleted;
    }
}
