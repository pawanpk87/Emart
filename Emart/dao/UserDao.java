/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dao;

import Emart.dbutil.DBConnection;
import Emart.pojo.UserPojo;
import Emart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class UserDao {
    
    public static boolean validateUser(UserPojo user) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from users where userid=? and password=? and usertype=?");
        
        ps.setString(1,user.getUserid());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getUsertype());
        
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            UserProfile.setUsername(rs.getString(5));
            return true;
        }
        return false;        
    }
    
    public static boolean isUserPresent(String empId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select 1 from users where empid=?");
        ps.setString(1,empId);        
        
        ResultSet rs=ps.executeQuery();
        System.out.println(empId+rs);
        return rs.next();
    }   
    
}
