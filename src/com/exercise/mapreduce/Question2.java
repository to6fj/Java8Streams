package com.exercise.mapreduce;

/*
 2 Find the longest string in a list.
*/

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        String paragrpah="A paragraph is a unit of writing consisting of one or more sentences focused on a single, controlling idea or topic, typically marked by an indent on the first line. Paragraphs organize written text into manageable sections, making it easier for readers to follow the author's thoughts and see the overall structure of the work. A well-structured paragraph usually includes a topic sentence introducing the main point, body sentences providing supporting details and examples, and often a concluding sentence to transition to the next idea";
        String[] s1 = paragrpah.split(" ");
        String s2 = Arrays.stream(s1).max((a, b) -> Integer.compare(a.length(), b.length())).get();
        System.out.println(s2);
        List<String>name=List.of("Shubham","Pandit","Puri","Vaishnavi kadam");
        String s = name.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(s);
    }
}
