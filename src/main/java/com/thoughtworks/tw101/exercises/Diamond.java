package com.thoughtworks.tw101.exercises;

/**
 * Created by Ronnie on 9/17/16.
 */
public class Diamond {

    public static void main (String args[]){
        printCenteredTriangle(7);
        printDiamond(6);
        printDiamondWithName(6);
    }

    public static void printCenteredTriangle(int n){
        String emptySpaces = "";

    for(int i = 0; i < n*2; i++){
        emptySpaces += " ";
    }
        StringBuilder s = new StringBuilder(emptySpaces);
        s.setCharAt(n-1, '*');
        System.out.println(s);
        for(int i = 1; i < n; i++){
            int firstIndex = s.indexOf("*");
            int lastIndex = s.lastIndexOf("*");
            s.setCharAt(firstIndex-1, '*');
            s.setCharAt(lastIndex+1, '*');
            System.out.println(s);
        }

    }

    public static void printDiamond(int n){

        String emptySpaces = "";

        for(int i = 0; i < n*2; i++){
            emptySpaces += " ";
        }
        StringBuilder s = new StringBuilder(emptySpaces);
        s.setCharAt(n-1, '*');
        System.out.println(s);
        for(int i = 1; i < n; i++){
            int firstIndex = s.indexOf("*");
            int lastIndex = s.lastIndexOf("*");
            s.setCharAt(firstIndex-1, '*');
            s.setCharAt(lastIndex+1, '*');
            System.out.println(s);
        }

        for(int i = 1; i < n; i++){
            int firstIndex = s.indexOf("*");
            int lastIndex = s.lastIndexOf("*");
            s.setCharAt(firstIndex, ' ');
            s.setCharAt(lastIndex, ' ');
            System.out.println(s);
        }
    }

    public static void printDiamondWithName(int n){

        String emptySpaces = "";

        for(int i = 0; i < n*2; i++){
            emptySpaces += " ";
        }
        StringBuilder s = new StringBuilder(emptySpaces);
        s.setCharAt(n-1, '*');
        System.out.println(s);
        for(int i = 1; i < n-1; i++){
            int firstIndex = s.indexOf("*");
            int lastIndex = s.lastIndexOf("*");
            s.setCharAt(firstIndex-1, '*');
            s.setCharAt(lastIndex+1, '*');
            if(i==n-2)
                System.out.println("Ronnie");
            else
                System.out.println(s);
        }



        for(int i = 1; i < n; i++){
            int firstIndex = s.indexOf("*");
            int lastIndex = s.lastIndexOf("*");
            s.setCharAt(firstIndex, ' ');
            s.setCharAt(lastIndex, ' ');
            System.out.println(s);
        }
    }
}

