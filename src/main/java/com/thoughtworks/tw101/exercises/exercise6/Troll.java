package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Ronnie on 8/18/16.
 */
public class Troll extends Monster{

    private String name;
    private int hitpoints;

    public Troll(){
        this.name = "Troll";
        this.hitpoints = 40;

    }

    public void reportStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("HP = " + this.hitpoints);
    }

    @Override
    public void takeDamage(int damage){
        this.hitpoints = this.hitpoints - damage/2;
    }

}
