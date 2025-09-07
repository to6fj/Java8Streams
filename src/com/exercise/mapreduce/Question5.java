package com.exercise.mapreduce;

/*
5 Flatten a list of lists into a single list using flatMap().
*/

import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        List<List<Integer>>nums=List.of(List.of(8,7,9,3,5,6,9,6,3,1),List.of(9,5,2,9,1,3,4,1,2,2));
        List<Integer> list = nums.stream().flatMap((x) -> x.stream()).toList();
        list.forEach(System.out::println);
    }
}