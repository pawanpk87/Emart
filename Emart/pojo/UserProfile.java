/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.pojo;

/**
 *
 * @author User
 */
public class UserProfile {

    

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }

    public static String getEmpid() {
        return empid;
    }

    public static void setEmpid(String empid) {
        UserProfile.empid = empid;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserProfile.password = password;
    }

    public static String getUsertype() {
        return usertype;
    }

    public static void setUsertype(String usertype) {
        UserProfile.usertype = usertype;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }
     
    /*
      We are making this class , cause whenever we want to know the current user we will get whithout creating
      any object of pojo class.
    */
    private static String userid;
    private static String empid;
    private static String password;
    private static String usertype;
    private static String username;    
    
    
}
