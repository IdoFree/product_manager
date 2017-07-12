package com.ido.demo.service;

import com.ido.demo.Repository.ProductRepository;
import com.ido.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface ProdoctService {


    public Product createNewProduct(Product p);
}
