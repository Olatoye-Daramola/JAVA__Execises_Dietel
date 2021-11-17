package com.phoenix.database;

import com.phoenix.exceptions.PhoenixSchoolException;
import com.phoenix.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.phoenix.enums.Gender.*;
import static org.junit.jupiter.api.Assertions.*;

class PhoenixSchoolDBTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addStudent() {
//    void addStudent() throws PhoenixSchoolException {
        assertTrue(PhoenixSchoolDB.getStudents().isEmpty());
        Student toye = new Student("Toye", "Daramola", MALE);
        try {
            PhoenixSchoolDB.addStudent(toye);
        }
        catch (PhoenixSchoolException e) {
            e.printStackTrace();
        }
        assertFalse(PhoenixSchoolDB.getStudents().isEmpty());
    }

    @Test
    void addNullStudent() {
        assertThrows(PhoenixSchoolException.class, ()->PhoenixSchoolDB.addStudent(null));
    }
}