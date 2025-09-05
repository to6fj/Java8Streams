package com.exercise.sorting;
/*
8 Find the employee with the maximum salary.
*/

import java.util.List;

public class Question8
{
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
        Employee emp10 = new Employee(24261, "Rohit Kumar", "IT", 652220000.00);
        List<Employee> employees=List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);

        employees.stream().sorted((e1,e2)->-Double.compare(e1.salary(),e2.salary())).limit(1).forEach(System.out::println);
    }
}
