package myproject;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;//Esma Abstrace Method ha  ??Inter face me Ager koi Abstract method ha to usss Method ko appni Class me Ovv//**Override kra na pdaa ga
import java.sql.*;
import java.sql.ResultSet;

import javax.swing.*; 
import java.awt.*;// Color Classs Hoti Ha esma
public class ViewPackage extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9; //username
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1;
    
    ViewPackage(String username){
//        setSize(500,700);
//        setLocation(400,200)
          setLayout(null);//BoarderLayout , FlowLayout,GridLayout,Gride//
          getContentPane().setBackground(Color.BLACK);
          setBounds(275,80,815,500);
          
          
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
        JLabel h = new JLabel("View Your Booked Package");
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
        JLabel l2 = new JLabel("Package");
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
        JLabel l4 = new JLabel("ID Proof");
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
        JLabel l5 = new JLabel("Number");
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
        JLabel l6 = new JLabel("Phone");
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
        JLabel l7 = new JLabel("Price");
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
        b1 = new JButton("Back");
        b1.setBackground(new Color(152,201,45));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));   
        b1.setForeground(new Color(21,25,10));
        b1.setBounds(200,380,128,40);
        b1.addActionListener(this);
        p2.add(b1);
        
//          
//          

         
          JPanel imgaepanel = new JPanel();
          imgaepanel.setBackground(Color.WHITE);
          imgaepanel.setBounds(520,0,815,540);
          imgaepanel.setLayout(null);
          add(imgaepanel);
          
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookedDetails.jpg"));
          Image i2 = i1.getImage().getScaledInstance(280,540,  Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l10 = new JLabel(i3);
          l10.setBounds(0,0,280,540);
          imgaepanel.add(l10);
          setVisible(true);
            
         
         try{
             Conn c = new Conn();
             ResultSet rs = c.s.executeQuery("select * from bookpackage where username = '"+username+"'");
             
                       //jum column to column
            while(rs.next()){
                l11.setText(rs.getString(1));
                l12.setText(rs.getString(2));
                l13.setText(rs.getString(3));
                l14.setText(rs.getString(4));
                l15.setText(rs.getString(5));
                l16.setText(rs.getString(6));
                l17.setText(rs.getString(7));
                
               
            }
        }catch(Exception e){
            
        }
       
    }

    ViewPackage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == b1){
          this.setVisible(false);
      }      
    }

    public static void main(String[] args){
        new ViewPackage("").setVisible(true);
    }

}
