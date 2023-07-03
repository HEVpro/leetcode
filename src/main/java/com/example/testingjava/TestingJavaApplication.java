package com.example.testingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestingJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingJavaApplication.class, args);
        TwoSums game = new TwoSums();
        int[] nums = {3, 2, 4};
        game.checkSums(nums, 6);

    }

}
