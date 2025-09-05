package com.exercise.intermediate;
/*
9 Check if all numbers in a list are even using allMatch().
*/

import java.util.List;

public class Question9 {

    public static void main(String[] args) {
        List<Integer> list = List.of(10, 2, 30, 4, 50, 6, 70, 8, 90, 10);
        boolean b = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(b?"All are even":"All are not even");
    }
}
