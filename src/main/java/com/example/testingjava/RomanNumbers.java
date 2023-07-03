package com.example.testingjava;

public class RomanNumbers {
    public int castRomanToInt(String s) {
        String[] letters = s.split("");
        int result = 0;

        for (int index = 0; index < letters.length; index++) {
            String letter = letters[index];
            String letterBefore = index > 0 ? letters[index - 1] : "";
            if (letter.equals("I")) {
                result = result + 1;
                continue;
            }
            if (letter.equals("V")) {
                if (letterBefore.equals("I")) {
                    result = result - 1 + 4;
                    continue;
                }
                result = result + 5;
                continue;
            }
            if (letter.equals("X")) {
                if (letterBefore.equals("I")) {
                    result = result - 1 + 9;
                    continue;
                }
                result = result + 10;
                continue;
            }
            if (letter.equals("L")) {
                if (letterBefore.equals("X")) {
                    result = result - 10 + 40;
                    continue;
                }
                result = result + 50;
                continue;
            }
            if (letter.equals("C")) {
                if (letterBefore.equals("X")) {
                    result = result - 10 + 90;
                    continue;
                }
                result = result + 100;
                continue;
            }
            if (letter.equals("D")) {
                if (letterBefore.equals("C")) {
                    result = result - 100 + 400;
                    continue;
                }
                result = result + 500;
                continue;
            }
            if (letter.equals("M")) {
                if (letterBefore.equals("C")) {
                    result = result - 100 + 900;
                    continue;
                }
                result = result + 1000;
                continue;
            }
            continue;
        }
        System.out.println(result);
        return result;
    }
}
