package com.exercise.basic;

/*
1 Create a stream from a list of integers and print all elements.
*/

import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Integer>numsList=List.of(8,7,9,3,5,6,9,6,3,1);
        numsList.forEach(System.out::println);
    }
}
