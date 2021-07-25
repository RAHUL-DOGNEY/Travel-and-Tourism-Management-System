/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import javax.swing.*;//
import java.awt.*;
import myproject.NewSignin;

/**
 * @author RAHUL PC
 */
public class SpalshScreen {
    public static void main(String args[]){ //1
        SplashFrame frame = new SplashFrame();//9//17//20//rmove kerna ka liya extend kerwa loo//SplashFrame().setVisible(true); this is removed and place last line//
        //**************MULTI THRADING*************
        //SpalshScreen1 screen = new SpalshScreen1();
        NewSignin sign = new NewSignin();
        int x = 1;
        for(int i=1;i<=400;i+=6,x+=7){//23
            frame.setLocation(350-(x+i)/4,390-(i/2));//18 Changes
            frame.setSize(x+i, i);//19 Changes
            try{
            Thread.sleep(10);
            }catch(Exception e){}
        }
        frame.setVisible(true);//21 copy past
    }
}
  

class SplashFrame extends JFrame implements Runnable {//10//24
   //12 remove because extend // JFrame f = new JFrame();//5
    Thread t1;//25
    SplashFrame(){ //2    
        ImageIcon im1 = new ImageIcon(ClassLoader.getSystemResource("icon/splash.jpg"));//3
        Image i2 = im1.getImage().getScaledInstance(1600, 700, Image.SCALE_DEFAULT);//16 Image kko scale kerna haaa //Image class use kiya //awt me ho ti haa//Image pdi hui ha il oject ke ander  //WIDTH, HEIGHT, WIDTH     
       //eska 1 isuu esliya Image iocon fir sa bnaaa pda ga
       ImageIcon i3 = new ImageIcon(i2);//17 
       JLabel la1 = new JLabel(i3);  //6//image direct show nhi ker skta ha uskoo Lable me lana pdta ha
       add(la1);//8  //f.add(il);//7 add hream //11 remove f because used JFrame class
       setUndecorated(true);//29        
       t1 = new Thread(this);
        t1.start();
       
//        setLocation(300,500);//13
//        setSize(300,500);//14
          setBounds(100,50,120,700); //15
        
    }
    public void run(){ //26
        try{
            Thread.sleep(7000);
            this.setVisible(false);
           //Login Page Call 
           new NewSignin().setVisible(true);
        }catch(Exception e){}
    }  
} 

