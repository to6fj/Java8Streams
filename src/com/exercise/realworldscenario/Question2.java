package com.exercise.realworldscenario;

/*
2 Group students by grade and count them.
*/

import com.exercise.utility.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 1, "A");
        Student s2 = new Student("Bob", 2, "B");
        Student s3 = new Student("Charlie", 3, "C");
        Student s4 = new Student("David", 4, "B");
        Student s5 = new Student("Emma", 5, "A");
        Student s6 = new Student("Frank", 6, "C");
        Student s7 = new Student("Grace", 7, "B");
        Student s8 = new Student("Henry", 8, "A");
        Student s9 = new Student("Ivy", 9, "C");
        Student s10 = new Student("Jack", 10, "B");

        List<Student>students=List.of(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10);
        Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));
        collect.forEach(
                (grade,count)->{
                    System.out.println(grade + " : " + count);
                }
        );
    }
}
