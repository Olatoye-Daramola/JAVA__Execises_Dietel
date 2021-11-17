package com.phoenix.exceptions;

public class PhoenixSchoolException extends Exception {
    public PhoenixSchoolException(String message) {
        super(message);
    }

    public PhoenixSchoolException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoenixSchoolException(Throwable cause) {
        super(cause);
    }
}
