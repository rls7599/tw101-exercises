package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Ronnie on 8/16/16.
 */
public class Orc extends Monster {

    private String name;
    private int hitpoints;


    public Orc(){
        this.name = "Orc";
        this.hitpoints = 20;
    }

    public void reportStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("HP = " + this.hitpoints);
    }



}
