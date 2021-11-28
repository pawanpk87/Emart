/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dao;

import Emart.dbutil.DBConnection;
import Emart.pojo.EmployeePojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class EmployeeDao {
    
    public static String getNextEmpId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(empid) from employees");
        rs.next();
        int nextEmpid=Integer.parseInt(rs.getString(1).substring(1));
        ++nextEmpid;
        return "E"+nextEmpid;
    }
    
    public static boolean addEmployee(EmployeePojo emp)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into employees values(?,?,?,?)");
        
        ps.setString(1,emp.getEmpID());
        ps.setString(2,emp.getEmpName());
        ps.setString(3,emp.getJob());
        ps.setDouble(4,emp.getSal());
        
        return ps.executeUpdate()==1;
    }
    
    public static  ArrayList<String> getallEmpId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select empid from employees order by empid");
        ArrayList<String> allId=new ArrayList<>();
        while(rs.next())
        {
           allId.add(rs.getString(1));
        }
        return allId;       
    }
    
    public static  List<EmployeePojo> getAllEmployees()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from employees order by empid");
        
        List<EmployeePojo> allEmp=new ArrayList<>();
        
        while(rs.next())
        {
           EmployeePojo e=new EmployeePojo();
           e.setEmpID(rs.getString(1));
           e.setEmpName(rs.getString(2));
           e.setJob(rs.getString(3));
           e.setSal(rs.getDouble(4));
           allEmp.add(e);
        }     
        return allEmp;
    }
    
    public static EmployeePojo findEmpById(String empId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from employees where empid=?");        
        ps.setString(1,empId);
        ResultSet rs=ps.executeQuery();
        rs.next();
        EmployeePojo e=new EmployeePojo();
        e.setEmpID(rs.getString(1));
        e.setEmpName(rs.getString(2));
        e.setJob(rs.getString(3));
        e.setSal(rs.getDouble(4));
        return e;
    }
    public static boolean updateEmployee(EmployeePojo e)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update employees set empname=?,job=?,salary=? where empid=?");
        ps.setString(1,e.getEmpName());
        ps.setString(2,e.getJob());
        ps.setDouble(3,e.getSal());
        ps.setString(4,e.getEmpID());      

        int empTable=ps.executeUpdate();
        
        if(empTable == 0)
        {
            return false;
        }
        else
        {
            boolean isPresent=UserDao.isUserPresent(e.getEmpID());
            if(!isPresent)
                return true;
            
            ps=conn.prepareStatement("update users set username=?,usertype=? where empid=?");
            ps.setString(1,e.getEmpName());
            ps.setString(2,e.getJob());
            ps.setString(3,e.getEmpID());
            int userTable=ps.executeUpdate();
            return userTable==1;
        }
    }   
    public static boolean deleteEmployee(String empId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("delete from employees where empid=?");
        ps.setString(1,empId);
        return ps.executeUpdate()==1;
    }         
}
