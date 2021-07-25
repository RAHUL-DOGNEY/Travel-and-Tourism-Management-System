/*
 *
 *
 */
/**
 *
 * 
 */
package myproject;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class BookPackage extends JFrame implements ActionListener{
    Choice c1;
    JLabel l11,l12,l13,l14,l15;
    JTextField t1;
    JButton b1,b2,b3; 
  BookPackage(String username){

      setBounds(275,80,815,540);
      getContentPane().setBackground(Color.BLACK);
      setLayout(null);//BoarderLayout , FlowLayout,GridLayout,Gride//
               
//      //Image Start
//      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bookpackage.jpg"));
//      Image i2 = i1.getImage().getScaledInstance(330,540,Image.SCALE_DEFAULT);
//      ImageIcon i3 = new ImageIcon(i2);
//      JLabel l16 = new JLabel(i3);
//      l16.setBounds(520,0,280,540);
//      add(l16);
//      //Image End

       
      
      JLabel h = new JLabel("Book Your Package");
      h.setFont(new java.awt.Font("Tahoma", 1, 24));
      h.setBounds(125,15,350,35);
      h.setForeground(new Color(169, 224, 49));  
      add(h);
      
      
      JLabel l2 = new JLabel("Username");
      l2.setFont(new Font("Tahoma",Font.PLAIN,20));
      l2.setForeground(new Color(169, 224, 49));  
      l2.setBounds(42,65,200,38);
      add(l2);
      
      l11 = new JLabel();
      l11.setFont(new Font("Tahoma",Font.PLAIN,20));
      l11.setForeground(new java.awt.Color(169, 224, 49));
      l11.setBounds(300,70,200,32);
      add(l11);
      
      JLabel l3 = new JLabel("Select Package");
      l3.setFont(new Font("Tahoma",Font.PLAIN,20));
      l3.setForeground(new java.awt.Color(169, 224, 49));
      l3.setBounds(42,110,200,38);
      add(l3);
      
      c1 = new Choice();
      c1.add("Gold Package");
      c1.add("Silver Package");
      c1.add("Bronze Package");
      c1.setFont(new Font("Tahoma",Font.PLAIN,20));
      c1.setBounds(300,110,200,32);
      add(c1);

      JLabel l4 = new JLabel("Total Person");
      l4.setBounds(42,155,200,38);
      l4.setForeground(new java.awt.Color(169, 224, 49));
      l4.setFont(new Font("Tahoma",Font.PLAIN,20));
      add(l4);
      
       t1 = new JTextField();
       t1.setBounds(300,150,200,32);
       t1.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(t1);
      
      JLabel l5 = new JLabel("ID Proof");
      l5.setBounds(42,195,200,38);
      l5.setFont(new Font("Tahoma",Font.PLAIN,20));
      l5.setForeground(new java.awt.Color(169, 224, 49));
      add(l5);

      l12 = new JLabel();
      l12.setFont(new Font("Tahoma",Font.PLAIN,20));
      l12.setForeground(new java.awt.Color(169, 224, 49));
      l12.setBounds(300,190,200,32);
      add(l12);      

      JLabel l6 = new JLabel("Number");
      l6.setBounds(42,235,200,38);
      l6.setFont(new Font("Tahoma",Font.PLAIN,20));
      l6.setForeground(new java.awt.Color(169, 224, 49));
      add(l6);

        l13 = new JLabel();
        l13.setFont(new Font("Tahoma",Font.PLAIN,20));
        l13.setForeground(new java.awt.Color(169, 224, 49));
        l13.setBounds(300,230,200,32);
        add(l13);
     
      
      JLabel l7 = new JLabel("Phone");
      l7.setBounds(42,275,200,38);
      l7.setFont(new Font("Tahoma",Font.PLAIN,20));
      l7.setForeground(new java.awt.Color(169, 224, 49));
      add(l7);

      l14 = new JLabel();
      l14.setBounds(300,270,200,32);
      l14.setFont(new Font("Tahoma",Font.PLAIN,20));
      l14.setForeground(new java.awt.Color(169, 224, 49));
      add(l14);     
      
      JLabel l8 = new JLabel("Total Price :");
      l8.setBounds(42,315,200,38);
      l8.setFont(new Font("Tahoma",Font.PLAIN,20));
      l8.setForeground(new java.awt.Color(169, 224, 49));
      add(l8);

      l15 = new JLabel();
      l15.setBounds(300,315,200,32);
      l15.setFont(new Font("Tahoma",Font.PLAIN,20));
      l15.setForeground(Color.red);
      l15.setFont(new Font("Tahoma",Font.PLAIN,20));
      add(l15);
      
      //Database
      try{
          Conn c = new Conn();
          ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
          while(rs.next()){
                l11.setText(rs.getString("username"));
                l12.setText(rs.getString("id"));
                l13.setText(rs.getString("number"));
                l14.setText(rs.getString("phone"));
                
          }
      }catch(Exception e){}
      //DataBase
      
      
      //Button
      b1 = new JButton("Check Price");
      b1.setBackground(new Color(152,201,45));
      b1.setForeground(new Color(21,25,10));
      b1.setFont(new Font("Tahoma",Font.PLAIN,20)); 
      b1.addActionListener(this);
      b1.setBounds(42,385,200,38);
      add(b1);
       
      b2 = new JButton("Book Package");
      b2.setBackground(new Color(152,201,45));
      b2.setForeground(new Color(21,25,10));
      b2.setFont(new Font("Tahoma",Font.PLAIN,20)); 
      b2.addActionListener(this);
      b2.setBounds(300,385,200,38);
      add(b2);

      b3 = new JButton("Back");
      b3.setBackground(Color.GRAY);
      b3.setForeground(Color.WHITE);
      b3.addActionListener(this);
      b3.setBounds(200,435,128,40);
      add(b3);    
      
//Button


   JPanel imgaepanel = new JPanel();
          imgaepanel.setBackground(Color.RED);
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
      
  }
    //methodOverride
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            //selection 
            String p = c1.getSelectedItem();
            int cost = 0;
            if(p.equals("Gold Package")){
                cost += 12000;
            }else if(p.equals("Silver Package")){
                cost +=10000;
            }else if(p.equals("Bronze Package")){
                cost +=8000;
            }
             int persion = Integer.parseInt(t1.getText());//get How many persion  Toure //This is return String then TypeConversion    
             cost *= persion;
             l15.setText("Rs "+cost);
        }else if(ae.getSource() == b2){
            //datacbase
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookpackage values('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Book Succesfully");//Dialog Box
                this.setVisible(false);
            }catch(Exception e){
                
            }
        }else if(ae.getSource() == b3){
            this.setVisible(false);
        }
    }
    //method Overrideing
    //main()
    public static void  main(String args[]){
        new BookPackage("").setVisible(true);
    }
    //main()
}
