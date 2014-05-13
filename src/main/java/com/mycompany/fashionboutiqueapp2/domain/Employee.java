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
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int emp_id;
    private String emp_name;
    private int emp_tel;
    private String emp_address;
    
    public Employee() {
    }
    
    private Employee(Builder builder) {
        id= builder.id;
        emp_id = builder.emp_id;
        emp_name=builder.emp_name;
        emp_tel = builder.emp_tel;
        emp_address = builder.emp_address;
       }
    
    public static class Builder {
    
    private Long id;
    private int emp_id;
    private String emp_name;
    private int emp_tel;
    private String emp_address;
    
        public Builder id(Long value) {
            id = value;
            return this;
        }
      
        public Builder emp_id(int emp_id) {
            this.emp_id = emp_id;
            return this;
        }

        public Builder emp_name(String emp_name) {
            this.emp_name = emp_name;
            return this;
        }

        public Builder emp_tel(int emp_tel) {
            this.emp_tel = emp_tel;
            return this;
        }

        public Builder emp_address(String emp_address) {
            this.emp_address = emp_address;
            return this;
        }

        public Builder employee(Employee employee){
            id= employee.getId();
            emp_id = employee.getEmp_id();
            emp_name=employee.getEmp_name();
            emp_tel = employee.getEmp_tel();
            emp_address = employee.getEmp_address();
            return this; 
        }
        
        public Employee build(){
            return new Employee(this);
        }

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_tel() {
        return emp_tel;
    }

    public void setEmp_tel(int emp_tel) {
        this.emp_tel = emp_tel;
    }

    public String getEmp_address() {
        return emp_address; 
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.muneebah.fashionboutique.domain.Employee[ id=" + id + " ]";
    }
    
}
