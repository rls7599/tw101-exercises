package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random r = new Random();

        //0-99
        int randomNumb = r.nextInt(100)+1;
        Scanner inputReader = new Scanner(System.in);
        ArrayList<Integer> listOfGuesses = new ArrayList();
        while(true){


            System.out.print("Pick a number between 1 and 100: ");
            try {
                int userGuess = Integer.parseInt(inputReader.next());
                listOfGuesses.add(userGuess);

                if (userGuess == randomNumb) {
                    System.out.println("You are correct! Exiting program.\n");
                    System.out.println("Below is a list of your previous guesses\n");
                    for(Integer i : listOfGuesses){
                        System.out.println(i);
                    }
                    break;
                }
                //less than guess
                else if (userGuess < randomNumb) {
                    System.out.println("Try again! Your guess was too low.");
                    System.out.println();
                }
                //greater than guess
                else {
                    System.out.println("Try again! Your guess was too high");
                    System.out.println();
                }
            }
            catch (NumberFormatException e){
                System.out.println("Please enter in a number");
                System.out.println();
            }

        }



    }
}
