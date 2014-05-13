/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services;

import com.mycompany.fashionboutiqueapp2.domain.Product;
import java.util.List;

/**
 *
 * @author muneebah
 */
public interface FindProductService {
    public List<Product> getProd_name(String x);
    
}
