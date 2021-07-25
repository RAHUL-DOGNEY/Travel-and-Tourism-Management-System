/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;

/**
 *
 * @author RAHUL PC
 */
public class Dashboard extends JFrame implements ActionListener{ 
    String username;
    JLabel jLabel1,jLabel2,jLabel3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b13;
//    
        Dashboard(String username){//Constructor
            this.username = username; 
           
            //setExtendedState(JFrame.MAXIMIZED_BOTH);//full Screen Frame*********/MAXIMIZED_BOTH --Static Variable   
            setLayout(null); //FRAME
            getContentPane().setBackground(Color.WHITE);
            setBounds(150,40,1063, 687);
//            Main Image
            JLabel jLabel11 = new JLabel();
            jLabel11.setIcon(new ImageIcon(getClass().getResource("/Images/dashboard.jpg"))); // NOI18N
//            jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
            jLabel11.setBounds(250,97,800,575);
            jLabel11.setDoubleBuffered(true);
            add(jLabel11);
            
//     ***************Top Bar PANEL  Start Container*********    
            JPanel jPanel1 = new JPanel();
            jPanel1.setLayout(null);
            jPanel1.setBackground(new java.awt.Color(31, 36, 42));
            jPanel1.setBounds(0,0,1603,100);
            jPanel1.setPreferredSize(new java.awt.Dimension(1120, 121));
            add(jPanel1);
            
//            
//            jLabel1.setIcon(new ImageIcon(getClass().getResource("/Images/dash.png"))); // NOI18N
//            jLabel1.setBounds(5,5,128,86);
//            jPanel1.add(jLabel1);
            
            ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/dash.png"));
            Image i5 = i4.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            JLabel jLabel2 = new JLabel(i6);
            jLabel2.setBounds(15,5,120,90);
            jPanel1.add(jLabel2);
//            DASHBOARD
            JLabel jLabel3 = new JLabel("Dashboard");
            jLabel3.setFont(new Font("Tahoma", 1, 36)); // NOI18N
            jLabel3.setForeground(new Color(255, 255, 255));    
            jLabel3.setBounds(150,35,210,35);
            jPanel1.add(jLabel3);
//            ICON
            JLabel jLabel4 = new JLabel();
            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N
            jLabel4.setBounds(435,5,91,83);
            jLabel4.setDoubleBuffered(true);
            jPanel1.add(jLabel4);
//              NAME
            JLabel jLabel5 = new JLabel("RSV Soft");
            jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 30)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(169, 224, 49));
            jLabel5.setBounds(525,10,150,30);
            jLabel5.setDoubleBuffered(true);
            jPanel1.add(jLabel5);
//
            JLabel jLabel6 = new JLabel();
            jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(169, 224, 49));
            jLabel6.setText("Travel And Tourism Management System");
            jLabel6.setBounds(525,50,500,30);
            jLabel6.setDoubleBuffered(true);
            jPanel1.add(jLabel6);
// 2nd
            JPanel jPanel2 = new JPanel();
            jPanel2.setLayout(null);
            jPanel2.setBackground(new java.awt.Color(31, 36, 42));
            jPanel2.setBounds(0,100,251,564);
            jPanel2.setPreferredSize(new java.awt.Dimension(1120, 121));
            add(jPanel2);
            
            JPanel jPanel12 = new JPanel();
            jPanel12.setLayout(null);
            jPanel12.setBackground(new java.awt.Color(31, 36, 42));
            jPanel12.setBounds(0,100,251,564);
            jPanel12.setPreferredSize(new java.awt.Dimension(1120, 121));
            add(jPanel2);
            

            
//Button **1 start**
        b1 = new JButton("Add Personal Detail");
        b1.setBackground(new Color(0,102,255));
        b1.setFont(new Font("Tahoma",Font.PLAIN,18));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Male_User_35px.png")));
        b1.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b1.setBounds(10,10,232,42);
        b1.addActionListener(this);
        jPanel2.add(b1);
        //Button **1 end**
