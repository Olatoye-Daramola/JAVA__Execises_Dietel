package com.phoenix.exceptions;

public class PhoenixStudentException extends PhoenixSchoolException{
    public PhoenixStudentException(String message) {
        super(message);
    }

    public PhoenixStudentException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoenixStudentException(Throwable cause) {
        super(cause);
    }
}
