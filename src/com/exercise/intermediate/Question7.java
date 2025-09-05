package com.exercise.intermediate;
/*
7 Convert a list of numbers into a Map where key = number, value = square.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        Map<Integer, Integer> collect = nums.stream().collect(Collectors.toMap(x -> x, x -> x * x, (x, y) -> x));
        collect.forEach((k,v)->{
            System.out.println(k+":---"+v);
        });
    }
}
