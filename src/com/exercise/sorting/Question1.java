package com.exercise.sorting;

/*
1 Sort a list of integers in ascending order.
*/

import java.util.List;

public class Question1
{
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 2, 30, 4, 50, 6, 70, 8, 90, 10);
        List<Integer> integers = list.stream().sorted(Integer::compare).toList();
        integers.forEach(System.out::println);
    }
}
