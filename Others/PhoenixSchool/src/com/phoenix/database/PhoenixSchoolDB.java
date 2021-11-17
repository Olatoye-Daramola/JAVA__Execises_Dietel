package com.phoenix.database;

import com.phoenix.exceptions.PhoenixStudentException;
import com.phoenix.models.Student;
import java.util.Map;
import java.util.TreeMap;

import static com.phoenix.enums.Gender.MALE;

public class PhoenixSchoolDB {
    private static int totalNumberOfStudent = 0;
    private static Map<String, Student> students= new TreeMap<>();

    static {
        try {
            Student toye = new Student("Olatoye", "Daramola", MALE);
            PhoenixSchoolDB.addStudent(toye);

            Student david = new Student("David", "Olorunfemi", MALE);
            PhoenixSchoolDB.addStudent(david);
        }
        catch (PhoenixStudentException e) {
//
        }
    }

    public static Map<String, Student> getStudents() {
        return students;
    }

    private static void setStudents(Map<String, Student> students) {
        PhoenixSchoolDB.students = students;
    }

    public static Student addStudent(Student newStudent) throws PhoenixStudentException {
        if (newStudent == null) throw new PhoenixStudentException("Student details are required");
        newStudent.setId(generateStudentId());

        if (newStudent.getId() == null) {
            newStudent.setId(generateStudentId());
        }

        students.put(newStudent.getId(), newStudent);
        return newStudent;
    }

    public static Student getStudent(String studentId) throws PhoenixStudentException {
        if (studentId == null) throw new PhoenixStudentException("Student id is required");
        Student foundStudent = students.get(studentId);
        return foundStudent;
    }

    private static String generateStudentId() {
        StringBuilder id = new StringBuilder("PHX");
        totalNumberOfStudent++;
        id.append(totalNumberOfStudent);
        return id.toString();
    }

    public static int getTotalNumberOfStudent() {
        return totalNumberOfStudent;
    }
}
