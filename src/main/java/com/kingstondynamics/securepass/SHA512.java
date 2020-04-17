package com.kingstondynamics.securepass;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class SHA512 {
    
    private final MessageDigest digest;
    
    public SHA512() throws NoSuchAlgorithmException {
        this.digest = MessageDigest.getInstance("SHA-512");
    }
    
    public String hash(String input) {
        digest.reset();
        digest.update(input.getBytes(StandardCharsets.UTF_8));
        return String.format("%0128x", new BigInteger(1, digest.digest()));
    }
}
