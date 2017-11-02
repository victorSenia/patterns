package com.leo.test.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class Employee {
    private final String name;

    private final String dept;

    private final int salary;

    private final List<Employee> subordinates;

    // constructor
    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary + " ]");
    }
}