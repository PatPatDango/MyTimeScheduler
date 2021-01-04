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
import javax.swing.*;
import java.awt.*;
 
public class BorderLayoutExample {
  public static void main(String[] arguments) {
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame f = new JFrame("BorderLayout Example");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    // setSize(int width, int height);
    f.setSize(400,300); 
    f.setLayout(new BorderLayout());
 
 
    JLabel northLable = new JLabel("N", JLabel.CENTER);
    northLable.setOpaque(true);
    northLable.setBackground(Color.RED);
 
    // Dimension(int width, int height)
    northLable.setPreferredSize(new Dimension(400, 30));
 

 
    JLabel westLable = new JLabel("W", JLabel.CENTER);
    westLable.setOpaque(true);
    westLable.setBackground(Color.GREEN);
    westLable.setPreferredSize(new Dimension(30,300));
 
    JLabel centerLable = new JLabel("Center", JLabel.CENTER);
    centerLable.setOpaque(true);
    centerLable.setBackground(Color.BLUE);
 
 
    f.add(northLable,BorderLayout.NORTH);
    f.add(westLable,BorderLayout.WEST);
    f.add(centerLable,BorderLayout.CENTER);
 
    f.setVisible(true);
  }
}