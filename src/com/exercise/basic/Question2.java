package com.exercise.basic;

/*
2 Convert a list of strings to uppercase using map().
*/

import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String>names=List.of("shubham","pandit","puri","mca","java","developer");
        names.stream().map(String::toUpperCase).toList().forEach(System.out::println);
    }
}
