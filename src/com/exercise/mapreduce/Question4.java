package com.exercise.mapreduce;
/*
4 Convert a list of integers to their binary string representation.
*/

import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<String> list = nums.stream().map(x -> Integer.toBinaryString(x)).toList();
        list.forEach(System.out::println);
    }
}
