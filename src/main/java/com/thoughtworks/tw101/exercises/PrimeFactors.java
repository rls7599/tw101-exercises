package com.thoughtworks.tw101.exercises;

import java.util.ArrayList;

/**
 * Created by Ronnie on 9/18/16.
 */
public class PrimeFactors {

    public static void main (String args[]){
        System.out.println(generate(15));

    }

    public static ArrayList generate(int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n<=1)
            return list;
        boolean foundFactors = false;
        for(int i = 2; i < n; i++){
            if(n % i == 0) {
                list.add(i);
                foundFactors = true;
            }
            int total = 1;
            for(Integer factor : list){
                total *= factor;
            }
            if(total == n)
                return list;
        }
        if(!foundFactors){
            list.add(1);
            list.add(n);
        }
        return list;
    }
}
