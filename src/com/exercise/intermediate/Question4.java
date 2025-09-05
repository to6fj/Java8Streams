package com.exercise.intermediate;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Question4
{
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        LinkedHashSet<Integer> collect = nums.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        collect.forEach(System.out::println);
    }
}
