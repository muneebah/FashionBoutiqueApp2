/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author muneebah
 */
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int prod_id;
    private String prod_name;
    private String prod_description;
    private int prod_qty;
    
    public Product() {
    }
    
    private Product(Builder builder) {
        id= builder.id;
        prod_id = builder.prod_id;
        prod_name=builder.prod_name;
        prod_description=builder.prod_description;
        prod_qty=builder.prod_qty;
    }
    
    public static class Builder {
    
    private Long id;
    private int prod_id;
    private String prod_name;
    private String prod_description;
    private int prod_qty;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder prod_id(int prod_id) {
            this.prod_id = prod_id;
            return this;
        }

        public Builder prod_name(String prod_name) {
            this.prod_name = prod_name;
            return this;
        }
        
        public Builder prod_description(String prod_description) {
            this.prod_description = prod_description;
            return this;
        }
        
        public Builder prod_qty(int prod_qty) {
            this.prod_qty = prod_qty;
            return this;
        }

        public Builder product(Product product){
            id= product.getId();
            prod_id = product.getProd_id();
            prod_name=product.getProd_name();
            prod_description=product.getProd_description();
            prod_qty=product.getProd_qty();
            return this; 
        }
        
         public Product build(){
            return new Product(this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getProd_description() {
        return prod_description;
    }

    public void setProd_description(String prod_description) {
        this.prod_description = prod_description;
    }

    public int getProd_qty() {
        return prod_qty;
    }

    public void setProd_qty(int prod_qty) {
        this.prod_qty = prod_qty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.Product[ id=" + id + " ]";
    }
    
}
