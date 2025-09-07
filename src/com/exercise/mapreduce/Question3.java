package com.exercise.mapreduce;

/*
3 Find the shortest string in a list.
*/

import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        String para="A paragraph is a unit of writing consisting of one or more sentences focused on a single, controlling idea or topic, typically marked by an indent on the first line. Paragraphs organize written text into manageable sections, making it easier for readers to follow the author's thoughts and see the overall structure of the work. A well-structured paragraph usually includes a topic sentence introducing the main point, body sentences providing supporting details and examples, and often a concluding sentence to transition to the next idea";
        String[] array = para.split(" ");
        String smallestSTring = Arrays.stream(array).max((a, b) -> -Integer.compare(a.length(), b.length())).get();
        System.out.println(smallestSTring);
    }
}
