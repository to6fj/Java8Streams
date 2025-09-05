package com.exercise.intermediate;

/*
2 Calculate the sum of numbers using reduce().
*/

import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        nums.stream().reduce(Integer::sum).ifPresent(System.out::println);
    }
}
