package com.example.testingjava;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    public void checkIfStringsAreAnagram() {
        Anagram anagram = new Anagram();
        assertEquals(true, anagram.checkIfIsAnagram("cata", "taca"));
        assertEquals(false, anagram.checkIfIsAnagram("rat", "car"));
    }
}
