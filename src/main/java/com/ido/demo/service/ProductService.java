package com.ido.demo.service;

import com.ido.demo.model.Product;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface ProductService {

    public Product findById(Long id);
    public List<Product> findById(List<Long> id);
    public Product createNewProduct(Product p);
}
