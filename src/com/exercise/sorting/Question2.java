package com.exercise.sorting;

/*
2 Sort a list of integers in descending order.
*/

import java.util.Comparator;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 2, 30, 4, 500, 6, 70, 8, 90, 10);
        list.stream().sorted((a,b)->b-a).forEach(System.out::println);

    }
}
