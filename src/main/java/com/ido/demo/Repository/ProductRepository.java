package com.ido.demo.Repository;

import com.ido.demo.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Long> {
    Product findById(Long id);
}
