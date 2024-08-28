package com.hexagonal.hexagonal_app.infrastructure.models.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    } 
}
