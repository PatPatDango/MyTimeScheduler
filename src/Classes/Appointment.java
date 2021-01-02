/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Forms.addAppointment;

/**
 *
 * @author camilla , pat
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
public class Appointment 
{
    private String name;
    private Date date;
    private String location;
    private String duration;
    private String participants;
    private String attachementfiles;
    private String priority;
    private int reminder;
    
    public String getName() {return name;}
    public Date getDate() {return date;}
    public String getDuration() {return duration;}
    public String getLocation() {return location;}
    public String getParticipants() {return participants;}
    public String getAttachmentfiles() {return attachementfiles;}
    public String getPriority() {return priority;}
    public int getReminder() {return reminder;}
    
    public void setName(String _name) {name=_name;}
    public void setDate(Date _date) {date=_date;}
    public void setDuration(String _duration) {duration=_duration;}
    public void setLocation(String _location) {location=_location;}
    public void setParticipants(String _participants) {participants=_participants;}
    public void setAttachementfiles(String _attachementfiles) {attachementfiles=_attachementfiles;}
    public void setPriority(String _priority) {priority=_priority;}
    public void setReminder(int _reminder) {reminder=_reminder;}
    
    public static void main(String args[])
    {
        add_button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Appointment appointment = new Appointment();
                appointment.setName(event_name.getText());
                appointment.setDate(event_date.getText());
                appointment.setDuration(event_duration.getText());
                appointment.setLocation(event_location.getText());
                appointment.setParticipants(event_participants.getText());
                appointment.setAttachementfiles(~~.getText());
                appointment.setPriority(event_priority.getText());
                appointment.setReminder(~~.getText());
            }
        });
    }
}
