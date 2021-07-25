/*
 * Slide how in this Class
 *
 *  APART FROM THIS CLASS SAME AS A DESTINATION CLASS 
 */
package myproject;
import javax.swing.*;
import java.awt.*;

public class CheckHotels extends JFrame implements Runnable{//00
    Thread t1; //4
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10l;
    JLabel[] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10l};
    JLabel caption;//Postition
    public void run(){ //  start() method Rum menthod Ko calll kerta ha 
         String[] text = new String[]{"Taj Hotel","Cristino Hotel","Blue Zone Hotel","Radisson Hotel","Infinity Hotel","Sayaji Hotel","President Hotel","Lemon Tree Hotel","King Park Hotel","Crio Hotel"};//ccreate  array  for the name//Show Name in this Silder With Hotel   // 02
        //Few second Hold in Image then HIDE firts image and show second image //   01
        try{
            for(int i =0;i<=9;i++){
            this.label[i].setVisible(true); //all image are set in lable so, call label
            caption.setText(text[i]); //All Hotel Name yahaa Sa jayaa gaa
            this.label[i].add(caption);
            Thread.sleep(3800);
            this.label[i].setVisible(false);
        }
        }catch(Exception e){}
    }
    public CheckHotels(){
        setBounds(300,170,500,500);
        
        //
        ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null; //ImageIcon Obect's because All images Are in a own Object
        ImageIcon[]  image = new ImageIcon[]{i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};//Image Acces Through ImageIcon indexs //ImageIcon Array
        //
        Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null; //Images Obect's because All images Are in a own Object
        Image[] jimage = new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        //
        ImageIcon i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null,i18=null,i19=null,i20=null; //ImageIcon Obect's because All images Are in a own Object
        ImageIcon[]  iimage = new ImageIcon[]{i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};//Image Acces Through ImageIcon indexs //ImageIcon Array
        //
        caption = new JLabel();//Posion btaya gaa
        caption.setBounds(50,380,500 ,45);
        caption.setForeground(Color.WHITE);
        caption.setFont(new Font("Tahoma",Font.LAYOUT_RIGHT_TO_LEFT,30));
        add(caption);
        //Image 1.Putt image 2.Hold Image using MultyThreading sleep class
         for(int i = 0 ; i<=9;i++){   
            image[i] = new ImageIcon(ClassLoader.getSystemResource("icon/hotel"+(i+1)+".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
            iimage[i] = new ImageIcon(jimage[i]);
            this.label[i] = new JLabel(iimage[i]); /// Labels Are Featch In Multi Thread //Globally declaration 
            this.label[i].setBounds(0,0,500,500);
            add(this.label[i]);
         }
         t1 = new Thread(this); //2 //when we create explecitly thread class oject *** Current class ka refrence (this)
         t1.start(); //3
        
        //Image
    }
    
    //main
    public static void main(String args[]){
        new CheckHotels().setVisible(true);
    }
}
