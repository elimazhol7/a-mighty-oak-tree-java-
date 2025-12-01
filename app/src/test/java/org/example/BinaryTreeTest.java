package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BinaryTreeTest {

    private Squirrel cheeks;
    private Squirrel squeaks;
    private Squirrel fluffybutt;

    private Node nodeOne;
    private Node nodeTwo;
    private Node nodeThree;

    private BinaryTree tree;

    @BeforeEach
    public void setUp() {
        // Create squirrels
        cheeks = new Squirrel("Cheeks");
        squeaks = new Squirrel("Squeaks");
        fluffybutt = new Squirrel("Mr. Fluffy Butt");

        // Create nodes
        nodeOne = new Node(cheeks);
        nodeTwo = new Node(squeaks);
        nodeThree = new Node(fluffybutt);

        // Attach children
        nodeOne.setLeft(nodeTwo);
        nodeOne.setRight(nodeThree);

        // Create tree
        tree = new BinaryTree(nodeOne);
    }

    @Test
    public void testNodeData() {
        assertEquals("Cheeks", nodeOne.getData().getName());
        assertEquals("Squeaks", nodeTwo.getData().getName());
        assertEquals("Mr. Fluffy Butt", nodeThree.getData().getName());
    }

    @Test
    public void testNodeChildren() {
        assertSame(nodeTwo, nodeOne.left());
        assertSame(nodeThree, nodeOne.right());
        assertNull(nodeTwo.left());
        assertNull(nodeTwo.right());
    }

    @Test
    public void testPreOrderTraversal() {
        // Capture System.out
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        tree.traversePreOrder(tree.getRoot());

        String expected = String.join(System.lineSeparator(),
                "Cheeks",
                "Squeaks",
                "Mr. Fluffy Butt") + System.lineSeparator();

        assertEquals(expected, output.toString());
    }

    @Test
    public void testInOrderTraversal() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        tree.traverseInOrder(tree.getRoot());

        String expected = String.join(System.lineSeparator(),
                "Squeaks",
                "Cheeks",
                "Mr. Fluffy Butt") + System.lineSeparator();

        assertEquals(expected, output.toString());
    }

    @Test
    public void testPostOrderTraversal() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        tree.traversePostOrder(tree.getRoot());

        String expected = String.join(System.lineSeparator(),
                "Squeaks",
                "Mr. Fluffy Butt",
                "Cheeks") + System.lineSeparator();

        assertEquals(expected, output.toString());
    }
}