//Button **2 start**
        b2 = new JButton("Update Personal Detail");
        b2.setBackground(new Color(0,102,255));
        b2.setFont(new Font("Tahoma",Font.PLAIN,18));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        b2.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b2.setBounds(10,62,232,42);
        b2.addActionListener(this);
        jPanel2.add(b2);
        //Button **2 end**
//Button **1 start**
        b3 = new JButton("View Personal Detail");
        b3.setBackground(new Color(0,102,255));
        b3.setFont(new Font("Tahoma",Font.PLAIN,18));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewinfo.png"))); // NOI18N
        b3.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b3.setBounds(10,114,232,42);
        b3.addActionListener(this);
        jPanel2.add(b3);
        //Button **1 end**
//Button **1 start**
        b4 = new JButton("Check Package");
        b4.setBackground(new Color(0,102,255));
        b4.setFont(new Font("Tahoma",Font.PLAIN,18));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkinfo.png"))); // NOI18N
        b4.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b4.setBounds(10,166,232,42);
        b4.addActionListener(this);
        jPanel2.add(b4);
        //Button **1 end**
//Button **5 start**
        b5 = new JButton("Book Package");
        b5.setBackground(new Color(0,102,255));
        b5.setFont(new Font("Tahoma",Font.PLAIN,18));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/booking.png"))); // NOI18N
        b5.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b5.setBounds(10,218,232,42);
        b5.addActionListener(this);
        jPanel2.add(b5);
        //Button **5 end**
//Button **6 start**
        b6 = new JButton("View Booked Package");
        b6.setBackground(new Color(0,102,255));
        b6.setFont(new Font("Tahoma",Font.PLAIN,18));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelpack.png"))); // NOI18N
        b6.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b6.setBounds(10,270,232,42);
        b6.addActionListener(this);
        jPanel2.add(b6);
        //Button **6 end**
//Button **7 start**
        b7 = new JButton("Check Hotels");
        b7.setBackground(new Color(0,102,255));
        b7.setFont(new Font("Tahoma",Font.PLAIN,18));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        b7.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b7.setBounds(10,322,232,42);
        b7.addActionListener(this);
        jPanel2.add(b7);
        //Button **7 end**
 //Button **8 start**
        b8 = new JButton("Book Hotel");
        b8.setBackground(new Color(0,102,255));
        b8.setFont(new Font("Tahoma",Font.PLAIN,18));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewhotel.png"))); // NOI18N
        b8.setForeground(Color.WHITE);
        b8.setBounds(10,374,232,42);
        b8.addActionListener(this);
        jPanel2.add(b8);
        //Button **8 end**
//Button **9 start**
        b9 = new JButton("View Booked Hotel");
        b9.setBackground(new Color(0,102,255));
        b9.setFont(new Font("Tahoma",Font.PLAIN,18));
        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/viewinfo.png"))); // NOI18N
        b9.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b9.setBounds(10,428,232,42);
        b9.addActionListener(this);
        jPanel2.add(b9);
        
        
        b10 = new JButton("Payment");
        b10.setBackground(new Color(0,102,255));
        b10.setFont(new Font("Tahoma",Font.PLAIN,18));
        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment.png"))); // NOI18N
        b10.setForeground(Color.WHITE);
       // b1.setMargin(new Insets(0,0,0,45));// TOP,LEFT,BOTTOM,RIGHT
        b10.setBounds(10,480,232,42);
        b10.addActionListener(this);
        jPanel2.add(b10);
        //Button **1 end**
        
        }

        
        
        
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
           new  AddCustomer(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new UpdateDetail(username).setVisible(true);
        }else if(ae.getSource()==b3){
            new ViewCustomer(username).setVisible(true);
        }else if(ae.getSource()==b4){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b5){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource() == b6){
            new ViewPackage(username).setVisible(true);
        }else if(ae.getSource() == b7){
            new CheckHotels().setVisible(true);
        }else if(ae.getSource()==b8){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource()==b9){
            new BookedHotel(username).setVisible(true);
        }else if(ae.getSource() == b10){
            new Payment().setVisible(true);
        }
    }
    public static void main(String args[]){ //MAIN METHOD
        new Dashboard("").setVisible(true);//Object
        
    }
}
