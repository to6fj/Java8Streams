package com.exercise.sorting;

/*
10 Partition a list of numbers into even and odd using partitioningBy().
*/

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question10 {
    public static void main(String[] args) {
        List<Integer>mobileNumber=List.of(9,5,2,9,1,3,4,1,2,2);
        Map<Boolean, List<Integer>> collect = mobileNumber.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        collect.forEach((isEven,number)->{
            if(isEven){
                System.out.println("Even:"+number);
            }else {
                System.out.println("Odd:"+number);
            }
        });
    }
}
