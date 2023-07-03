package com.example.testingjava;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntTest {
    @Test
    public void castRomanNumber() {
        RomanNumbers romanNumbers = new RomanNumbers();
        assertEquals(3, romanNumbers.castRomanToInt("III"));
        assertEquals(58, romanNumbers.castRomanToInt("LVIII"));
        assertEquals(1994, romanNumbers.castRomanToInt("MCMXCIV"));
    }
}
