package com.exercise.intermediate;

/*
3 Find the average of numbers in a list.
*/

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> nums=List.of(8,7,9,3,5,6,9,6,3,1);
        OptionalDouble asDouble = nums.stream().mapToInt(x -> x).average();
        System.out.println(asDouble.getAsDouble());

    }
}
