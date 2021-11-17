package com.phoenix.models;

import com.phoenix.enums.Gender;
import com.phoenix.enums.Status;
import lombok.Data;
import java.time.LocalDate;

@Data
public abstract class SchoolUser {
    private String id;
    private String firstName;
    private String surname;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private Gender gender;
    private Status status;
}