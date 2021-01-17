/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author patricia
 */
public class Registration {
    
//button -> read all 
    
//check every field if NULL
    //if not notification
    
//check email, username field if already in Database 
    //if not -> pop up Notivication
    
// create an new Object from Class User 
        
    private String user_firstname = null;
    private String user_lastname = null;
    private String user_username = null;
    private String user_email = null;
    private String user_password = null;

    //Konstructor 
    public Registration (String _user_firstname, String _user_lastname,String _user_username, String _user_email, String _user_password){
        this.setFirstname(_user_firstname);
        this.setLastname(_user_lastname);
        this.setUsername(_user_username);
        this.setEmail(_user_email); 
        this.setPassword(_user_password);
    }
    
    
    //methods 
    
    public String getFirstname() {return user_firstname;}
    public void setFirstname(String _user_firstname) {user_firstname=_user_firstname;}
    
    public String getLastname() {return user_lastname;}
    public void setLastname(String _user_lastname) {user_lastname=_user_lastname;}
    
    public String getUsername() {return user_username;}
    public void setUsername(String _user_username) {user_username=_user_username;}
    
    public String getEmail() {return user_email;}
    public void setEmail(String _user_email) {user_email=_user_email;}
    
    public String getPassword() {return user_password;}
    public void setPassword(String _user_password) {user_password=_user_password;}

}
