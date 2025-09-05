package com.exercise.intermediate;

/*
6 Count the number of words in a sentence using streams.
*/

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {
    public static void main(String[] args) {
        String words="shubham pandit puri venkatesh sharvil society dhayari pune shubham pandit puri";
        String []arr=words.split(" ");
        long count = Arrays.stream(arr).count();
        System.out.println(count);
        Map<String, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        collect.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

    }
}
