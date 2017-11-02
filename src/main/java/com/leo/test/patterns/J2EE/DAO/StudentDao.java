package com.leo.test.patterns.J2EE.DAO;

import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public interface StudentDao {
    List<Student> getAllStudents();

    Student getStudent(int rollNo);

    void updateStudent(Student student);

    void deleteStudent(Student student);
}