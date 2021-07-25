/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.*;

/**
 *
 * @author RAHUL PC
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){                                //Driver Registration
       try{
           Class.forName("com.mysql.jdbc.Driver");                                                                              // This is retrive from the MySQL JDBC DRIVER Library store in Connection Object 
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms_db","root","");//Create Connection
           s = c.createStatement();//Create Statement                                                                               //execute SQL Query
       }catch(Exception e){
           
       }
    }

    String getSelectedItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
