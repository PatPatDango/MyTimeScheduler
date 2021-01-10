/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;
import java.sql.*;
import Classes.*; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patricia
 */
public class DatenbankHandler {
    private static Connection con;
    private static PreparedStatement st; 
    
    public static Connection getConnection()throws SQLException {
        final String USERNAME = "Admin";
        final String PASSWORD = "admin"; //"abc123";
        String URL = "jdc:mysql://127.0.0.1:3306/MyTimeScheduler";
        Connection con = null;
        
        con = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        System.out.println("Verbindung erfolgreich");
        return con;
    }
    
    public boolean checkifUserExists (String username, String password)throws SQLException {
        String sql = "Select * FROM _USER where username = ? AND password = ? AND DELETED = 0 ";
        ResultSet rs = null;
        con = getConnection();
        st= con.prepareStatement(sql);
        st.setString(1, username);
        st.setString(2, password);
        rs= st.executeQuery(); 
        
        if(rs.next()){
        return true;
    }
    return false;
    } 
    
    public boolean checkifEmailExists (String email)throws SQLException{
        String sql = "Select * FROM _USER where email = ?  AND DELETED = 0 ";
        ResultSet rs2 = null;
        con = getConnection();
        st = con.prepareStatement(sql);
        st.setString(3, email);
        rs2= st.executeQuery(); //Returns one ResultSet object
        
        if(rs2.next()){
            return true;
        }
        return false;
    }
    
    PreparedStatement ps;
    
    public int InsertnewAppointment(Appointment new_event){
    int insertSuccessfull= 1;
    String sql= "INSERT INTO appointment (a_eventName, a_Date, a_duration, a_eventTime, a_location, a_priority, a_reminder) VALUES (?,?,?,?,?;?;?)";
    try (Connection con = getConnection();PreparedStatement ps = con.prepareStatement(sql)){
        ps.set
        ps.set 
        ps.set
        ps.set
        ps.set
        ps.set 
        insertSuccessfull = ps.executeUpdate();   
    }   catch (SQLException ex) {
            Logger.getLogger(DatenbankHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    System.out.println("Appointment successfully added");
    return insertSuccessfull; 
    }
}
