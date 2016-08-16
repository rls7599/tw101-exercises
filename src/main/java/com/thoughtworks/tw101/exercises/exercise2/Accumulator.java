package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    public int numbOfIncrementCalls = 0;

    public Accumulator(){
        numbOfIncrementCalls = 0;
    }

    public  Accumulator(int n){
        numbOfIncrementCalls = n;
    }

    public void increment(){
        ++this.numbOfIncrementCalls;
    }

    public void total(){
        System.out.println(this.numbOfIncrementCalls);
    }
}
