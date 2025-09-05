package com.exercise.intermediate;

/*
8 Filter strings starting with a specific letter from a list.
*/

import java.util.List;

public class Question8
{
    public static void main(String[] args) {
        List<String>names=List.of("Shubham","Pandit","Puri","Venkatesh","Sharvil","Dhayari","Pune","Mumbai");
        List<String> list = names.stream().filter(x -> x.startsWith("S")).toList();
        list.forEach(System.out::println);
    }
}
