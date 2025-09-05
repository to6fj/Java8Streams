package com.exercise.intermediate;

/*
1 Find the maximum and minimum number in a list.
*/

import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        long maxNum=nums.stream().max(Integer::compare).get();
        System.out.println(maxNum);
    }
}
