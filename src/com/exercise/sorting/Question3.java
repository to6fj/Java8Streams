package com.exercise.sorting;
/*
3 Sort a list of strings alphabetically.
*/

import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<String> list = List.of("Shubham","Pandit","Puri","Shrikant","Akash","Bablu","Cat","Dog");
        list.stream().sorted(String::compareTo).forEach(System.out::println);

    }
}
