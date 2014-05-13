/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services.Impl;

import com.mycompany.fashionboutiqueapp2.domain.Product;
import com.mycompany.fashionboutiqueapp2.repository.ProductRepository;
import com.mycompany.fashionboutiqueapp2.services.FindProductService;
import java.util.List;


/**
 *
 * @author muneebah
 */
public class FindProductServiceImpl implements FindProductService{
   /* @Autowired*/
    private ProductRepository productRepository;
    private List<Product> product;
    @Override
    public List<Product> getProd_name(String prod_name) {
       List<Product> product = productRepository.findAll();
       
           if (product.equals(this.product)) {
                System.out.println("found" +product);
           }

    return product;
 }
}
