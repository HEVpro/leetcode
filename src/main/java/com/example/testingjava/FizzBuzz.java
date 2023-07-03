package com.example.testingjava;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(createFizzBuzz(i));
        }
        System.out.println(numbers);
        return numbers;
    }

    private String createFizzBuzz(int i) {
        if (isMultiple(i, 3) && isMultiple(i, 5)) {
            return FIZZ + BUZZ;
        } else if (isMultiple(i, 3)) {
            return FIZZ;
        } else if (isMultiple(i, 5)) {
            return BUZZ;
        }
        return String.valueOf(i);
    }

    private static boolean isMultiple(int number, int multiple) {
        return number % multiple == 0;
    }
}
