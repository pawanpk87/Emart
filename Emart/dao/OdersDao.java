/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dao;

import Emart.dbutil.DBConnection;
import Emart.pojo.ProductsPojo;
import Emart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class OdersDao {
    public static String getNextOderId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(p_id) from orders");
        rs.next(); 
        String orderId=rs.getString(1);
        
        if(orderId==null)
            return "O-101";
        
        int next=Integer.parseInt(orderId.substring(2));
        next++;
        return "O-"+next;
    }
    public static boolean addOrders(ArrayList<ProductsPojo> prd,String ordId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into orders values(?,?,?,?)");
        int count=0;
        
        for(ProductsPojo p : prd)
        {
            ps.setString(1,ordId);
            ps.setString(2,p.getP_ID());
            ps.setInt(3,p.getQuantity());
            ps.setString(4,UserProfile.getUserid());
            count+=ps.executeUpdate();
        }
        return count==prd.size();
    }
}
