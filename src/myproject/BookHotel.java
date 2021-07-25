package myproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//Esma Abstrace Method ha  ??Inter face me Ager koi Abstract method ha to usss Method ko appni Class me Ovv//**Override kra na pdaa ga
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.*; 
import java.awt.*;// Color Classs Hoti Ha esma
public class BookHotel extends JFrame implements ActionListener{
    JTextField t1,t2,t3; //username
    JLabel l11,l12,l13,l14,l15;
    Choice c1,c2,c3;
    JRadioButton r1,r2;
    JButton b1,b2,b3;
    
    BookHotel(String username){
//        setSize(500,700);
//        setLocation(400,200)
          setLayout(null);//BoarderLayout , FlowLayout,GridLayout,Gride//
          getContentPane().setBackground(Color.BLACK);
          setBounds(275,80,815,560);
 
          
           // Labels
        JLabel h = new JLabel("Book Your Hotel");
        h.setFont(new java.awt.Font("Tahoma", 1, 24));
        h.setBounds(125,15,350,35);
        h.setForeground(new Color(169, 224, 49));  
        add(h);
            
        JLabel l1 = new JLabel("User Name");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(42,65,200,38);
        l1.setForeground(new Color(169, 224, 49));  
        add(l1);
        
        l11 = new JLabel();
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        l11.setBounds(300,70,200,32);
        l11.setForeground(new Color(169, 224, 49));  
        add(l11);

       
//          ------------------ //
        JLabel l2 = new JLabel("Search Hotel");
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setForeground(new java.awt.Color(169, 224, 49));
        l2.setBounds(42,105,200,38);
        add(l2);
        
        
         
        c1  = new Choice();
//data Are Hard Coded//        c1.add("Taj Hotel");
//        c1.add("Saya ji");
//DATABASE Feacting Values of Hotel
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from hotel");
            while(rs.next()){
                c1.add(rs.getString("name"));
            }
        }catch(Exception e){ }
        c1.setBounds(300,110,200,32);
        c1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(c1);
     


        JLabel l3 = new JLabel("Total Person");
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setForeground(new java.awt.Color(169, 224, 49));
        l3.setBounds(42,150,200,38);
        add(l3);
//        
        t1 = new JTextField();
        t1.setBounds(300,150,200,32);
        t1.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(t1);
//        
        JLabel l4 = new JLabel("Number Of Day");
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setForeground(new java.awt.Color(169, 224, 49));
        l4.setBounds(42,190,200,38);
        add(l4);
        
        t2 = new JTextField();
        t2.setBounds(300,190,200,32);
        t2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(t2);
//        
        JLabel l5 = new JLabel("Ac/Non-Ac Room");
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setForeground(new java.awt.Color(169, 224, 49));
        l5.setBounds(42,230,200,38);
        add(l5);
        
        c2  = new Choice();
        c2.add("YES");
        c2.add("NO");
        c2.setBounds(300,230,200,32);
        c2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(c2);
                
//       
        JLabel l6 = new JLabel("Food Included");
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setForeground(new java.awt.Color(169, 224, 49));
        l6.setBounds(42,270,200,38);
        add(l6);
        
          
        c3  = new Choice();
        c3.add("YES");
        c3.add("NO");
        c3.setBounds(300,270,200,32);
        c3.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(c3);
//
        JLabel l7 = new JLabel("ID Proof");
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setForeground(new java.awt.Color(169, 224, 49));
        l7.setBounds(42,310,200,38);
        add(l7);
//        
        l12 = new JLabel();
        l12.setBounds(300,310,200,32);
        l12.setForeground(new Color(169, 224, 49));
        l12.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l12);        
//
        JLabel l8 = new JLabel("Number");
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setForeground(new java.awt.Color(169, 224, 49));
        l8.setBounds(42,355,200,38);
        add(l8);
//        
        l13 = new JLabel();
        l13.setForeground(new java.awt.Color(169, 224, 49));
        l13.setFont(new Font("Tahoma",Font.PLAIN,20));
        l13.setBounds(300,345,200,32);
        add(l13);            
//
        JLabel l9 = new JLabel("Phone No.");
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setForeground(new java.awt.Color(169, 224, 49));
        l9.setBounds(42,390,200,38);
        add(l9);
