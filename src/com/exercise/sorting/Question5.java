package com.exercise.sorting;

/*
5 Group a list of strings by their length.
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
        List<String>names=List.of("Shubham","Pandit","Puri","Shubham","Chaudhari","Shrikant","Surve");
        Map<String, Integer> collect = names.stream().collect(Collectors.toMap(String::toString, String::length, (a, b) -> a));
        collect.forEach((k,v)->{
            System.out.println(k+":----->"+v);
        });

    }
}
