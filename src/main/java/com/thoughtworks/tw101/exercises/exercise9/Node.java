package com.thoughtworks.tw101.exercises.exercise9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        //a.compareTo(b) - returns negative if a < b, positive if a > b, 0 if a = b

        insertion(this, nameOfNewNode);
    }

        public void insertion(Node currentNode, String nameOfNewNode){
            if(currentNode.left == null){
                if(nameOfNewNode.compareTo(currentNode.name) < 0)
                    currentNode.left = new Node(nameOfNewNode);
            }

            else{
                if(nameOfNewNode.compareTo(currentNode.name) < 0){
                    insertion(currentNode.left, nameOfNewNode);
                }
            }

            if(currentNode.right == null){
                if(nameOfNewNode.compareTo(currentNode.name) > 0)
                    currentNode.right = new Node(nameOfNewNode);
            }

            else {
                if(nameOfNewNode.compareTo(currentNode.name) > 0)
                insertion(currentNode.right, nameOfNewNode);
            }
    }


    public List<String> names() {
        ArrayList<String> listOfNames = new ArrayList<String>();
        return traversalPrint(this, listOfNames);
    }

    public ArrayList<String> traversalPrint(Node currentNode, ArrayList<String> list){

        //STEP THROUGH THIS
        if(currentNode.left != null){
            traversalPrint(currentNode.left,list);
        }

        list.add(currentNode.name);

        if(currentNode.right != null) {
            traversalPrint(currentNode.right, list);
        }
        return list;
    }
}
