/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dao;

import Emart.dbutil.DBConnection;
import Emart.pojo.ReceptionistPojo;
import Emart.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author User
 */
public class ReceptionistDao {
    
    public static Map<String,String> getNotRegisteredReceptionist() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        /*
           This query should be joint query cause we want empid which is not registered
           not those who have registered , we may  find some receptionist who will present both
           table user and employee.
        */
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select empid,empname from employees where job='Receptionist' and empid not in (select empid from users where usertype='Receptionist')");
        HashMap<String,String> receptionistList=new HashMap<>();        
        while(rs.next())
        {
            String empid=rs.getString(1);
            String empname=rs.getString(2);
            receptionistList.put(empid, empname);
        }
        return receptionistList;      
    }
    
    public static boolean addReceptionist(UserPojo emp) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1,emp.getUserid());
        ps.setString(2,emp.getEmpid());
        ps.setString(3,emp.getPassword());
        ps.setString(4,"Receptionist");
        ps.setString(5,emp.getUsername());
        int result=ps.executeUpdate();
        return result==1;          
    } 
    
    public static List<ReceptionistPojo> getAllReceptionistDetails()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        /*
           In SQL when we have column which is present in (Parent and child) two table than we have to mention with "."
           otherwise we will get error.
        */
        ResultSet rs=st.executeQuery("select users.empid,empname,userid,job,salary from users,employees where usertype='Receptionist' and users.empid=employees.empid");
        ArrayList<ReceptionistPojo> al=new ArrayList<>();        
        while(rs.next())
        {
           ReceptionistPojo r=new ReceptionistPojo();           
           r.setEmpId(rs.getString(1));
           r.setEname(rs.getString(2));
           r.setUserId(rs.getString(3));
           r.setJob(rs.getString(4));
           r.setSal(rs.getString(5)); 
           al.add(r);
        }
        return al;        
    } 
    
    
    public static Map<String,String> getallRecpId() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid,username from users where usertype='Receptionist' order by userid");
        HashMap<String,String> recepId=new HashMap<>();        
        while(rs.next())
        {
            recepId.put(rs.getString(1),rs.getString(2));
        }
        return recepId;      
    }
    
    public static boolean updatePassword(String userId,String pwd)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=?");
        ps.setString(1,pwd);
        ps.setString(2,userId);
        return ps.executeUpdate()==1;
    }
    
    public static List<String> getallReceptionistUserId() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid from users where usertype='Receptionist' order by userid");
        List<String> recepId=new ArrayList<>();        
        while(rs.next())
        {
            recepId.add(rs.getString(1));
        }
        return recepId;      
    }
    public static boolean deleteReceptionist(String userId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from users where userid=?");
        ps.setString(1,userId);
        return ps.executeUpdate()==1;
    }
    
}
