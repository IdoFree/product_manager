package com.ido.demo.service.impl;

import com.ido.demo.Repository.ProductRepository;
import com.ido.demo.model.Product;
import com.ido.demo.service.ProdoctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class ProductServiceImpl implements ProdoctService{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product createNewProduct(Product p) {
        return productRepository.save(p);
    }
}
