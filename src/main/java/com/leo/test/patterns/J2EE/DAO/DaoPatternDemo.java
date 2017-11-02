package com.leo.test.patterns.J2EE.DAO;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //print all students
        studentDao.getAllStudents().forEach(DaoPatternDemo::print);

        //update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        print(student);
    }

    private static void print(Student student) {
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
