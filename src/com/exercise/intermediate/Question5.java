package com.exercise.intermediate;

/*
5 Convert a list of strings into a single string using joining().
*/

import java.util.List;
import java.util.stream.Collectors;

public class Question5
{
    public static void main(String[] args) {
        List<String> nums=List.of("Shubham","Pandit","Puri");
        String collect = nums.stream().collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
