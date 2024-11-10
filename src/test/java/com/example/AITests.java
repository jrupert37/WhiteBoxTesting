package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class AITests {

    @Test
    public void testBasicCompression() {
        StringManipulation sm = new StringManipulation();
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newLength = sm.compress(chars);
        assertEquals(6, newLength);
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3'}, java.util.Arrays.copyOf(chars, newLength));
    }

    @Test
    public void testMultipleGroups() {
        StringManipulation sm = new StringManipulation();
        char[] chars = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
        int newLength = sm.compress(chars);
        assertEquals(6, newLength);
        assertArrayEquals(new char[]{'a', '3', 'b', '2', 'a', '2'}, java.util.Arrays.copyOf(chars, newLength));
    }

    @Test
    public void testSingleCharacters() {
        StringManipulation sm = new StringManipulation();
        char[] chars = {'a', 'b', 'c'};
        int newLength = sm.compress(chars);
        assertEquals(3, newLength);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, java.util.Arrays.copyOf(chars, newLength));
    }

    @Test
    public void testAllSameCharacters() {
        StringManipulation sm = new StringManipulation();
        char[] chars = {'a', 'a', 'a', 'a'};
        int newLength = sm.compress(chars);
        assertEquals(2, newLength);
        assertArrayEquals(new char[]{'a', '4'}, java.util.Arrays.copyOf(chars, newLength));
    }

    @Test
    public void testEmptyArray() {
        StringManipulation sm = new StringManipulation();
        char[] chars = {};
        int newLength = sm.compress(chars);
        assertEquals(0, newLength);
        assertArrayEquals(new char[]{}, java.util.Arrays.copyOf(chars, newLength));
    }
}