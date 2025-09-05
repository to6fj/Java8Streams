package com.exercise.intermediate;

/*
10 Check if any number in a list is greater than 100 using anyMatch().
*/

import java.util.List;

public class Question10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 2, 30, 4, 500, 6, 70, 8, 90, 10);
        boolean b = list.stream().anyMatch(x -> x > 100);
        System.out.println(b?"Greater than 100":"Not Greater than 100");

    }
}
