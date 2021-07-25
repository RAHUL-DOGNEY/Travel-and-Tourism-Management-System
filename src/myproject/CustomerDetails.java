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
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JScrollPane;
/**
 *
 * @author RAHUL PC
 */
public class CustomerDetails extends JFrame implements ActionListener{ 
    String username;
    JTextField t1,t2,t3;
    JLabel jLabel1,jLabel2,jLabel3;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b13;
    JScrollPane jScrollPane1, jScrollPane2;
    JTable jTable1,jTable2;

//    
        CustomerDetails(String aman123){//Constructor
            this.username = username;  
            //setExtendedState(JFrame.MAXIMIZED_BOTH);//full Screen Frame*********/MAXIMIZED_BOTH --Static Variable   
            setLayout(null); //FRAME
            getContentPane().setBackground(Color.BLUE);
            setBounds(150,40,1063, 687);
//            Main Image
            JLabel jLabel11 = new JLabel();

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
            jLabel3.setForeground(new java.awt.Color(169, 224, 49));    
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
            jPanel2.setBackground(Color.ORANGE);
//        (new java.awt.Color(31, 36, 42));
            jPanel2.setBounds(0,100,251,130);
            jPanel2.setPreferredSize(new java.awt.Dimension(1120, 121));
            add(jPanel2);
             
            JPanel jPanel3 = new JPanel();
            jPanel3.setLayout(null);
            jPanel3.setBackground(Color.darkGray);
//        (new java.awt.Color(31, 36, 42));
            jPanel3.setBounds(0,200,251,564);
            jPanel3.setPreferredSize(new java.awt.Dimension(1120, 121));
            add(jPanel3);
//            JPanel jPanel12 = new JPanel();
//            jPanel12.setLayout(null);
//            jPanel12.setBackground(new java.awt.Color(31, 36, 42));
//            jPanel12.setBounds(0,100,251,564);
//            jPanel12.setPreferredSize(new java.awt.Dimension(1120, 121));
//            add(jPanel2);
            
            JLabel l2 = new JLabel("Enter Username");
            l2.setFont(new Font("Tahoma",Font.PLAIN,20));
            l2.setForeground(Color.BLACK);
            l2.setBounds(20,10,200,38);
            jPanel2.add(l2);
           //Text Fied
            t1 = new JTextField();  
            t1.setBounds(20,42,200,32);
            t1.setFont(new Font("Tahoma",Font.PLAIN,20));
            jPanel2.add(t1);
            
            t2 = new JTextField();
            t2.setBounds(500,200,150,25);
            add(t2);

            t3 = new JTextField();
            t3.setBounds(500,230,150,25);
            add(t3);
            
            JLabel l3 = new JLabel("Registered Usernames");
            l3.setFont(new Font("Tahoma",Font.PLAIN,20));
            l3.setForeground(Color.YELLOW);
            l3.setBounds(20,20,200,38);
            jPanel3.add(l3);
            
            
////Button **1 start**
        b1 = new JButton("Search");
        b1.setBackground(new Color(0,102,255));
        b1.setFont(new Font("Tahoma",Font.PLAIN,18));
        b1.setForeground(Color.WHITE);
        b1.setBounds(60,80,100,38);
        b1.addActionListener(this);
        jPanel2.add(b1);
//        //Button **1 end**

//        
        }
 
        
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
    if(ae.getSource() == b1){
            
              
            try{
                 String sql = "select * from customer where username = '"+t1.getText()+"'";
                 ResultSet rs = c.s.executeQuery(sql);//puri row ha // yaha return kerta ha set.return class ka//ute function data retrive //This Function is return the Atribute row
          
                 while(rs.next()){                       //Columkn to column Jump kerna ka liya function()
                    t2.setText(rs.getString("name"));            //yha per search ka cliuc per name and sequriti question
                    t3.setText(rs.getString("email"));
                }
             
             
           }catch(Exception e){ }
     }
    }
    public static void main(String args[]){ //MAIN METHOD
        new CustomerDetails("").setVisible(true);
        
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
