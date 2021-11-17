package com.phoenix.services;

import com.phoenix.database.PhoenixSchoolDB;
import com.phoenix.exceptions.PhoenixStudentException;
import com.phoenix.models.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.phoenix.enums.Gender.*;
import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {
    StudentService studentService;

    @BeforeEach
    void setUp() {
        studentService = new StudentServiceImpl();
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void registerStudent() throws PhoenixStudentException {
        Student presh = new Student("Amarachi", "Lois", FEMALE);
        assertEquals(2, PhoenixSchoolDB.getTotalNumberOfStudent());

        presh = studentService.registerStudent(presh);
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertEquals("PHX3", presh.getId());
    }

    @Test
    void registerNullStudent() {
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertThrows(PhoenixStudentException.class, ()->studentService.registerStudent(null));
    }

//    @Test
//    void updateStudent() throws PhoenixStudentException {
//            Student toye = new Student("Toye", "Daramola", MALE);
//            assertEquals(2, PhoenixSchoolDB.getTotalNumberOfStudent());
//
//            toye = studentService.registerStudent(toye);
//            assertNotNull(toye);
//            assertEquals("Olatoye", toye.getFirstName());
//
//            toye.setEmail("toye@email.com");
//            studentService.updateStudent(toye);
//            toye = studentService.findStudent("PHX1");
//            assertEquals("toye@email.com", toye.getEmail());
//    }

    @Test
    void findStudent() throws PhoenixStudentException{
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        Student toye = studentService.findStudent("PHX1");
        assertNotNull(toye);
        assertEquals("Olatoye", toye.getFirstName());
    }

    @Test
    void findNullStudent() throws PhoenixStudentException{
        assertEquals(3, PhoenixSchoolDB.getTotalNumberOfStudent());
        assertThrows(PhoenixStudentException.class, ()->studentService.findStudent(null));
    }

    @Test
    void findStudentWithInvalidStudentId() throws PhoenixStudentException{
        assertNull(studentService.findStudent("PHX200"));
//        assertThrows(PhoenixStudentException.class, ()->studentService.findStudent("PHX200"));
    }
}