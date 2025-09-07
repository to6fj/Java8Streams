package com.exercise.mapreduce;

/*
9 Create a comma-separated string from a list of integers.
*/

import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
       String s = nums.stream().map(x -> String.valueOf(x)).collect(Collectors.joining(","));
        System.out.println(s);
    }
}
