/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.repository;

import com.mycompany.fashionboutiqueapp2.domain.Customer;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;

/**
 *
 * @author muneebah
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    public List<Customer> findAll();

    public void save(Customer customer);

    public void save(SingularAttribute<Customer, String> cust_name);
    
}
