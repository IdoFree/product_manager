package com.ido.demo.service.impl;

import com.ido.demo.Repository.ProductRepository;
import com.ido.demo.model.Product;
import com.ido.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findById(List<Long> ids) {
        List<Product> result = new ArrayList<>(ids.size());
        for(Long id : ids){
            result.add(productRepository.findById(id));
        }
        return result;
    }

    @Override
    public Product createNewProduct(Product p) {
        return productRepository.save(p);
    }
}
