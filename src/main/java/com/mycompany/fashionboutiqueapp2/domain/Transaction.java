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
public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int trans_id;
    private String trans_date;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_id")
    Customer customer;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    Employee employee;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "transLine_id")
    TransactionLine transactionline;
    
    public Transaction() {
    }
     
    private Transaction(Builder builder) {
        id= builder.id;
        trans_id = builder.trans_id;
        trans_date=builder.trans_date;
        customer=builder.customer;
        employee=builder.employee;
        transactionline=builder.transactionline;
    }
    
    public static class Builder {
    
    private Long id;
    private int trans_id;
    private String trans_date;
    private Customer customer;
    private Employee employee;
    private TransactionLine transactionline;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder trans_id(int trans_id) {
            this.trans_id = trans_id;
            return this;
        }

        public Builder trans_date(String trans_date) {
            this.trans_date = trans_date;
            return this;
        }
        
       public Builder customer(Customer customer) {
            this.customer = customer;
            return this;
        }
        
        public Builder employee(Employee employee) {
            this.employee = employee;
            return this;
        }
        
        public Builder transactionline(TransactionLine transactionline) {
            this.transactionline = transactionline;
            return this;
        }

        public Builder transaction(Transaction transaction){
            id= transaction.getId();
            trans_id = transaction.getTrans_id();
            trans_date = transaction.getTrans_date();
            customer = transaction.getCustomer();
            employee = transaction.getEmployee();
            transactionline = transaction.getTransactionline();
            return this; 
        }
        
         public Transaction build(){
            return new Transaction(this);
        }
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTrans_id() {
        return trans_id;
    }

    public void setTrans_id(int trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_date() {
        return trans_date;
    }

    public void setTrans_date(String trans_date) {
        this.trans_date = trans_date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TransactionLine getTransactionline() {
        return transactionline;
    }

    public void setTransactionline(TransactionLine transactionline) {
        this.transactionline = transactionline;
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
        if (!(object instanceof Transaction)) {
            return false;
        }
        Transaction other = (Transaction) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.Transaction[ id=" + id + " ]";
    }
    
}
