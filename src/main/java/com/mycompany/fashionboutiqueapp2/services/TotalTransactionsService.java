/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services;

import com.mycompany.fashionboutiqueapp2.domain.Transaction;
import java.util.List;

/**
 *
 * @author muneebah
 */
public interface TotalTransactionsService {
    public List<Transaction> getTrans_id(int i);
}
