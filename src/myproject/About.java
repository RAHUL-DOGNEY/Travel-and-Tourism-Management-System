package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author RAHUL PC
 */
public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    About(){
        setBounds(300,160,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);
        
        JLabel l1 = new JLabel("<html><b><u>Travel and Toursim Management System</u></b></html>");
        l1.setBounds(40,5,550,50);
        l1.setForeground(Color.orange);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l1);
        
        s = "About Projects\n" + 
             "\n" +
            "The objective of the travel and Tourism management System  Project is to develop a system that automatic"+
            "\n"+    
            "This aapplication will help in accessimg the information related to the travel to the particular d"+
            "\n"+

            "Advantages of Project:\n"+
            "-Gives accurate informaton\n"+
            "-Simplifies the mannul work"+
            "-It minimizes the doucmentation related work\n"+
            "-Provides up to date information\n"+
            "-Friendlty Environment by providing warning messages.\n"+
            "-Travel details can be provided\n" +
            "-Booking conformation notification\n";        

        //Text area
        TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(12,60,450,360);
        add(t1);
        add(l1);         
        //TwextArea End
        //Button
            b1 = new JButton("Back");
            b1.setBounds(220,450,80,40);
            b1.addActionListener(this);
            add(b1);
//Button
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }
    public static void main(String args[]){
        new About().setVisible(true);
    }
}
