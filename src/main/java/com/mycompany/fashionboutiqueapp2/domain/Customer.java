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
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int cust_id;
    private String cust_name;
    private int cust_tel;
    private String cust_address;
    private String cust_email;

    public Customer() {
    }
    
    private Customer(Builder builder) {
        id= builder.id;
        cust_id = builder.cust_id;
        cust_name=builder.cust_name;
        cust_tel = builder.cust_tel;
        cust_address = builder.cust_address;
        cust_email = builder.cust_email;
       }
    
    public static class Builder {
    
    private Long id;
    private int cust_id;
    private String cust_name;
    private int cust_tel;
    private String cust_address;
    private String cust_email;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder cust_id(int cust_id) {
            this.cust_id = cust_id;
            return this;
        }

        public Builder cust_name(String cust_name) {
            this.cust_name = cust_name;
            return this;
        }

        public Builder cust_tel(int cust_tel) {
            this.cust_tel = cust_tel;
            return this;
        }

        public Builder cust_address(String cust_address) {
            this.cust_address = cust_address;
            return this;
        }

        public Builder cust_email(String cust_email) {
            this.cust_email = cust_email;
            return this;
        }

        public Builder customer(Customer customer){
            id= customer.getId();
            cust_id = customer.getCust_id();
            cust_name=customer.getCust_name();
            cust_tel = customer.getCust_tel();
            cust_address = customer.getCust_address();
            cust_email = customer.getCust_email();
            return this; 
        }
        
        public Customer build(){
            return new Customer(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public int getCust_tel() {
        return cust_tel;
    }

    public void setCust_tel(int cust_tel) {
        this.cust_tel = cust_tel;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebahsfashion.domain.Customer[ id=" + id + " ]";
    }
    
}
