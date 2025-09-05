package com.exercise.basic;

/*
8 Skip the first 3 numbers from a list and print the rest.
*/

import java.util.List;

public class Question8 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> integers = nums.stream().skip(3).toList();
        integers.forEach(System.out::println);
    }
}
