package com.example.testingjava;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ContainsDuplicateTest {
    @Test
    public void checkDuplicates() {
        ContainsDuplicate newDuplicates = new ContainsDuplicate();
        int[] numbers = {1, 2, 3, 1};
        int[] numbersFalse = {1, 2, 3, 4};
        assertTrue(newDuplicates.checkArrayDuplicates(numbers));
        assertFalse(newDuplicates.checkArrayDuplicates(numbersFalse));
    }

}
