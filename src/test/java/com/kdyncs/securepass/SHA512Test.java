/*
 * Copyright (C) 2020 Kingston Dynamics Inc.
 * 
 * This file is part of SecurePass
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.kdyncs.securepass;

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