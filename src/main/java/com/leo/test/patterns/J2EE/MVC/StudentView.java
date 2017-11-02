package com.leo.test.patterns.J2EE.MVC;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}