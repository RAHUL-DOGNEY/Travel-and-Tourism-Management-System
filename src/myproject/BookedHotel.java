/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;//Esma Abstrace Method ha  ??Inter face me Ager koi Abstract method ha to usss Method ko appni Class me Ovv//**Override kra na pdaa ga
import java.sql.*;
import java.sql.ResultSet;

import javax.swing.*; 
import java.awt.*;// Color Classs Hoti Ha esma
public class BookedHotel extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9; //username
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1;
    
    BookedHotel(String username){
//        setSize(500,700);
//        setLocation(400,200)
          setLayout(null);//BoarderLayout , FlowLayout,GridLayout,Gride//
          getContentPane().setBackground(Color.BLACK);
          setBounds(275,80,815,540);
          
          
          JPanel p2 = new JPanel();
          p2.setLayout(null);
          p2.setBackground(new Color(31,36,42));
           // p2.setBackground(Color.BLUE);
            p2.setBounds(0,0,520,540);
            p2.setBounds(0,0,520,500);
          //p1.setBounds(0,0,815,540);
          add(p2);
//          
 
          
           // Labels
        JLabel h = new JLabel("Booked Hotel Details");
        h.setFont(new java.awt.Font("Tahoma", 1, 24));
        h.setBounds(125,15,350,35);
        h.setForeground(new Color(169, 224, 49));  
        p2.add(h);
            
        JLabel l1 = new JLabel("User Name");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(42,65,200,38);
        l1.setForeground(new Color(169, 224, 49));  
        p2.add(l1);
        
        JLabel l11 = new JLabel();
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        l11.setForeground(new java.awt.Color(169, 224, 49));
        l11.setBounds(300,70,200,32);
        p2.add(l11);
        
//          ------------------ //
        JLabel l2 = new JLabel("Hotel Name");
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setForeground(new java.awt.Color(169, 224, 49));
        l2.setBounds(42,110,200,38);
        p2.add(l2);
        

        JLabel l12 = new JLabel();
        l12.setFont(new Font("Tahoma",Font.PLAIN,20));
        l12.setForeground(new java.awt.Color(169, 224, 49));
        l12.setBounds(300,110,200,32);
        p2.add(l12);
     
//        ---------------------  //

        JLabel l3 = new JLabel("Total Persons");
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setForeground(new java.awt.Color(169, 224, 49));
        l3.setBounds(42,155,200,38);
        p2.add(l3);
//        
        JLabel l13 = new JLabel();
        l13.setFont(new Font("Tahoma",Font.PLAIN,20));
        l13.setForeground(new java.awt.Color(169, 224, 49));
        l13.setBounds(300,150,200,32);
        p2.add(l13);
        
//        
        JLabel l4 = new JLabel("Total Days");
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setForeground(new java.awt.Color(169, 224, 49));
        l4.setBounds(42,195,200,38);
        p2.add(l4);
        
        JLabel l14 = new JLabel();
        l14.setFont(new Font("Tahoma",Font.PLAIN,20));
        l14.setForeground(new java.awt.Color(169, 224, 49));
        l14.setBounds(300,190,200,32);
        p2.add(l14);
        
//        
        JLabel l5 = new JLabel("AC Included");
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setForeground(new java.awt.Color(169, 224, 49));
        l5.setBounds(42,235,200,38);
        p2.add(l5);
        
        JLabel l15 = new JLabel();
        l15.setFont(new Font("Tahoma",Font.PLAIN,20));
        l15.setForeground(new java.awt.Color(169, 224, 49));
        l15.setBounds(300,230,200,32);
        p2.add(l15);        
                      
//       
        JLabel l6 = new JLabel("Food Included");
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setForeground(new java.awt.Color(169, 224, 49));
        l6.setBounds(42,275,200,38);
        p2.add(l6);
        
        JLabel l16 = new JLabel();
        l16.setFont(new Font("Tahoma",Font.PLAIN,20));
        l16.setForeground(new java.awt.Color(169, 224, 49));
        l16.setBounds(300,270,200,32);
        p2.add(l16);
           
//
        JLabel l7 = new JLabel("ID");
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setForeground(new java.awt.Color(169, 224, 49));
        l7.setBounds(42,315,200,38);
        p2.add(l7);
//        
        JLabel l17 = new JLabel();
        l17.setFont(new Font("Tahoma",Font.PLAIN,20));
        l17.setForeground(new java.awt.Color(169, 224, 49));
        l17.setBounds(300,310,200,32);
        p2.add(l17); 
//
        JLabel l8 = new JLabel("Number");
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setForeground(new java.awt.Color(169, 224, 49));
        l8.setBounds(42,355,200,38);
        p2.add(l8);
//        
        JLabel l18 = new JLabel();
        l18.setFont(new Font("Tahoma",Font.PLAIN,20));
        l18.setForeground(new java.awt.Color(169, 224, 49));
        l18.setBounds(300,350,200,32);
        p2.add(l18);  
//
        JLabel l9 = new JLabel("Phone No.");
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setForeground(new java.awt.Color(169, 224, 49));
        l9.setBounds(42,395,200,38);
        p2.add(l9);
//      
        JLabel l19 = new JLabel();
        l19.setFont(new Font("Tahoma",Font.PLAIN,20));
        l19.setForeground(new java.awt.Color(169, 224, 49));
        l19.setBounds(300,390,200,32);
        p2.add(l19);      
              
//     
        JLabel l10 = new JLabel("Total Cost");
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l10.setForeground(new java.awt.Color(169, 224, 49));
        l10.setBounds(42,425,200,38);
        p2.add(l10);
//      
        JLabel l20 = new JLabel();
        l20.setFont(new Font("Tahoma",Font.PLAIN,20));
        l20.setForeground(new java.awt.Color(169, 224, 49));
        l20.setBounds(300,425,200,32);
        p2.add(l20);     
    
        //database
        try{
            Conn c = new Conn();
            ResultSet rs  = c.s.executeQuery("select * from bookhotel where username = '"+username+"'"); //result set ka object //execute kermn ka liya 
            while(rs.next()){
                l11.setText(rs.getString(1));   // using Database Table Column Order
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));//
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                l18.setText(rs.getString(8));
                l19.setText(rs.getString(9));
                l20.setText(rs.getString(10));
            }
        }catch(Exception e){ }
//database

        
        
        b1 = new JButton("Back");
        b1.setBackground(new Color(152,201,45));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));   
        b1.setForeground(new Color(21,25,10));
        b1.setBounds(200,452,128,40);
        b1.addActionListener(this);
        p2.add(b1);
        
//          
//          

         
          JPanel imgaepanel = new JPanel();
          imgaepanel.setBackground(Color.WHITE);
          imgaepanel.setBounds(520,0,815,540);
          imgaepanel.setLayout(null);
          add(imgaepanel);
          
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookpackag.jpg"));
          Image i2 = i1.getImage().getScaledInstance(280,540,Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel limg = new JLabel(i3);
          limg.setBounds(0,0,280,540);
          imgaepanel.add(limg);
          setVisible(true);
   //          
       //  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("/icon/update.png"));
        
    }
    
    public static void main(String[] args){
        new BookedHotel("");
    }

    BookedHotel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
