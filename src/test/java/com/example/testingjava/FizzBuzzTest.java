package com.example.testingjava;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static com.example.testingjava.FizzBuzz.BUZZ;
import static com.example.testingjava.FizzBuzz.FIZZ;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    private FizzBuzz game;

    @Before
    public void before() {
        game = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumbersWhenNotMultipleOf3or5() {
        List<String> numbersList = game.getNumbers();
        assertEquals("1", numbersList.get(0));
        assertEquals("2", numbersList.get(1));
        assertEquals("7", numbersList.get(6));
        assertEquals("13", numbersList.get(12));
    }

    @Test
    public void shoudReturnFizzWhenAMultipleOf3() {
        List<String> numbersList = game.getNumbers();
        assertEquals(FIZZ, numbersList.get(2));
        assertEquals(FIZZ, numbersList.get(5));
        assertEquals(FIZZ, numbersList.get(8));
    }

    @Test
    public void shoudReturnFizzWhenAMultipleOf5() {
        List<String> numbersList = game.getNumbers();
        assertEquals(BUZZ, numbersList.get(4));
        assertEquals(BUZZ, numbersList.get(9));
        assertEquals(BUZZ, numbersList.get(19));
    }

    @Test
    public void shoudReturnFizzWhenAMultiple3and5() {
        List<String> numbersList = game.getNumbers();
        assertEquals(FIZZ + BUZZ, numbersList.get(14));
        assertEquals(FIZZ + BUZZ, numbersList.get(29));
        assertEquals(FIZZ + BUZZ, numbersList.get(59));
    }
}
