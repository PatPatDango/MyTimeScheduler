/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;

/**
 *
 * @author patricia
 */
public class encryption {
    
    //hier bitte die encryption funktion schreiben 
    
    public String encryption (String password){
     MessageDigest messagedigest = null; //Hash-Funktion Encryption
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        messagedigest.update(password.getBytes());
        StringBuffer sb= new StringBuffer();
        byte[] b = messagedigest.digest();
        for(byte b1:b)
        {
            sb.append(Integer.toHexString(b1 & 0xff).toString());
        }
        
        System.out.println(sb);
        
    return password;    
    }
    
}
