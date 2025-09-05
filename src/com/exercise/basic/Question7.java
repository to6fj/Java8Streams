package com.exercise.basic;

/*
7 Find the first element of a list using streams.
*/

import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        nums.stream().findFirst().ifPresent(System.out::println);
    }
}
