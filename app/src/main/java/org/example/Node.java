package org.example;

public class Node {
    private Squirrel data;
    private Node leftChild;
    private Node rightChild;

    // Constructor
    public Node(Squirrel data) {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    // Setters
    public void setLeft(Node left) {
        this.leftChild = left;
    }

    public void setRight(Node right) {
        this.rightChild = right;
    }

    // Getters
    public Node left() {
        return this.leftChild;
    }

    public Node right() {
        return this.rightChild;
    }

    public Squirrel getData() {
        return this.data;
    }
}
