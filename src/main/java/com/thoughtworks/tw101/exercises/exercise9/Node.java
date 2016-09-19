package com.thoughtworks.tw101.exercises.exercise9;

import com.sun.source.tree.BinaryTree;

import java.util.List;

public class Node {
    public BinaryTree bt;
    private String name;
    private Node parent;
    private Node root;
    private Node left;
    private Node right;


    public void add(String n){
        root = add(root, n);
    }


    //Recursively finds the correct place to add a new node-- attempting to implement binary search tree
    public Node add(Node node, String nameOfNewNode) {
        //If the tree is empty, create a new tree with this node as the root
        if (root == null) {
            root = node;
        }

        Node currNode = root;
        parent = null;

        while (true) {
            parent = currNode;
            if (nameOfNewNode < parent.getName()) {
                currNode = currNode.getLeft();
                if (currNode == null) {
                    parent.getLeft() = node;
                }
            } else {
                currNode = currNode.getRight();
                if (currNode == null) {
                    node = parent.getRight();
                }
            }
        }
    }


        /*if(node == null){
            node = new Node(nameOfNewNode);
        }else{
            //if no right child, make node the right child
            if(node.getRight() == null){
                node.right = add(node.right, nameOfNewNode);
            }
            //if no left child, make node left child
            else{
                node.left = add(node.left, nameOfNewNode);
            }
        }
        return node;*/


    //Set left node
    public void setLeft(Node n){
        left = n;
    }

    //Set right node
    public void setRight(Node n){
        right = n;
    }

    //Get left node
    public Node getLeft(){
        return left;
    }

    //Get right node
    public Node getRight(){
        return right;
    }

    //Set name of node
    public void setName(String s){
        name = s;
    }

    //Get name of node
    public String getName(){
        return name;
    }

    //Returns the names of all of the nodes in alphabetical order recursively
    public List<String> names() {

        return null;
    }

    //Constructor
    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }




}
