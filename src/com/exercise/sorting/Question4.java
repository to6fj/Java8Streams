package com.exercise.sorting;

/*
4 Find the top 3 highest numbers in a list.
*/

import java.util.Comparator;
import java.util.List;

public class Question4
{
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 2, 30, 4, 500, 6, 70, 8, 90, 10);
        list.stream().sorted((a,b)->b-a).limit(3).forEach(System.out::println);
    }
}
