package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Ronnie on 8/23/16.
 */
public class Monster {
    private String name;
    private int hitpoints;

    public Monster() {
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public void reportStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("HP = " + this.hitpoints);
    }

    public void takeDamage(int damage){
        this.hitpoints = this.hitpoints - damage;
    }
}
