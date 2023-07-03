package com.example.testingjava;

import java.util.HashMap;

public class Anagram {
    public Boolean checkIfIsAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        int[] char_sequence = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_sequence[s.charAt(i) - 'a']++;
            char_sequence[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < char_sequence.length; i++) {
            if (char_sequence[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
