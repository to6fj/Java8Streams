package com.exercise.basic;
/*
4 Print the square of each number from a list.
*/

import java.util.List;

public class Question4 {

    public static void main(String[] args) {
        List<Integer> numsList=List.of(8,7,9,3,5,6,9,6,3,1);
        numsList.stream().map(x->x*x).toList().forEach(System.out::println);
    }
}
