package org.example;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NodeTest {

    private Squirrel cheeks;
    private Squirrel squeaks;
    private Node nodeOne;
    private Node nodeTwo;

    @BeforeEach
    public void setUp() {
        // Create squirrels
        cheeks = new Squirrel("Cheeks");
        squeaks = new Squirrel("Squeaks");

        // Create nodes
        nodeOne = new Node(cheeks);
        nodeTwo = new Node(squeaks);
    }

    @Test
    public void testNodeCreation() {
        assertNotNull(nodeOne);
        assertEquals("Cheeks", nodeOne.getData().getName());
        assertNull(nodeOne.left());
        assertNull(nodeOne.right());
    }

    @Test
    public void testSetLeftChild() {
        nodeOne.setLeft(nodeTwo);
        assertSame(nodeTwo, nodeOne.left());
    }

    @Test
    public void testSetRightChild() {
        nodeOne.setRight(nodeTwo);
        assertSame(nodeTwo, nodeOne.right());
    }

    @Test
    public void testAttachBothChildren() {
        nodeOne.setLeft(nodeTwo);
        Node nodeThree = new Node(new Squirrel("Fluffy"));
        nodeOne.setRight(nodeThree);

        assertSame(nodeTwo, nodeOne.left());
        assertSame(nodeThree, nodeOne.right());
    }
}
