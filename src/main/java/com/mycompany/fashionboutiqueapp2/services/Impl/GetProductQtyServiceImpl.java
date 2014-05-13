/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.fashionboutiqueapp2.services.Impl;

import com.mycompany.fashionboutiqueapp2.domain.Product;
import com.mycompany.fashionboutiqueapp2.repository.ProductRepository;
import com.mycompany.fashionboutiqueapp2.services.GetProductQtyService;
import java.util.List;


/**
 *
 * @author muneebah
 */
public class GetProductQtyServiceImpl implements GetProductQtyService{
    /*@Autowired*/
    private ProductRepository productRepository;
    private List<Product> product;

    @Override
    public List<Product> getQtyBelow(int prod_qty) {
        List<Product> allProducts = productRepository.findAll();

        for (Product product : allProducts) {
            if (prod_qty > product.getProd_qty()) {
                System.out.println("Warning! Not enough stock!");
            }
        }
        return product;
    }
}
