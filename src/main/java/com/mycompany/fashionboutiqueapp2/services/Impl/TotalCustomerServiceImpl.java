/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services.Impl;

import com.mycompany.fashionboutiqueapp2.domain.Customer;
import com.mycompany.fashionboutiqueapp2.repository.CustomerRepository;
import com.mycompany.fashionboutiqueapp2.services.TotalCustomerService;
import java.security.Provider.Service;
import java.util.List;

/**
 *
 * @author muneebah
 */
/*@Service*/
public class TotalCustomerServiceImpl implements TotalCustomerService{
    /*@Autowired*/
    private CustomerRepository customerRepository;

    /**
     *
     * @return
     */
    @Override
    public List<Customer> getTotalCustomer() {
        return customerRepository.findAll();
    }
    
}
