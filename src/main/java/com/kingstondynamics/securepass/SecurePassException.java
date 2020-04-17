package com.kingstondynamics.securepass;

public class SecurePassException extends Exception {
    
    private final String message;
    
    public SecurePassException(String message) {
        this.message = message;
    }
}
