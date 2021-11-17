package com.phoenix.services;

import com.phoenix.database.PhoenixSchoolDB;
import com.phoenix.exceptions.PhoenixStudentException;
import com.phoenix.models.Student;

public class StudentServiceImpl implements StudentService{
    @Override
    public Student registerStudent(Student student) throws PhoenixStudentException {
        return PhoenixSchoolDB.addStudent(student);
    }

    @Override
    public Student findStudent(String studentId) throws PhoenixStudentException {
        return PhoenixSchoolDB.getStudent(studentId);
    }

    @Override
    public Student updateStudent(Student student) throws PhoenixStudentException {
        return null;
    }
}
