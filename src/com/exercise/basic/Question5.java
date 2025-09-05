package com.exercise.basic;
/*
5 Create a stream from an array and print all elements.
*/

import java.util.Arrays;

public class Question5 {
    public static void main(String[] args) {
        int []array={8,7,9,3,5,6,9,6,3,1};
        Arrays.stream(array).forEach(System.out::println);
    }
}
