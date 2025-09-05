package com.exercise.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
6 Group employees by department (custom object).
*/


public class Question6 {
    public static void main(String[] args) {
        Employee emp1  = new Employee(24252, "Shubham Puri", "IT", 545454.25);
        Employee emp2  = new Employee(24253, "Amit Sharma", "HR", 600000.00);
        Employee emp3  = new Employee(24254, "Priya Verma", "Finance", 720000.50);
        Employee emp4  = new Employee(24255, "Rahul Mehta", "IT", 480000.75);
        Employee emp5  = new Employee(24256, "Sneha Gupta", "Marketing", 510000.00);
        Employee emp6  = new Employee(24257, "Karan Singh", "Sales", 450000.25);
        Employee emp7  = new Employee(24258, "Neha Joshi", "Operations", 800000.00);
        Employee emp8  = new Employee(24259, "Vikas Yadav", "Admin", 395000.00);
        Employee emp9  = new Employee(24260, "Anjali Nair", "Finance", 575000.50);
        Employee emp10 = new Employee(24261, "Rohit Kumar", "IT", 650000.00);

        List<Employee>employees=List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName, Collectors.counting()));
        collect.forEach((k,v)->{
            System.out.println(k+":----->"+v);
        });
        System.out.println("---------------------------------------");
        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartmentName));
        collect1.forEach((k,v)->{
            System.out.println(k+":----->"+v);
        });

    }
}
