package com.kingstondynamics.securepass;


import org.junit.jupiter.api.Test;

import java.security.NoSuchAlgorithmException;

class SHA512Test {
    
    @Test
    void hash() throws NoSuchAlgorithmException {
        
        SHA512 hasher = new SHA512();
        
        String hashed = hasher.hash("g-ö>«Þ¡´8MqM42YÄ<,$üjã9ÖÜ5ã[É[òïêÐHJãÀÏfü¹W]hÂ\"³maÕ6Íµ¯JÍñ_Y-L:Úç2-ÁU÷=»_::ã=«æð,`âÁÄãKÇ46");
        
        System.out.println("Hashed");
        System.out.println(hashed);
    }
}