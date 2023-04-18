package com.epam.mjc;

public class StudentIdExceptions extends IllegalArgumentException {

    public StudentIdExceptions(String message) {
        super(message);
    }

    public StudentIdExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}
