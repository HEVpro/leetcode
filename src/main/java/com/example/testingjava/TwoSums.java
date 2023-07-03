package com.example.testingjava;

public class TwoSums {

    public int[] checkSums(int[] nums, int target) {
        if (nums.length < 2) {
            throw new RuntimeException("The List of nums should be bigger than 1");
        }
        if (target < 0) {
            throw new RuntimeException("The target must be a positive number");
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
