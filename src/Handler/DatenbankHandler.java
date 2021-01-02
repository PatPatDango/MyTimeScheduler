/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;
import java.sql.*;
import Classes.*; 

/**
 *
 * @author patricia
 */
public class DatenbankHandler {
    private static Connection con;
    private static PreparedStatement st; 
    
    public static Connection getConnection()throws SQLException {
        final String USERNAME = "root";
        final String PASSWORD = "root"; //"abc123";
        String URL = "jdc:mysql://127.0.0.1:3306/MyTimeScheduler";
        Connection con = null;
        
        con = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        System.out.println("Verbindung ergoldreich");
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
}
