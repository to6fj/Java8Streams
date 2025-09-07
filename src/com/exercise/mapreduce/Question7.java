package com.exercise.mapreduce;

/*
7 Find the frequency of each character in a string.
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {
    public static void main(String[] args) {
        String name="shubham";
        String []words=name.split("");

        Map<String,Integer>map=new HashMap<>();
        for(String s:words){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
//        map.forEach((k,v)->{
//            System.out.println(k+"  "+v);
//        });
        Arrays.stream(words).collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k,v)->{
            System.out.println(k+"  "+v);
        });
    }
}
