package com.thoughtworks.tw101.exercises.exercise9;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node left;
    private Node right;



    //Recursively finds the correct place to add a new node-- attempting to implement binary search tree
    public Node add(Node node, String nameOfNewNode) {
        //If the tree is empty, create a new tree with this node as the root
        if (node == null) {
            node = new Node(nameOfNewNode);
        } else {
            /*if the name of the new node is "less than" the current tree/node's name,
            recursively add it as the left child of the current tree/node, else recursively add to the right child
             */
            if((nameOfNewNode.toLowerCase()).compareTo(node.getName()) < 0){
                node.left = add(node.left, nameOfNewNode);
            }else if ((nameOfNewNode.toLowerCase()).compareTo(node.getName()) > 0){
                node.right = add(node.right, nameOfNewNode);
            }else{
                //Name is already in the tree, add as left child.
                node.left = add(node.left, nameOfNewNode);
            }
        }
        return node;
    }


    //Set left node
    private void setLeft(Node n){
        left = n;
    }
    //Set right node
    private void setRight(Node n){
        right = n;
    }
    //Get left node
    private Node getLeft(){
        return left;
    }
    //Get right node
    private Node getRight(){
        return right;
    }
    //Set name of node
    private void setName(String s){
        name = s;
    }
    //Get name of node
    private String getName(){
        return name;
    }

    //names helper method
    private List<String> namesHelper(Node node){
        /*Check if the current node is empty/null,
            traverse the left subtree by recursively calling names,
            add the string name of the current node to the list,
            traverse the right subtree by recursively calling names
         */

        List<String> nameList = new ArrayList<>();
        if(node != null){
            names(node.getLeft());
            nameList.add(node.getName());
            names(node.getRight());
        }
        return nameList;
    }


    //Returns the names of all of the nodes in alphabetical order recursively
    public List<String> names() {
        namesHelper();
    }

    //Constructor
    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }




}
