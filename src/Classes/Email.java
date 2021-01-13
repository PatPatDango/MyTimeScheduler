/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import com.sun.jdi.connect.Transport;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import java.util.*;
/**
 *
 * @author Julia
 */
public class Email {
    
    public static void sendEmail(String recipient){
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        //Infos about our Email account
        String AccountEmail = "xxxx@gmail.com";  //Hab noch keine Email erstellt
        String password = "xxxxxxx";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(AccountEmail,password);
            }
        });
        
        Message message = prepareMessage(session, AccountEmail, recipient);
        //mail.smtp.outh
        //mail.smtp.starttls.enable
        //mail.smtp.host
        //mail.smtp.port
        
        Transport.send(message);
        System.out.println("Message sent successfully");
    }
    
    private static Message prepareMessage(Session session, String AccountEmail,String recipient){
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAdress(AccountEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
            message.setSubject("MyTimeScheduler: Bestätigung Ihres Useraccounts");
            message.setText("Hey Name, \n Willkommen bei MyTimeScheduler!");
            return message;
            
        }catch(Exception ex){
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null,ex);
        }
        return null;
    }
}

