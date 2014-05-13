/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.repository;

import com.mycompany.fashionboutiqueapp2.domain.Employee;
import java.util.List;
/**
 *
 * @author muneebah
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{ 

    public List<Employee> findAll();
    
}
