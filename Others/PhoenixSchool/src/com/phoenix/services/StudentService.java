package com.phoenix.services;

import com.phoenix.exceptions.PhoenixStudentException;
import com.phoenix.models.Student;

public interface StudentService {
    Student registerStudent(Student student) throws PhoenixStudentException;
    Student findStudent(String studentId) throws PhoenixStudentException;
    Student updateStudent(Student student) throws PhoenixStudentException;
}
