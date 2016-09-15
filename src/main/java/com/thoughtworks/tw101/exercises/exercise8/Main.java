package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //0-99

        Scanner inputReader = new Scanner(System.in);
        GuessCheck guessChecker = new GuessCheck();
        while(!guessChecker.isGameCompleted()){


            System.out.print("Pick a number between 1 and 100: ");
            int userGuess = 0;

            try {
                userGuess = Integer.parseInt(inputReader.next());
            }

            catch (NumberFormatException e){
                System.out.println("Please enter in a number");
                System.out.println();
            }
            guessChecker.answerCheck(userGuess);



        }



    }
}
