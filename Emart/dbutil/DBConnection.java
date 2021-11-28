/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DBConnection {
    
    private static Connection conn;
    static{
        
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-FV1PGQE:1521/xe","Emart","Emart");
        }
        catch(ClassNotFoundException cnf)
        {
            JOptionPane.showMessageDialog(null,"Error in loding the driver","Driver Error",JOptionPane.ERROR_MESSAGE);            
            cnf.printStackTrace();
            System.exit(1);
        }
        catch(SQLException se)
        {
           JOptionPane.showMessageDialog(null,"Error in connecting to DB","SQL Error",JOptionPane.ERROR_MESSAGE);            
           System.exit(1);  
        }       
        
    }
    
    public static Connection getConnection()
    {
        return conn;
    }  
    
    public static void colseConnection()
    {
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Connection closed successfully","Connection closed",JOptionPane.INFORMATION_MESSAGE);            
            System.exit(1);
        }
        catch(SQLException se)
        {
            JOptionPane.showMessageDialog(null,"Error in Coloseing the connection","SQL Error",JOptionPane.ERROR_MESSAGE);            
            System.exit(1);
        }
    } 
    
}
