/*
 * 
 * 
 * 
 */
package myproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * 
 */
public class Payment extends JFrame implements ActionListener{
   JButton b1,b2,b3;
    Payment(){ //Constructor
       setBounds(300,160,600,550);
       setLayout(null);
       getContentPane().setBackground(Color.GRAY);
       //Image
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/paytm.jpeg"));
       Image i2 = i1.getImage().getScaledInstance(605, 500, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       l1.setBounds(0, 0 ,605,500);
       add(l1);
       //Image end
       //Button start
       b1 = new JButton("Pay");
       b1.setBounds(100,5,80,20);
       b1.addActionListener(this);
       l1.add(b1);

       b2 = new JButton("Back");
       b2.setBounds(380,5,80,20);
       b1.addActionListener(this);
       l1.add(b2);
       //Button
   }//Constructor 
    //Overriding Pollymorphism
     public void actionPerformed(ActionEvent ae){
           //NOTE :- not defrenciat using if else condion //and // ae.getsource()==b1 ......

        if(ae.getSource() == b1)
        {
             try{
                    Runtime.getRuntime().exec("chrome.exe");
                }catch(Exception e){ }
            
        }else if(ae.getSource()==b2){
           this.setVisible(false);
        }
        
//         public void actionPerformed(ActionEvent ae){
     }   
   
    
   public static void main(String[] args){
       new Payment().setVisible(true);
   }
}


