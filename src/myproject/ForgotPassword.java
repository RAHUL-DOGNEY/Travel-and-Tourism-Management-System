/**
 * @author RAHUL PC
 */
package myproject;
import java.awt.*;                                                              //Color 
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
            //ResultSet Sql pacakage me hoti ha
public class ForgotPassword extends JFrame implements ActionListener{
    JButton b1,b2,b3;                                                                                                                             //##ClickEvent 1
    JTextField t1,t2,t3,t4,t5;                                                      //Globally Dec lare Variables                                                                                                                  //Text Files Creating Object Globally
    Choice c1;
    ForgotPassword(){                                                           //Constructor Frame Code
        setBounds(200,200,800,400);                                             //Frame Length An wridth
        getContentPane().setBackground(new Color(31, 36, 42));                            //Change Color **White
        setLayout(null);
        
        
        ///Image Start
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(560,70,200,200);
        add(l6);
        ///Image End
        
        JPanel p = new JPanel();
        p.setBounds(30,30,500,300);
        p.setLayout(null);
        add(p);


        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD, 14));
        p.add(l1);

        t1 = new JTextField();
        t1.setBounds(200,20,150,25);
        p.add(t1);
        
        //Button 1 Search 
        b1 = new JButton("Search");
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.DARK_GRAY);
        b1.addActionListener(this);
        b1.setBounds(380,20,100,25);
        p.add(b1);
        
        
        //Name Label
        JLabel l2 = new JLabel("Name");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l2);

        //Text Fied 
        t2 = new JTextField();
        t2.setBounds(200,60,150,25);
        p.add(t2);

        //Password Label;
        

        

        JLabel l3 = new JLabel("Security Questions");
        l3.setBounds(40,100,150,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l3);
        
          //Text Fied 
        t3 = new JTextField();
        t3.setBounds(200,100,150,25);
        p.add(t3);

        JLabel l4 = new JLabel("Answer");
        l4.setBounds(40,140,150,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l4);
        
          //Text Fied 
        t4 = new JTextField();
        t4.setBounds(200,140,150,25);
        p.add(t4);
        
        
        //Button 1 Search 
        b2 = new JButton("Retrieve");
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.DARK_GRAY);
        b2.addActionListener(this);
        b2.setBounds(380,140,100,25);
        

        p.add(b2);
         
        //Password Label;
        
        JLabel l5 = new JLabel("Password");
        l5.setBounds(40,180,150,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l5);
        
        //Text Fied 
        t5 = new JTextField();
        t5.setBounds(200,180,150,25);
        p.add(t5);
        
        
        //Button 3 Search 
        b3 = new JButton("Back");
        b3.setBackground(Color.CYAN);
        b3.setForeground(Color.DARK_GRAY);
        b3.addActionListener(this);
        b3.setBounds(150,230,100,25);
        p.add(b3);
        
        
        
    }                   
    public void actionPerformed(ActionEvent ae){
        Conn c = new Conn();
        if(ae.getSource() == b1){
            
              
            try{
                 String sql = "select * from account where username = '"+t1.getText()+"'";
                 ResultSet rs = c.s.executeQuery(sql);//puri row ha // yaha return kerta ha set.return class ka//ute function data retrive //This Function is return the Atribute row
//           
                 while(rs.next()){                       //Columkn to column Jump kerna ka liya function()
                    t2.setText(rs.getString("name"));            //yha per search ka cliuc per name and sequriti question
                    t3.setText(rs.getString("security"));
                }
           }catch(Exception e){ }
//               
//              
           }else if(ae.getSource() == b2){
               
            try{
               String sql = "select * from account where username = '"+t1.getText()+"' AND answer = '"+t4.getText()+"'";
                ResultSet rs = c.s.executeQuery(sql);//puri row ha // yaha return kerta ha set.return class ka//ute function data retrive //This Function is return the Atribute row
           
                 while(rs.next()){                       //Columkn to column Jump kerna ka liya function()
                  //  t2.setText(rs.getString("name"));            //yha per search ka cliuc per name and sequriti question
                    t5.setText(rs.getString("password"));
                }
           }catch(Exception e){ }
            
        }else if(ae.getSource() == b3){
            this.setVisible(false);
            new NewSignin().setVisible(true);
        }
        
    }
    
    public static void main(String[] args){                                     //Main Function                
        new ForgotPassword().setVisible(true);                                  //Frame True 
    }
}
