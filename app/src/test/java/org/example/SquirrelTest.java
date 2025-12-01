package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquirrelTest {

    @Test
    public void testSquirrelCreation() {
        Squirrel squirrel = new Squirrel("Cheeks");
        assertNotNull(squirrel, "Squirrel object should not be null");
    }

    @Test
    public void testGetName() {
        Squirrel squirrel = new Squirrel("Cheeks");
        assertEquals("Cheeks", squirrel.getName(), "Squirrel name should match the one provided in constructor");
    }

    @Test
    public void testDifferentNames() {
        Squirrel squirrel1 = new Squirrel("Squeaks");
        Squirrel squirrel2 = new Squirrel("Fluffy");
        assertEquals("Squeaks", squirrel1.getName());
        assertEquals("Fluffy", squirrel2.getName());
        assertNotEquals(squirrel1.getName(), squirrel2.getName(), "Names of different squirrels should not be equal");
    }
}
