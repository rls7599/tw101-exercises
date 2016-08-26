package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Random r = new Random();

        //0-99
        int randomNumb = r.nextInt(100)+1;
        Scanner inputReader = new Scanner(System.in);

        while(true){


            System.out.print("Pick a number between 1 and 100: ");
            int userGuess = Integer.parseInt(inputReader.next());

            if(userGuess == randomNumb){
                System.out.println("You are correct! Exiting program.");
                break;
            }
            //less than guess
            else if(userGuess < randomNumb){
                System.out.println("Try again! Your guess was too low.");
                System.out.println();
            }
            //greater than guess
            else{
                System.out.println("Try again! Your guess was too high");
                System.out.println();
            }

        }



    }
}
