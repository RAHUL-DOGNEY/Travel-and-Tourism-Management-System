               /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import javax.script.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author RAHUL PC
 */
public class Paytm extends JFrame implements ActionListener{
    JButton b1;
    Paytm(){
        setBounds(300,160,800,600);
        //hmara pass 2 cija hoti ha 1.textedior and 2.textarea
               //In this setpage function in Jeditorpane me ho ta ha
        JEditorPane j = new JEditorPane();
        j.setEditable(false); //External INTITY HAA esliya TRY CATCH
        try {      
//              <button class="btn-block btn-color"> <script src="https://checkout.razorpay.com/v1/payment-button.js" data-payment_button_id="pl_GbvZxYPuVyazct"async> 
//                                </script></button>
//           // j.setPage("<script src="https://checkout.razorpay.com/v1/payment-button.js" data-payment_button_id="pl_GbvZxYPuVyazct"async> </script>");
            j.setPage("https://paytm.com/credit-card-bill-payment");
//              j.setPage("https://checkout.razorpay.com");
        }catch(Exception e){
           //ager koi exceptio ha to paint bii kerwa naa haa
           j.setContentType("text/html");
           j.setText("<html>Could Not Load , Error 404 </html>");
        }
        add(j);
        
        //Scroll star
        JScrollPane js = new JScrollPane(j);
        getContentPane().add(js);
        //Scroll end
        
        b1 = new JButton("Back");
        b1.setBounds(200,300,40,30);
        b1.addActionListener(this);
        j.add(b1);
    }
    
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new Paytm().setVisible(true);
    }
    
    public static void main(String[] args){
        new Paytm().setVisible(true);
    }
}
