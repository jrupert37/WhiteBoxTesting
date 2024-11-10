package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ManualTests {
    StringManipulation stringManipulator = new StringManipulation();

    @Test
    public void emptyArray() {
        char[] empty = {};
        assertEquals(0, stringManipulator.compress(empty));
    }

    @Test
    public void oneCharacter() {
        char[] oneChar = {'a'};
        assertEquals(1, stringManipulator.compress(oneChar));
    }

    @Test
    public void oneGroupTwoChars() {
        char[] twoChars = {'a', 'a'};
        assertEquals(2, stringManipulator.compress(twoChars));
    }

    @Test
    public void twoCharGroups() {
        char[] twoGroups = {'a', 'a', 'b'};
        assertEquals(3, stringManipulator.compress(twoGroups));
    }
}
