package com.exercise.sorting;

public record Employee(int id, String name,String departmentName, double salary) {
    public String getDepartmentName() {
        return departmentName;
    }
}
