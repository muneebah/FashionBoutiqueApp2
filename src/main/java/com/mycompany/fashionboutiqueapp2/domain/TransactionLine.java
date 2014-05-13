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
import javax.persistence.OneToMany;

/**
 *
 * @author muneebah
 */
@Entity
public class TransactionLine implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int transLine_qty;
    private int transLine_price;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "prod_id") 
    Product product;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "trans_id")
    Transaction transaction;
    
    public TransactionLine() {
    }
    
    private TransactionLine(Builder builder) {
        id= builder.id;
        transLine_qty = builder.transLine_qty;
        transLine_price=builder.transLine_price;
        product=builder.product;
        transaction=builder.transaction;
    }
    
    public static class Builder {
    
    private Long id;
    private int transLine_qty;
    private int transLine_price;
    private Product product;
    private Transaction transaction;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder transLine_qty(int transLine_qty) {
            this.transLine_qty = transLine_qty;
            return this;
        }

        public Builder transLine_price(int transLine_price) {
            this.transLine_price = transLine_price;
            return this;
        }
        
       public Builder product(Product product) {
            this.product = product;
            return this;
        }
        
        public Builder transaction(Transaction transaction) {
            this.transaction = transaction;
            return this;
        }

        public Builder transactionline(TransactionLine transactionline){
            id= transactionline.getId();
            transLine_qty = transactionline.getTransLine_qty();
            transLine_price=transactionline.getTransLine_price();
            product=transactionline.getProduct();
            transaction=transactionline.getTransaction();
            return this; 
        }
        
         public TransactionLine build(){
            return new TransactionLine(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTransLine_qty() {
        return transLine_qty;
    }

    public void setTransLine_qty(int transLine_qty) {
        this.transLine_qty = transLine_qty;
    }

    public int getTransLine_price() {
        return transLine_price;
    }

    public void setTransLine_price(int transLine_price) {
        this.transLine_price = transLine_price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
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
        if (!(object instanceof TransactionLine)) {
            return false;
        }
        TransactionLine other = (TransactionLine) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.TransactionLine[ id=" + id + " ]";
    }
    
}
