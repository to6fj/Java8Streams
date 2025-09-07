package com.exercise.mapreduce;

/*
8 Remove null values from a list using streams.
*/

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Question8 {
    public static void main(String[] args) {
        List<String>names= Arrays.asList("shubham", "Pandit", "Puri", null, "shubham");
        names.stream().filter(x->x!=null).forEach(System.out::println);
    }
}
