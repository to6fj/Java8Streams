package com.exercise.mapreduce;

/*
10 Find the sum of squares of all numbers in a list.
*/

import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer>mobileNumber=List.of(8,7,9,3,5,6,9,6,3,1);
        Integer sum = mobileNumber.stream().map(x -> x * x).reduce((a, b) -> a + b).get();
        System.out.println(sum);
    }
}
