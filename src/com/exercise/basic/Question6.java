package com.exercise.basic;

/*
6 Count how many elements are in a list using streams.
*/

import java.util.List;

public class Question6 {

    public static void main(String[] args) {
        List<Integer>nums=List.of(8,7,9,3,5,6,9,6,3,1);
        long count = nums.stream().count();
        System.out.println("Count: " + count);
    }
}
