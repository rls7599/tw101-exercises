package com.thoughtworks.tw101.exercises;

/**
 * Created by Ronnie on 9/17/16.
 */
public class Triangle {


    public static void main (String args[]){
        printOneAsterisk();
        printHorizontalLine(10);
        printRightTriangle(3);
    }

    public static void printOneAsterisk(){
        System.out.println("*");
    }

    public static void printHorizontalLine(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printVerticalLine(int n){
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void printRightTriangle(int n){
        for(int i= 0; i < n; i++){
            int j = 0;
            while(j < i+1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
    }

}
