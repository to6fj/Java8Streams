package com.exercise.basic;

/*
10 Remove duplicates from a list using distinct().
*/

import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        List<Integer> distinctList = nums.stream().distinct().toList();
        distinctList.forEach(System.out::println);
    }
}
