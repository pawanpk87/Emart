/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Emart.pojo;

import java.util.Objects;

/**
 *
 * @author User
 */
public class ProductsPojo {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.p_ID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProductsPojo other = (ProductsPojo) obj;
        if (!Objects.equals(this.p_ID, other.p_ID)) {
            return false;
        }
        return true;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ProductsPojo() {
    }

    public ProductsPojo(String p_ID, String p_name, String p_companyname, Double p_price, Double our_price, int tax, int quantity,double total) {
        this.p_ID = p_ID;
        this.p_name = p_name;
        this.p_companyname = p_companyname;
        this.p_price = p_price;
        this.our_price = our_price;
        this.tax = tax;
        this.quantity = quantity;
        this.total=total;
    }

    public String getP_ID() {
        return p_ID;
    }

    public void setP_ID(String p_ID) {
        this.p_ID = p_ID;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_companyname() {
        return p_companyname;
    }

    public void setP_companyname(String p_companyname) {
        this.p_companyname = p_companyname;
    }

    public Double getP_price() {
        return p_price;
    }

    public void setP_price(Double p_price) {
        this.p_price = p_price;
    }

    public Double getOur_price() {
        return our_price;
    }

    public void setOur_price(Double our_price) {
        this.our_price = our_price;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    private  String p_ID;
    private  String p_name;
    private  String p_companyname;
    private  Double p_price;
    private  Double our_price;
    private  int tax;
    private  int quantity;  
    private double total=0;    
    
}
