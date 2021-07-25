/**
 * @author RAHUL PC
 */
package myproject;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
public class Loading  extends JFrame implements Runnable{ ///**1**Jab bi implements Runnable kerr ta ha to hmko explecitly Runnable class ka Boject Bna na pdta ha
    //Progress Bar Predefine Class HOTI HA
    JProgressBar p; //Declare
    //thread Object
    Thread t; //**2
    String username;

    Loading() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void run(){ //Start Method Runn Function Koo Call Kerta Haa
        try{                 //**58** Method ko Ovveride KErwa Diya Override 
            for(int i = 1 ;i<=101;++i){
                int m = p.getMaximum();//MAximum VAlue Calculation's //suppes 100
                int n = p.getValue();//Progress BAr ki Current value // 32
                if(n < m){ //32<100
                    p.setValue(p.getValue()+1); //33
                }else{
                    i = 101;
                    setVisible(false);
                    //Home h
              //       new  CustomerDetails("username").setVisible(true);
          
//                    else{
                        new Dashboard(username).setVisible(true);
//                     }
                }
                Thread.sleep(50);
            }
        }catch(Exception e){}
    }
    
    Loading(String user){
         username = user;
        //Thread Declaration
        t = new Thread(this);//**4*
        
        
        
        setBounds(200,200,500,370);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        JLabel l1 = new JLabel("Travel And Tourism Application");
        l1.setFont(new Font("Tahoma",Font.BOLD,25));
        l1.setBounds(40,20,600,40);
        l1.setForeground(Color.BLUE); 
        add(l1);
        
        p = new JProgressBar();
        p.setStringPainted(true);//By default False
        p.setBounds(100,90,250,20);
        add(p);
        
        JLabel l2 = new JLabel("Please Wait...");
        l2.setFont(new Font("Raleway",Font.BOLD,15));
        l2.setBounds(250,100,200,40);
        l2.setForeground(Color.RED); 
        add(l2);
        
        
        JLabel l3 = new JLabel("Welcome " + username);
        l3.setFont(new Font("Raleway",Font.BOLD,15));
        l3.setBounds(20,290,400,40);
        l3.setForeground(Color.RED); 
        add(l3);
     //Thgread Start 
     t.start(); //**3Start method Run MErhod Ko Call Kerta ha
    }
    
    public static void main(String args[]){
        new Loading("").setVisible(true);
    }
    
}



























































































































//package 
//
//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;
//import java.sql.*;
//
//public class Loading extends JFrame implements Runnable {
//
//	private JPanel contentPane;
//	private JProgressBar progressBar;
//	Connection conn;
//        String username;
//	int s;
//	Thread th;
//
//	public static void main(String[] args) {
//            new Loading("").setVisible(true);
//	}
//
//	public void setUploading() {
//            setVisible(false);
//            th.start();
//	}
//
//	public void run() {
//            try {
//                for (int i = 0; i < 200; i++) {
//                    s = s + 1;
//                    int m = progressBar.getMaximum();
//                    int v = progressBar.getValue();
//                    if (v < m) {
//                        progressBar.setValue(progressBar.getValue() + 1);
//                    } else {
//                        i = 201;
//                        setVisible(false);
//                        new Home(username).setVisible(true);
//                    }
//                    Thread.sleep(50);
//                }
//            } catch (Exception e) {
//		e.printStackTrace();
//            }
//	}
//
//	public Loading(String username) {
//            this.username = username;
//            th = new Thread((Runnable) this);
//
//            setBounds(600, 300, 600, 400);
//            contentPane = new JPanel();
//            contentPane.setBackground(new Color(51,204, 255));
//            setContentPane(contentPane);
//            contentPane.setLayout(null);
//
//            JLabel lbllibraryManagement = new JLabel("Travel and Toursim Application");
//            lbllibraryManagement.setForeground(new Color(72, 209, 204));
//            lbllibraryManagement.setFont(new Font("Trebuchet MS", Font.BOLD, 35));
//            lbllibraryManagement.setBounds(50, 46, 700, 35);
//            contentPane.add(lbllibraryManagement);
//	
//            progressBar = new JProgressBar();
//            progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
//            progressBar.setStringPainted(true);
//            progressBar.setBounds(130, 135, 300, 25);
//            contentPane.add(progressBar);
//
//            JLabel lblNewLabel_2 = new JLabel("Please Wait....");
//            lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
//            lblNewLabel_2.setForeground(new Color(160, 82, 45));
//            lblNewLabel_2.setBounds(200, 165, 150, 20);
//            contentPane.add(lblNewLabel_2);
//
//            JPanel panel = new JPanel();
//            panel.setBackground(Color.WHITE);
//            panel.setBounds(10, 10, 580, 380);
//            contentPane.add(panel);
//              
//            setUndecorated(true);
//            setUploading();
//	}
//}