package org.tajry.devopstpjenkins.servicestest;

import org.junit.jupiter.api.Test;
import org.tajry.devopstpjenkins.services.SimpleMethods;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMethodsTest {

    SimpleMethods simpleMethods = new SimpleMethods();

    @Test
    public void testAddNumbers() {
        assertEquals(5, simpleMethods.addNumbers(2, 3));
        assertEquals(0, simpleMethods.addNumbers(-1, 1));
    }

    @Test
    public void testIsEven() {
        assertTrue(simpleMethods.isEven(4));
        assertFalse(simpleMethods.isEven(3));
    }

    @Test
    public void testReverseString() {
        assertEquals("cba", simpleMethods.reverseString("abc"));
        assertEquals("", simpleMethods.reverseString(""));
        assertNull(simpleMethods.reverseString(null));
    }
}
