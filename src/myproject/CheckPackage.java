
package myproject;

import javax.swing.*;
import java.awt.*;
/**
 *in this class we Are create tab's  using ***JTabbedPane Class*****
 * 
 */
public class CheckPackage extends JFrame{
    
    CheckPackage(){
        setBounds(300,180,580,400);
        //Package aRRAY sTRING START
        String[] package1 = new String[]{"GOLD PACKAGE","6 Day's and 7 Night's","Airport Assistance","Half Day City Tour","Daily Buffet","Welcome Drink on Arrival","Full Day 3 Island Cruise","English Speaking Guide","Book now","Summer Special","Rs 12,000/-","package1.jpg"};
        String[] package2 = new String[]{"SILVER PACKAGE","5 Day's and 6 Night's","Toll free & Entrace free ticke","Meet and greet at airport","Welcome Drink at Arrival","Night Safari","English Speaking Guide","Full Day 3 Island Cruise","Book now","Summer Special","Rs 10,000/-","package2.jpg"};
        String[] package3 = new String[]{"BRONZ PACKAGE","4 Day's and 5 Night's","Return Airfare","Free Clubing","Hoursing & other games","Stay in 5 start Hotel","BBQ Dinner","Full Day 3 Island Cruise","Book now","Winter Special","Rs 8,000/-","package3.jpg"};

        
        //Package aRRAY sTRING END
        
//        setLayout(null);
        JTabbedPane pane = new JTabbedPane(); //It is a GROUP of components
        JPanel p1 = createPackage(package1); //Function Calling CreatePackage Panel Create Kera gaaa        
        pane.addTab("Package 1",null,p1);  //tab_name,tab_formatting,tab_component eg.panel
       
       // JTabbedPane pane = new JTabbedPane(); //It is a GROUP of components
        JPanel p2 = createPackage(package2);
        pane.addTab("Package 2",null,p2); // new JPanel
        
        JPanel p3 = createPackage(package3);
        pane.addTab("Package 3",null,p3); 
        add(pane,BorderLayout.CENTER); //Border Layout 5 property use kerta ha East,west,north ,south ,center
    }

    CheckPackage(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //********In this Function All the pages**********
    public JPanel createPackage(String[] pack){
       JPanel p1 = new JPanel();
       p1.setLayout(null);
       p1.setBackground(Color.WHITE);
       
       JLabel l1 = new JLabel(pack[0]);
       l1.setBounds(50,8,150,20);
       l1.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l1);

       JLabel l2 = new JLabel(pack[1]);
       l2.setBounds(30,60,200,25);
       l2.setForeground(Color.red);
       l2.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l2);       
       
       JLabel l3 = new JLabel(pack[2]);
       l3.setBounds(30,85,200,25);
       l3.setForeground(Color.GREEN);
       l3.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l3);       
       
       JLabel l4 = new JLabel(pack[3]);
       l4.setBounds(30,115,200,25);
       l4.setForeground(Color.blue);
       l4.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l4); 

       JLabel l5 = new JLabel(pack[4]);
       l5.setBounds(30,140,200,25);
       l5.setForeground(Color.red);
       l5.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l5);       

       JLabel l6 = new JLabel(pack[5]);
       l6.setBounds(30,165,250,25);
       l6.setForeground(Color.green);
       l6.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l6);          
      
       JLabel l7 = new JLabel(pack[6]);
       l7.setBounds(30,190,250,25);
       l7.setForeground(Color.blue);
       l7.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l7);    
       
       JLabel l8 = new JLabel(pack[7]);
       l8.setBounds(30,220,250,25);
       l8.setForeground(Color.red);
       l8.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l8);          
       
       JLabel l9 = new JLabel(pack[8]);
       l9.setBounds(60,250,250,20);
       l9.setForeground(Color.green);
       l9.setFont(new Font("Tahoma",Font.PLAIN,25));
       p1.add(l9);          
       
       JLabel l10 = new JLabel(pack[9]);
       l10.setBounds(5,285,250,20);
       l10.setForeground(Color.blue);
       l10.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l10);          
       
       JLabel l11 = new JLabel(pack[10]);
       l11.setBounds(195,285,150,20);
       l11.setForeground(Color.blue);
       l11.setFont(new Font("Tahoma",Font.PLAIN,20));
       p1.add(l11);  
       
       //Image Start 
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/"+pack[11]));
       Image i2 = i1.getImage().getScaledInstance(250, 360, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l12 = new JLabel(i3);
       l12.setBounds(220,2,395,350);
       p1.add(l12);
//Image End
       return p1;
       
    }
    //*******************
    //Main method start
    public static void main(String args[]){
       new CheckPackage().setVisible(true);
    }
    //main end
}


//Describe 
// JLabel l1 = new JLabel("GOLD PACKAGE");
//       l1.setBounds(50,8,150,20);
//       l1.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l1);
//
//       JLabel l2 = new JLabel("6 Day's and 7 Night's");
//       l2.setBounds(30,60,200,25);
//       l2.setForeground(Color.red);
//       l2.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l2);       
//       
//       JLabel l3 = new JLabel("Airport Assistance");
//       l3.setBounds(30,85,200,25);
//       l3.setForeground(Color.GREEN);
//       l3.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l3);       
//       
//       JLabel l4 = new JLabel("Half Day City Tour");
//       l4.setBounds(30,115,200,25);
//       l4.setForeground(Color.blue);
//       l4.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l4); 
//
//       JLabel l5 = new JLabel("Daily Buffet");
//       l5.setBounds(30,140,200,25);
//       l5.setForeground(Color.red);
//       l5.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l5);       
//
//       JLabel l6 = new JLabel("Welcome Drink on Arrival");
//       l6.setBounds(30,165,250,25);
//       l6.setForeground(Color.green);
//       l6.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l6);          
//      
//       JLabel l7 = new JLabel("Full Day 3 Island Cruise");
//       l7.setBounds(30,190,250,25);
//       l7.setForeground(Color.blue);
//       l7.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l7);    
//       
//       JLabel l8 = new JLabel("English Speaking Guide");
//       l8.setBounds(30,220,250,25);
//       l8.setForeground(Color.red);
//       l8.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l8);          
//       
//       JLabel l9 = new JLabel("Book now");
//       l9.setBounds(60,250,250,20);
//       l9.setForeground(Color.green);
//       l9.setFont(new Font("Tahoma",Font.PLAIN,25));
//       p1.add(l9);          
//       
//       JLabel l10 = new JLabel("Summer Special");
//       l10.setBounds(5,285,250,20);
//       l10.setForeground(Color.blue);
//       l10.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l10);          
//       
//       JLabel l11 = new JLabel("Rs 12000/-");
//       l11.setBounds(195,285,150,20);
//       l11.setForeground(Color.blue);
//       l11.setFont(new Font("Tahoma",Font.PLAIN,20));
//       p1.add(l11);  
//Describe End