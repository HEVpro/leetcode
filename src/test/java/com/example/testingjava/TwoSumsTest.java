package com.example.testingjava;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TwoSumsTest {
    private TwoSums sut;
    private static final int[] NUMS = {2, 3, 4};
    private static final Integer TARGET = 5;

    @Before
    public void setUp() {
        sut = new TwoSums();
    }

    @Test
    public void twoSums_whenNumsLengthIsUnder2_returnError() throws Error {
        int[] errorArray = Arrays.copyOfRange(NUMS, 0, 0);
        Exception exception = assertThrows(RuntimeException.class, () -> {
            sut.checkSums(errorArray, 5);
        });

        String expectedMessage = "The List of nums should be bigger than 1";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void twoSums_whenTargetIsNegative_returnError() throws Error {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            sut.checkSums(NUMS, -1);
        });

        String expectedMessage = "The target must be a positive number";
        String actualMessage = exception.getMessage();

        assertEquals(actualMessage, expectedMessage);
    }

    @Test
    public void twoSums_anyNumMatch_returnError() throws Error {

    }

    @Test
    public void twoSums_whenFindSums_returnArrayIndexes() {
    }
}
