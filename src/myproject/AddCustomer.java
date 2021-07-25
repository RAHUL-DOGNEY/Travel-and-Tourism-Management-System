package myproject;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;//Esma Abstrace Method ha  ??Inter face me Ager koi Abstract method ha to usss Method ko appni Class me Ovv//**Override kra na pdaa ga
import java.sql.*;
import java.sql.ResultSet;

import javax.swing.*; 
import java.awt.*;// Color Classs Hoti Ha esma
public class AddCustomer extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9; //username
    JComboBox c1;
    JRadioButton r1,r2;
    JButton b1,b2;
    
    AddCustomer(String username){
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
        JLabel h = new JLabel("Add Customer Detail");
        h.setFont(new java.awt.Font("Tahoma", 1, 24));
        h.setBounds(125,15,350,35);
        h.setForeground(new Color(169, 224, 49));  
        p2.add(h);
            
        JLabel l1 = new JLabel("User Name");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(42,65,200,38);
        l1.setForeground(new Color(169, 224, 49));  
        p2.add(l1);
        
        t1 = new JTextField();  
        t1.setBounds(300,70,200,32);
        t1.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t1);
//          ------------------ //
        JLabel l2 = new JLabel("ID Proof");
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setForeground(new java.awt.Color(169, 224, 49));
        l2.setBounds(42,110,200,38);
        p2.add(l2);
        
         c1 = new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Electicity Bill"}); //combobox get Array of String
         c1.setBounds(300,110,200,32);
         c1.setFont(new Font("Tahoma",Font.PLAIN,20));
         p2.add(c1);
//        t2 = new JTextField();
//        t2.setBounds(300,110,200,32);
//        t2.setFont(new Font("Tahoma",Font.PLAIN,20));
//        p2.add(t2);
//        ---------------------  //

        JLabel l3 = new JLabel("Number");
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setForeground(new java.awt.Color(169, 224, 49));
        l3.setBounds(42,155,200,38);
        p2.add(l3);
//        
        t3 = new JTextField();
        t3.setBounds(300,150,200,32);
        t3.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t3);
//        
        JLabel l4 = new JLabel("Name");
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setForeground(new java.awt.Color(169, 224, 49));
        l4.setBounds(42,195,200,38);
        p2.add(l4);
        
        t4 = new JTextField();
        t4.setBounds(300,190,200,32);
        t4.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t4);
//        
        JLabel l5 = new JLabel("Gender");
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setForeground(new java.awt.Color(169, 224, 49));
        l5.setBounds(42,235,200,38);
        p2.add(l5);
        
        //Radio Button
        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(31,36,42));
        r1.setForeground(new java.awt.Color(169, 224, 49));
        r1.setFont(new Font("Tahoma",Font.PLAIN,20));
        r1.setBounds(300,230,95,32);
        p2.add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(31,36,42));
        r2.setFont(new Font("Tahoma",Font.PLAIN,20));
        r2.setForeground(new java.awt.Color(169, 224, 49));
        r2.setBounds(410,230,91,32);
        p2.add(r2);
        
//        t5.setBounds(300,230,200,32);
        
                     
//       
        JLabel l6 = new JLabel("Country");
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setForeground(new java.awt.Color(169, 224, 49));
        l6.setBounds(42,275,200,38);
        p2.add(l6);
        
        t6 = new JTextField();
        t6.setBounds(300,270,200,32);
        t6.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t6);    
//
        JLabel l7 = new JLabel("Address");
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setForeground(new java.awt.Color(169, 224, 49));
        l7.setBounds(42,315,200,38);
        p2.add(l7);
//        
        t7 = new JTextField();
        t7.setBounds(300,310,200,32);
        t7.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t7);        
//
        JLabel l8 = new JLabel("Phone No.");
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setForeground(new java.awt.Color(169, 224, 49));
        l8.setBounds(42,355,200,38);
        p2.add(l8);
//        
        t8 = new JTextField();
        t8.setFont(new Font("Tahoma",Font.PLAIN,20));
        t8.setBounds(300,350,200,32);
        p2.add(t8);            
//
        JLabel l9 = new JLabel("Email");
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setForeground(new java.awt.Color(169, 224, 49));
        l9.setBounds(42,395,200,38);
        p2.add(l9);
//        
        t9 = new JTextField();
        t9.setBounds(300,390,200,32);
        t9.setFont(new Font("Tahoma",Font.PLAIN,20));
        p2.add(t9);            
//    
        b1 = new JButton("Add");
        b1.setBackground(new Color(152,201,45));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setForeground(new Color(21,25,10));
        b1.setBounds(130,435,128,40);
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("Back");
        b2.setBackground(new Color(152,201,45));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));   
        b2.setForeground(new Color(21,25,10));
        b2.setBounds(350,435,128,40);
        b2.addActionListener(this);
        p2.add(b2);
        
//          
//          

         
          JPanel imgaepanel = new JPanel();
          imgaepanel.setBackground(Color.WHITE);
          imgaepanel.setBounds(520,0,815,540);
          imgaepanel.setLayout(null);
          add(imgaepanel);
          
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
          Image i2 = i1.getImage().getScaledInstance(280,540,  Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l10 = new JLabel(i3);
          l10.setBounds(0,0,280,540);
          imgaepanel.add(l10);
         // setVisible(true);
            
         try{ //Exequit Query
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where username= '"+username+"'");
            //jum column to column
            while(rs.next()){
                t1.setText(rs.getString("username"));
                t4.setText(rs.getString("name"));

            }
        }catch(Exception e){
            
        }
        
        //database query end
        //Main frame end
    }

    AddCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){   //button Check
 
            String username = t1.getText();
            String id = (String) c1.getSelectedItem();//typecasting
            String number = t3.getText();
            String name = t4.getText();
            //Radio start 
            String radio = null;
            if(r1.isSelected()){
                radio = "Male";
            }else if(r2.isSelected()){
                 radio = "Female";
            }
            //Radio end 
            String country = t6.getText();
            String address = t7.getText();
            String phone = t8.getText();
            String email = t9.getText();

 //           Query start
             String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+radio+"','"+country+"','"+address+"','"+phone+"','"+email+"')";
 //           Query End
             try{
                 Conn c = new Conn();
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Customer Detail Added Successfully");
             }catch(Exception e){
                 e.printStackTrace();
           }
        }
             else if(ae.getSource()==b2){
                  this.setVisible(false);
                  }
            
       }
    public static void main(String args[]){
        new AddCustomer("").setVisible(true);
    }
}

//String comb = jComboBox1.getSelectedItem()

