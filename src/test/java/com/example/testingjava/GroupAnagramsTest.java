package com.example.testingjava;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {
    GroupAnagrams anagram;

    @Before
    public void setUp() {
        anagram = new GroupAnagrams();
    }

    @Test
    public void groupAnagrams_arrayStringsIsEmpty_returnEmptyListOfStrings() {
        List<List<String>> expectedResult = List.of(List.of(""));
        assertEquals(anagram.groupAnagrams(new String[]{""}), expectedResult);
    }

    @Test
    public void groupAnagrams_arrayOfCharString_returnGroupedAnagrams() {
        List<List<String>> expectedResult = List.of(List.of("a"));
        String[] strs = new String[]{"a"};
        assertEquals(anagram.groupAnagrams(strs), expectedResult);
    }

    @Test
    public void groupAnagrams_arrayOfStrings_returnGroupedAnagrams() {
        List<List<String>> expectedResult = List.of(Arrays.asList("eat", "tea", "ate"), List.of("bat"), Arrays.asList("tan", "nat"));
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        assertEquals(anagram.groupAnagrams(strs), expectedResult);
    }
}
