package com.exercise.realworldscenario;
import com.exercise.utility.Employee;
import com.exercise.utility.Student;

import java.util.Comparator;
import java.util.List;
/*
3 Find the oldest and youngest employee.
*/


public class Question3
{
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, 25, 50000, "HR");
        Employee e2 = new Employee("Bob", 102, 28, 60000, "Finance");
        Employee e3 = new Employee("Charlie", 103, 30, 55000, "IT");
        Employee e4 = new Employee("David", 104, 35, 70000, "Marketing");
        Employee e5 = new Employee("Emma", 105, 27, 65000, "Operations");
        Employee e6 = new Employee("Frank", 106, 32, 48000, "Support");
        Employee e7 = new Employee("Grace", 107, 29, 75000, "IT");
        Employee e8 = new Employee("Henry", 108, 34, 72000, "Finance");
        Employee e9 = new Employee("Ivy", 109, 26, 53000, "HR");
        Employee e10 = new Employee("Jack", 110, 31, 68000, "Sales");

        List<Employee>employees=List.of(e1,e2,e3,e4,e5,e6,e7,e8,e9,e10);
        Employee employee = employees.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Maximum age of employee is " + employee);
        Employee minAge=employees.stream().min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("Minimum age of employee is " + minAge);

    }
}
