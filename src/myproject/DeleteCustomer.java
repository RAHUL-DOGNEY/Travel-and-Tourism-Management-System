package myproject;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
/**
 *
 * @author RAHUL PC
 */
public class DeleteCustomer extends JFrame implements ActionListener{
    JLabel l11,l22,l33,l44,l55,l66,l77,l88,l99;
    JButton b1,b2;
    String username;
    DeleteCustomer(String user){
        this.username = user; 
        setBounds(300,150,800,500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("<html><u>DELETE CUSTOMER DETAILS</u></html>");
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        heading.setBounds(270,4,260,40);
        add(heading);        
//Lable And Button
       
        JLabel l1 = new JLabel("Username :");
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        l1.setBounds(30,29,180,25);
        add(l1);
        
        l11 = new JLabel();
        l11.setBounds(180,25,300,25);
        l11.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l11);
        
        JLabel l2 = new JLabel("Name :");
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setBounds(30,70,180,25);
        add(l2);
        
        l22 = new JLabel();//JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Electicity Bill"}); //combobox get Array of String
        l22.setBounds(180,70,250,25);
        l22.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l22);

        JLabel l3 = new JLabel("Id :");
        l3.setFont(new Font("Tahoma",Font.PLAIN,20));
        l3.setBounds(30,110,180,25);
        add(l3);
        
        l33 = new JLabel();
        l33.setBounds(180,110,300,25);
        l33.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l33);
        
        JLabel l4 = new JLabel("Number :");
        l4.setFont(new Font("Tahoma",Font.PLAIN,20));
        l4.setBounds(30,150,180,25);
        add(l4);
        
        l44 = new JLabel();
        l44.setBounds(180,150,300,25);
        l44.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l44);
        

        JLabel l5 = new JLabel("Gender :");
        l5.setFont(new Font("Tahoma",Font.PLAIN,20));
        l5.setBounds(30,190,180,25);
        add(l5);
        l55 = new JLabel();
        l55.setFont(new Font("Tahoma",Font.PLAIN,20));
        l55.setBounds(180,190,100,25);
        add(l55);        
//Radio Button
//        r1 = new JRadioButton("Male");
//        r1.setBackground(Color.WHITE);
//        r1.setFont(new Font("Tahoma",Font.PLAIN,18));
//        r1.setBounds(180,190,100,25);
//        add(r1);

//        r2 = new JRadioButton("Female");
//        r2.setBackground(Color.WHITE);
//        r2.setFont(new Font("Tahoma",Font.PLAIN,18));
//        r2.setBounds(300,190,100,25);
//        add(r2);
        //Radio Button
       
        JLabel l6 = new JLabel("Country :");
        l6.setFont(new Font("Tahoma",Font.PLAIN,20));
        l6.setBounds(30,230,180,25);
        add(l6);
        
        l66 = new JLabel();
        l66.setFont(new Font("Tahoma",Font.PLAIN,20));
        l66.setBounds(180,230,300,25);
        add(l66);    


        JLabel l7 = new JLabel("Address :");
        l7.setFont(new Font("Tahoma",Font.PLAIN,20));
        l7.setBounds(30,270,180,25);
        add(l7);
        
        l77 = new JLabel();
        l77.setFont(new Font("Tahoma",Font.PLAIN,20));
        l77.setBounds(180,270,300,25);
        add(l77);
        

        JLabel l8 = new JLabel("Phone No. :");
        l8.setFont(new Font("Tahoma",Font.PLAIN,20));
        l8.setBounds(30,310,180,25);
        add(l8);
        
        l88 = new JLabel();
        l88.setFont(new Font("Tahoma",Font.PLAIN,20));
        l88.setBounds(180,310,300,25);
        add(l88);            
   

        JLabel l9 = new JLabel("Email :");
        l9.setFont(new Font("Tahoma",Font.PLAIN,20));
        l9.setBounds(30,350,180,25);
        add(l9);
        
        l99 = new JLabel();
        l99.setFont(new Font("Tahoma",Font.PLAIN,20));
        l99.setBounds(180,350,300,25);
        add(l99);            
     //button start
        b1 = new JButton("Delete");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(115,410,100,25);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(280,410,100,25);
        b2.addActionListener(this);
        add(b2);
       //Button End
       
       
               //Image Start
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(400,50,400,400);
        add(l10);

       
       //FETCH DATA FROM DATABASE  to LABEL
       try{
           Conn c = new Conn();
           ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                   while(rs.next()){
                       l11.setText(rs.getString("username"));
                       l22.setText(rs.getString("name"));
                       l33.setText(rs.getString("id"));
                       l44.setText(rs.getString("number"));
                       l55.setText(rs.getString("gender"));
                       l66.setText(rs.getString("country"));
                       l77.setText(rs.getString("address"));
                       l88.setText(rs.getString("phone"));
                       l99.setText(rs.getString("email"));
                   }
       }catch(Exception e){
           
       }
        
//        
//        setBounds(300,160,550,550);
//        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
//        

    }
    public void actionPerformed(ActionEvent ae){       
        if(ae.getSource()==b1){
            // Four Tables me sa data delete kerna HA*********** #1.account , #2.bookhotel,#3.bookpackage,#4.customer
            try{
                Conn c = new Conn();
                c.s.executeUpdate("delete from account where username = '"+username+"'"); // account Table data Delete
                c.s.executeUpdate("delete from bookhotel where username = '"+username+"'"); // bookhotel Table data Delete
                c.s.executeUpdate("delete from bookpackage where username = '"+username+"'"); //  bookpackage Table data Delete
                c.s.executeUpdate("delete from customer where username = '"+username+"'"); // customer Table data Delete
            
                JOptionPane.showMessageDialog(null,"Customer Details Deleted Successfully");
                System.exit(0);
            }catch(Exception e){
                
            }
        }else if(ae.getSource()==b2){
            this.setVisible(true);
        }
    }
    
    
    public static void main(String[] args){
        new DeleteCustomer("").setVisible(true);
    }
}
