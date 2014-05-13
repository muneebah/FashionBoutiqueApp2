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
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int sup_id;
    private String sup_name;
            
    public Supplier() {
    }    
    
     private Supplier(Builder builder) {
        id= builder.id;
        sup_id = builder.sup_id;
        sup_name=builder.sup_name;
       }
    
    public static class Builder {
    
    private Long id;
    private int sup_id;
    private String sup_name;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder sup_id(int sup_id) {
            this.sup_id = sup_id;
            return this;
        }

        public Builder sup_name(String sup_name) {
            this.sup_name = sup_name;
            return this;
        }

        public Builder supplier(Supplier supplier){
            id= supplier.getId();
            sup_id = supplier.getSup_id();
            sup_name=supplier.getSup_name();
            return this; 
        }
        
         public Supplier build(){
            return new Supplier(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSup_id() {
        return sup_id;
    }

    public void setSup_id(int sup_id) {
        this.sup_id = sup_id;
    }

    public String getSup_name() {
        return sup_name;
    }

    public void setSup_name(String sup_name) {
        this.sup_name = sup_name;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.Supplier[ id=" + id + " ]";
    }
    
}
