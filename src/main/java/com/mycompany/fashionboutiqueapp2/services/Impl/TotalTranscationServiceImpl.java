/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services.Impl;

import com.mycompany.fashionboutiqueapp2.domain.Transaction;
import com.mycompany.fashionboutiqueapp2.repository.TransactionRepository;
import java.util.List;

/**
 *
 * @author muneebah
 */
public class TotalTranscationServiceImpl implements TotalTransactionService{
    /*@Autowired*/
    private TransactionRepository transactionrepository;
    private List<Transaction> transaction;
    
/*    @Override
    public List<Transaction> getTrans_id(int trans_id) {
        List<Transaction> trans = transactionrepository.findAll();
        
        for (Transaction transaction : trans) {
            if (transaction.getTrans_id()> 1) {
                System.out.println("Made more than one transaction!");
            }
        }
        return transaction;
    }*/
}