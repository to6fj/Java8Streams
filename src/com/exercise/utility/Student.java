package com.exercise.utility;

import java.util.Objects;

public class Student
{
    private String name;
    private int rollNo;
    private String grade;

    public Student() {

    }

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public boolean equals(Object o)
    {
        if (this == o)return true;
        if(o==null)return false;
        if(getClass()!=o.getClass())return false;
        Student student = (Student)o;
        return Objects.equals(rollNo, student.rollNo) && Objects.equals(name, student.name) ;
    }
    public int hashCode()
    {
        return Objects.hash(rollNo);
    }
}
