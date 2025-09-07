package com.exercise.mapreduce;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/*
6 Find the frequency of each word in a string.*/
public class Question6 {
    public static void main(String[] args) {
        String para="Java is a versatile programming language. Java is used for web development, mobile apps, and enterprise solutions. Learning Java improves problem-solving skills";

        String[] words = para.split(" ");
        Map<String, Long> collect = Arrays.stream(words).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        collect.forEach((k,v)->{
            System.out.println(k+"  "+v);
        });
    }
}
