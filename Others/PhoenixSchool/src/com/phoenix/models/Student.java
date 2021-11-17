package com.phoenix.models;


import com.phoenix.enums.Gender;

import java.util.List;

public class Student extends SchoolUser{
    private List<Course> registeredCourses;

    public Student(String firstName, String lastName, Gender gender) {
        this.setFirstName(firstName);
        setSurname(lastName);
        setGender(gender);
    }

    public Student(String firstName, String lastName, Gender gender, String email) {
        this(firstName, lastName, gender);
        setEmail(email);
    }
}
