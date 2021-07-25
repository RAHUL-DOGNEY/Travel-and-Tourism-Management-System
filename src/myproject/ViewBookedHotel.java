///*
//*   THIS PACKAGE SAME TO SAME VIEWPACKAGE CLASS
//* Some Editing is requried for this package
//*/
//
//
//
//
package myproject;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;




import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author RAHUL PC
 */
public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton b1;
    public ViewBookedHotel(String username){
        setBounds(300,200,700,430);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l30 = new JLabel(i3);
        l30.setBounds(320,2,400,430);
        add(l30);
        //Image
        
    //Labels
        JLabel heading  = new JLabel("VIEW PACKAGE HOTEL"); //Heading
        heading.setBounds(60,0,250,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(heading);
        
        JLabel l1 = new JLabel("Username :");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(30,60,180,25);
        add(l1);
        
        JLabel l11 = new JLabel();
        l11.setBounds(180,60,180,25);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l11);
        
        
        JLabel l2 = new JLabel("Hotel Name :");
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setBounds(30,90,180,25);
        add(l2);
        
        JLabel l12 = new JLabel();
        l12.setBounds(180,90,180,25);
        l12.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l12);
        
        JLabel l3 = new JLabel("Total Persons :");
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setBounds(30,120,180,25);
        add(l3);
        
        JLabel l13 = new JLabel();
        l13.setBounds(180,120,180,25);
        l13.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l13);

        
        JLabel l4 = new JLabel("Total Days :");
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setBounds(30,150,180,25);
        add(l4);
        
        JLabel l14 = new JLabel();
        l14.setBounds(180,150,200,25);
        l14.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l14);        
        

        JLabel l5 = new JLabel("Ac Included :");
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setBounds(30,180,180,25);
        add(l5);
        
        JLabel l15 = new JLabel();
        l15.setBounds(180,180,300,25);
        l15.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l15);        
       
        JLabel l6 = new JLabel("Food Included :");
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setBounds(30,210,180,25);
        add(l6);
        
        JLabel l16 = new JLabel();
        l16.setBounds(180,210,300,25);
        l16.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l16);
        
        JLabel l7 = new JLabel("Id :");
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setBounds(30,240,180,25);
        add(l7);
        
        JLabel l17 = new JLabel();
        l17.setBounds(180,240,300,25);
        l17.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l17);        

        JLabel l8 = new JLabel("Number :");
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setBounds(30,270,180,25);
        add(l8);
        
        JLabel l18 = new JLabel();
        l18.setBounds(180,270,300,25);
        l18.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l18);        

        JLabel l9 = new JLabel("Phone :");
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setBounds(30,300,180,25);
        add(l9);
        
        JLabel l19 = new JLabel();
        l19.setBounds(180,300,300,25);
        l19.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l19);        
        

        JLabel l10 = new JLabel("Total Cost :");
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l10.setBounds(30,330,180,25);
        add(l10);
        
        JLabel l20 = new JLabel();
        l20.setBounds(180,330,300,25);
        l20.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l20);        
        
        
//database
        try{
            Conn c = new Conn();
            ResultSet rs  = c.s.executeQuery("select * from bookhotel where username = 'rahul111'"); //result set ka object //execute kermn ka liya 
            while(rs.next()){
                l11.setText(rs.getString(1));   // using Database Table Column Order
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                l20.setText(rs.getString(10));
            }
        }catch(Exception e){ }
//database


//button
        b1 = new JButton("Back");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBounds(120,360,80 ,30);
        add(b1);
//button
        
       
//Labels
        
    }
    
    //override
     public void actionPerformed(ActionEvent ae){
        this.setVisible(false); //NOTE :- not defrenciat using if else condion //and // ae.getsource()==b1 ......
    }
    //Overide
    
    //main
    public static void main(String args[]){
        new ViewBookedHotel("").setVisible(true);
    }
}

