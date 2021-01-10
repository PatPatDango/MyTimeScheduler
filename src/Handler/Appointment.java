/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;
import java.sql.*;
/**
 *
 * @author patricia
 */

// TestClass database handler zu appointment 
public class Appointment {
    PreparedStatement ps;
    
public int InsertnewAppointment(Appointment new_event){
    int insertSuccessfull= 1;
    String sql= "INSERT INTO appointment (a_eventName, a_Date, a_duration, a_eventTime, a_location, a_priority, a_reminder)";
    try (Connection con = getConnection();PreparedStatement ps = con.prepareStatement(sql)){
        
    }
}    
    
}
