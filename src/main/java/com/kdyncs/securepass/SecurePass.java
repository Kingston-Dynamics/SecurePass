package com.kdyncs.securepass;

import org.mindrot.jbcrypt.BCrypt;
import java.security.NoSuchAlgorithmException;

public class SecurePass {
    
    private final SHA512 SHA;
    
    public SecurePass() throws SecurePassException {
        
        try {
            SHA = new SHA512();
        } catch (NoSuchAlgorithmException e) {
            throw new SecurePassException("SYSTEM ERROR");
        }
    }
    
    public String hash(String password) {
        
        // Hash Using SHA512 to handle super long passwords
        String intermediate = SHA.hash(password);
        
        // Hash Password using BCrypt which is secure.
        // Hashes generated have a maximum length of 60
        return BCrypt.hashpw(intermediate, BCrypt.gensalt());
    }
    
    public Boolean verify(String password, String hashed) {
        
        // Hash Using SHA512 to handle super long passwords
        String intermediate = SHA.hash(password);
        
        // Check password using BCrypt
        return BCrypt.checkpw(intermediate, hashed);
    }
}
