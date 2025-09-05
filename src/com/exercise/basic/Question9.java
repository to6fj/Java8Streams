package com.exercise.basic;
/*
9 Limit the stream to first 5 elements from a list.
*/

import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> integers = nums.stream().limit(5).toList();
        integers.forEach(System.out::println);

    }
}
