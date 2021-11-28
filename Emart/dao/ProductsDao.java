/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.dao;

import Emart.dbutil.DBConnection;
import Emart.pojo.EmployeePojo;
import Emart.pojo.ProductsPojo;
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
public class ProductsDao {
    
    
    public static String getNextProductId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(p_id) from products");
        rs.next();
        String productId=rs.getString(1);
        if(productId==null)
            return "P101";
        int next=Integer.parseInt(productId.substring(1));
        next++;
        return "P"+next;
    }
    
    
    public static boolean addItem(ProductsPojo p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Insert into products values(?,?,?,?,?,?,?,'Y')");
        
        ps.setString(1,p.getP_ID());
        ps.setString(2,p.getP_name());
        ps.setString(3,p.getP_companyname());
        ps.setDouble(4,p.getP_price());
        ps.setDouble(5,p.getOur_price());
        ps.setInt(6,p.getTax());
        ps.setInt(7,p.getQuantity());
        
    
        
        return ps.executeUpdate()==1;        
    }
    
    public static List<ProductsPojo> getProductDetails() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select * from products where status='Y' order by p_id");
        ArrayList<ProductsPojo> allProducts=new ArrayList<>();
        
        while(rs.next())
        {
            ProductsPojo p=new ProductsPojo();
            p.setP_ID(rs.getString(1));
            p.setP_name(rs.getString(2));
            p.setP_companyname(rs.getString(3));
            p.setP_price(rs.getDouble(4));
            p.setOur_price(rs.getDouble(5));
            p.setTax(rs.getInt(6));
            p.setQuantity(rs.getInt(7));
            allProducts.add(p);            
        }
        return allProducts; 
    }
    
    
    public static boolean deleteProducts(String p_Id)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update products set status='N' where p_id=?");
        ps.setString(1,p_Id);
        return ps.executeUpdate()==1;
    }
    
    
    public static boolean updateProducts(ProductsPojo p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update products set p_name=?,p_companyname=?,p_price=?,our_price=?,p_tax=?,quantity=? where p_id=?");
        
        
        ps.setString(1,p.getP_name());
        ps.setString(2,p.getP_companyname());
        ps.setDouble(3,p.getP_price());
        ps.setDouble(4,p.getOur_price());
        ps.setInt(5,p.getTax());
        ps.setInt(6,p.getQuantity());
        ps.setString(7,p.getP_ID());
        return ps.executeUpdate()==1;
    }  
    
    public static ProductsPojo getProductDetails(String pId) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        
        PreparedStatement ps=conn.prepareStatement("select * from products where p_id=? and status='Y'");
        ps.setString(1,pId);         
        ResultSet rs=ps.executeQuery();
        
        ProductsPojo p=null;
        
        if(rs.next())
        {
            p=new ProductsPojo();
            p.setP_ID(rs.getString(1));
            p.setP_name(rs.getString(2));
            p.setP_companyname(rs.getString(3));
            p.setP_price(rs.getDouble(4));
            p.setOur_price(rs.getDouble(5));
            p.setTax(rs.getInt(6));
            p.setQuantity(rs.getInt(7));
        }        
        return p;
    }
    
    
    public static boolean updateStocks(List<ProductsPojo> plist)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update products set quantity=quantity-? where p_id=? and status='Y'");
        
        int rowsUpdate=0;        
        for(ProductsPojo p : plist)
        {
          ps.setInt(1,p.getQuantity());
          ps.setString(2,p.getP_ID());
          rowsUpdate+=ps.executeUpdate();
          
        }
        return rowsUpdate == plist.size();
    }        
}
