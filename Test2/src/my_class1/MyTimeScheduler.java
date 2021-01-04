/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_class1;

/**
 *
 * @author Julia
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
 
public class MyTimeScheduler extends JFrame {
 
  DefaultTableModel model;
  Calendar cal = new GregorianCalendar();
  JLabel label;
 
 MyTimeScheduler() {
 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("MyTimeScheduler");
    this.setSize(600,500);
    this.setLayout(new BorderLayout());
    this.setVisible(true);
 
 
    label = new JLabel();
    label.setHorizontalAlignment(SwingConstants.CENTER);
 
    JButton b1 = new JButton("<-");
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.MONTH, -1);
        updateMonth();
      }
    });
 
    JButton b2 = new JButton("-->");
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.MONTH, +1);
        updateMonth();
      }
      
    JLabel westLable = new JLabel("W", JLabel.CENTER);
    westLable.setOpaque(true);
    westLable.setBackground(Color.GREEN);
    westLable.setPreferredSize(new Dimension(30,300));
    });
 
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(b1,BorderLayout.WEST);
    panel.add(label,BorderLayout.CENTER);
    panel.add(b2,BorderLayout.EAST);
 
 
    String [] columns = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    model = new DefaultTableModel(null,columns);
    JTable table = new JTable(model);
    JScrollPane pane = new JScrollPane(table);
 
    this.add(panel,BorderLayout.NORTH);
    this.add(pane,BorderLayout.CENTER);
 
    this.updateMonth();
 
  }
 
  void updateMonth() {
    cal.set(Calendar.DAY_OF_MONTH, 1);
 
    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
    int year = cal.get(Calendar.YEAR);
    label.setText(month + " " + year);
 
    int startDay = cal.get(Calendar.DAY_OF_WEEK);
    int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
 
    model.setRowCount(0);
    model.setRowCount(weeks);
 
    int i = startDay-1;
    for(int day=1;day<=numberOfDays;day++){
      model.setValueAt(day, i/7 , i%7 );    
      i = i + 1;
    }
 
  }
 
  public static void main(String[] arguments) {
    JFrame.setDefaultLookAndFeelDecorated(true);
    MyTimeScheduler sc = new MyTimeScheduler();
  }
 
}