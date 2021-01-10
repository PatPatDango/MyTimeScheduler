/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Forms.addAppointment;

/**
 *
 * @author camilla , patricia
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;



public class Appointment 
{
    private String name = null;
    private LocalDate date = null;
    private LocalTime time = null; //!!!!!!!
    private int duration = 0;
    private String location = null;
    private String participants = null;
    //private String attachementfiles;
    private String priority = null;
    private String reminder = null;

    //Konstructor 
    public Appointment (String name, LocalDate date,LocalTime time, int duration, String location, String Participants, String priority, String reminder ){
        this.setName(name);
        this.setDate(date);
        this.setTime(time); 
        this.setDuration(duration);
        this.setLocation(location);
        this.setParticipants(participants);
        this.setPriority(priority); 
        this.setReminder(reminder); 
    }
    
    
    //methods 
    
    public String getName() {return name;}
    public void setName(String _name) {name=_name;}
    
    public LocalDate getDate() {return date;}
    public void setDate(LocalDate _date) {date=_date;}
    
    public LocalTime getTime() {return time;}
    public void setTime(LocalTime _time) {time =_time;}
    
    public int getDuration() {return duration;}
    public void setDuration(int _duration) {duration=_duration;}
    
    public String getLocation() {return location;}
    public void setLocation(String _location) {location=_location;}
    
    public String getParticipants() {return participants;}
    public void setParticipants(String _participants) {participants=_participants;}
    
/*    public String getAttachmentfiles() {return attachementfiles;}
    public void setAttachementfiles(String _attachementfiles) {attachementfiles=_attachementfiles;} */
    
    public String getPriority() {return priority;}
    public void setPriority(String _priority) {priority=_priority;}

    public String getReminder() {return reminder;}
    public void setReminder(String _reminder) {reminder=_reminder;}

    private void setDuration(String duration) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    