//        
        l14 = new JLabel();
        l14.setBounds(300,390,200,32);
        l14.setFont(new Font("Tahoma",Font.PLAIN,20));
        l14.setForeground(new java.awt.Color(169, 224, 49));
        add(l14);            
//    
        JLabel l10 = new JLabel("Total Price");
        l10.setFont(new Font("Tahoma",Font.PLAIN,20));
        l10.setForeground(new java.awt.Color(169, 224, 49));
        l10.setBounds(42,425,200,38);
        add(l10);
//        
        l15 = new JLabel();
        l15.setBounds(300,425,200,32);
        l15.setFont(new Font("Tahoma",Font.PLAIN,20));
        l15.setForeground(Color.RED);
        add(l15);   



              //Database
      try{
          Conn c = new Conn();
          ResultSet rs = c.s.executeQuery("select * from customer where username= '"+username+"'");
          while(rs.next()){
              l11.setText(rs.getString("username"));
              l12.setText(rs.getString("id"));
              l13.setText(rs.getString("number"));
              l14.setText(rs.getString("phone"));
              
             
          }
      }catch(Exception e){
          
      }
      //DataBase
 

        
          
        b1 = new JButton("Check Price");
        b1.setBackground(new Color(152,201,45));
        b1.setFont(new Font("Tahoma",Font.PLAIN,20));
        b1.setForeground(new Color(21,25,10));
        b1.setBounds(42,465,145,40);
        b1.addActionListener(this);
        add(b1);
//        
        b2 = new JButton("Book Package");
        b2.setBackground(new Color(152,201,45));
        b2.setFont(new Font("Tahoma",Font.PLAIN,20));   
        b2.setForeground(new Color(21,25,10));
        b2.setBounds(210,465,160,40);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Back");
        b3.setBackground(new Color(152,201,45));
        b3.setFont(new Font("Tahoma",Font.PLAIN,20));   
        b3.setForeground(new Color(21,25,10));
        b3.setBounds(395,465,120,40);
        b3.addActionListener(this);
        add(b3);
        
        JPanel imgaepanel = new JPanel();
          imgaepanel.setBackground(Color.RED);
          imgaepanel.setBounds(520,0,815,540);
          imgaepanel.setLayout(null);
          add(imgaepanel);
          
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookedDetails.jpg"));
          Image i2 = i1.getImage().getScaledInstance(280,540,  Image.SCALE_DEFAULT);
          ImageIcon i3 = new ImageIcon(i2);
          JLabel l22 = new JLabel(i3);
          l22.setBounds(0,0,280,540);
          imgaepanel.add(l22);
          setVisible(true);
//     
      }     public void actionPerformed(ActionEvent ae){ //override
        if(ae.getSource() == b1){
        //Data base ka through HANDEL KERNA HA BECAUSE INCREASE No. OF HOTEL                    //new BookHotel().setVisible(true);
            //get package like AC,Food,etc
            
                       try{
                Conn c = new Conn();
               ResultSet rs = c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");//Match Hogi Values using ResultSet
               while(rs.next()){
                   int cost = Integer.parseInt(rs.getString("cost_per_day"));  //In This Statement String Conver into integer usibng Wrapper Class
                   int food = Integer.parseInt(rs.getString("food_charges"));
                   int ac = Integer.parseInt(rs.getString("ac_charge"));
                   
                   int persons = Integer.parseInt(t1.getText());//Caculation with persion
                   int days = Integer.parseInt(t2.getText());
               
                   String acprice = c2.getSelectedItem();//ac Booked or Not
                   String foodprice = c3.getSelectedItem();
                   
                   //Checked Person's and 
                   if(persons * days > 0){
                       int total = 0;
                       total += acprice.equals("YES") ? ac : 0;
                       total += foodprice.equals("YES") ? food :0;
                       total += cost;
                       total = total* persons *days;
                       l15.setText(""+total); //String
                   }else{
                       l15.setText("Please Enter a Valid Number");
                   }
               }
            }catch(Exception e){}
        }else if(ae.getSource()==b2){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+l11.getText()+"','"+c3.getSelectedItem()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"')");
              
                JOptionPane.showMessageDialog(null, "Hotel booked successfully");   
                this.setVisible(false);
            }catch(Exception e){}
        }else if(ae.getSource() ==b3){ 
            this.setVisible(false);
        }  

    }
    
    
    public static void main(String args[]){
        new BookHotel("").setVisible(true);
    }
}
