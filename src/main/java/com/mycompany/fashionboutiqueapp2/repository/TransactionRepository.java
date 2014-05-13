/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.repository;

import com.mycompany.fashionboutiqueapp2.domain.Transaction;

/**
 *
 * @author muneebah
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

   /* public static List<Transaction> findAll();*/
    
}
