package org.example;

public class BinaryTree {
    private Node root;

    // Constructor
    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return this.root;
    }

    // Pre-order traversal: Root -> Left -> Right
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData().getName());
            traversePreOrder(node.left());
            traversePreOrder(node.right());
        }
    }

    // In-order traversal: Left -> Root -> Right
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left());
            System.out.println(node.getData().getName());
            traverseInOrder(node.right());
        }
    }

    // Post-order traversal: Left -> Right -> Root
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left());
            traversePostOrder(node.right());
            System.out.println(node.getData().getName());
        }
    }
}
