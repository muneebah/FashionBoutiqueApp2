/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author muneebah
 */
@Entity
public class SupplierProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int supProd_id;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sup_id")
    Supplier supplier;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_id")
    Product product;
    
    public SupplierProduct() {
    }
    
    private SupplierProduct(Builder builder) {
        id= builder.id;
        supProd_id = builder.supProd_id;
        supplier=builder.supplier;
        product=builder.product;
    }
    
    public static class Builder {
    
    private Long id;
    private int supProd_id;
    private Supplier supplier;
    private Product product;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder supProd_id(int supProd_id) {
            this.supProd_id = supProd_id;
            return this;
        }

        public Builder supplier(Supplier supplier) {
            this.supplier = supplier;
            return this;
        }
        
       public Builder product(Product product) {
            this.product = product;
            return this;
        }
      
        public Builder supplierproduct(SupplierProduct supplierproduct){
            id= supplierproduct.getId();
            supProd_id = supplierproduct.getSupProd_id();
            supplier=supplierproduct.getSupplier();
            product=supplierproduct.getProduct();
            return this; 
        }
        
         public SupplierProduct build(){
            return new SupplierProduct(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSupProd_id() {
        return supProd_id;
    }

    public void setSupProd_id(int supProd_id) {
        this.supProd_id = supProd_id;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        if (!(object instanceof SupplierProduct)) {
            return false;
        }
        SupplierProduct other = (SupplierProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.SupplierProduct[ id=" + id + " ]";
    }
    
}
