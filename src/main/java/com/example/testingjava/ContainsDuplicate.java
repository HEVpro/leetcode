package com.example.testingjava;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean checkArrayDuplicates(int[] nums) {
        HashSet<Integer> numsChecked = new HashSet<>();
        for (int num : nums) {
            if (numsChecked.contains(num)) {
                return true;
            }
            numsChecked.add(num);
        }
        return false;
    }

}
