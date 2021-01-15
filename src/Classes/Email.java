/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//import com.sun.jdi.connect.Transport;
//import java.lang.System.Logger;
import java.util.logging.Level;
import java.util.logging.Logger;

//import java.lang.System.Logger.Level;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import java.util.*;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.AddressException;
import javax.mail.Transport;

/**
 *
 * @author Julia
 */
public class Email {
    
    public static void sendEmail(String recipient)throws Exception{
        System.out.println("Preparing to send email");
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port","587");
        
        //Infos about our Email account
        String myAccountEmail = "projectfhjava@gmail.com";  //Hab noch keine Email erstellt
        String password = "2021JAVA1!";
        
        Session session = Session.getInstance(properties, new Authenticator(){
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });
        
        Message message = prepareMessage(session, myAccountEmail, recipient);
        //mail.smtp.outh
        //mail.smtp.starttls.enable
        //mail.smtp.host
        //mail.smtp.port
        
        Transport.send(message);
        System.out.println("Message sent successfully");
    }
    
    private static Message prepareMessage(Session session, String myAccountEmail,String recipient){
        try{
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
            message.setSubject("MyTimeScheduler: Bestätigung Ihres Useraccounts");
            message.setText("Hey Name, \n Willkommen bei MyTimeScheduler!");
            return message;
            
        }catch(Exception ex){
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null,ex);
        }
        return null;
    }
}

