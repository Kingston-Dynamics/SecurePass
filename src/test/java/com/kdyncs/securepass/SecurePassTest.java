package com.kdyncs.securepass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SecurePassTest {
    
    @Test
    void verify() throws SecurePassException {
        String password = "Password";
        SecurePass sc = new SecurePass();
        String hashed = sc.hash(password);
        assertTrue(sc.verify(password, hashed));
    }
}