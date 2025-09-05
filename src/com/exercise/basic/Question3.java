package com.exercise.basic;
/*
3 Filter all even numbers from a list.
*/

import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> numsList=List.of(8,7,9,3,5,6,9,6,3,1);
        numsList.stream().filter(x->x%2==0).toList().forEach(System.out::println);
    }
}
