package com.exercise.utility;

import java.util.Objects;

public class Employee
{
    private String name;
    private  int employeeId;
    private double salary;
    private String department;
    private int age;

    public Employee() {
    }

    public Employee(String name, int employeeId,int age, double salary, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj==null)
        {
            return false;
        }
        if (this==obj)
        {
            return true;
        }
        if(this.getClass()!=obj.getClass())
        {
            return false;
        }
        Employee e=(Employee)obj;
        return Objects.equals(this.employeeId,e.employeeId) ;
    }
    public int hashCode()
    {
        return Objects.hash(this.employeeId);
    }

    @Override
    public String toString() {
        return  "name='" + name +
                " Age="+age+
                ", employeeId=" + employeeId +
                ", salary=" + salary +
                ", department='" + department;
    }
}
