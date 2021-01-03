/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Forms.Registration;
/**
 *
 * @author camilla / patricia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class User 
{
    private String firstname = null;
    private String lastname = null;
    private String username = null;
    private String email = null;
    private String password = null;
    
    //Constructor
    public User(String firstname, String lastname, String username, String email,String password){
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setUsername(username);
        this.setEmail(email);
        this.setPassword(password);
    }
    
    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;} 
    public String getUsername() {return username;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    
    public void setFirstname(String _firstname) {firstname=_firstname;}
    public void setLastname(String _lastname) {lastname=_lastname;}
    public void setUsername(String _username) {username=_username;}
    public void setEmail(String _email) {email=_email;}
    public void setPassword(String _password) {password=_password;}
    
  
}



