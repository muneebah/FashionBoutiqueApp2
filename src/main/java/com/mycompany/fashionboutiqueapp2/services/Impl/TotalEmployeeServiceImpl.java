/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services.Impl;

import com.mycompany.fashionboutiqueapp2.domain.Employee;
import com.mycompany.fashionboutiqueapp2.repository.EmployeeRepository;
import com.mycompany.fashionboutiqueapp2.services.TotalEmployeeService;
import java.util.List;


/**
 *
 * @author muneebah
 */
public class TotalEmployeeServiceImpl implements TotalEmployeeService{
    /*@Autowired*/
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getTotalEmployee() {
        return employeeRepository.findAll();
    }
    
}
