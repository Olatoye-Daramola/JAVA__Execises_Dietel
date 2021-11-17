package com.phoenix.models;

import lombok.Data;

@Data
public class Course {
    private int id;
    private String courseName;
    private String department;

    public Course(String name) {
        this.courseName = name;
    }

    public Course(String name, String department) {
        this(name);
        this.department = department;
    }
}
