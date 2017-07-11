package com.ido.demo.Repository;

import com.ido.demo.model.Category;
import com.ido.demo.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface CategoryRepository extends CrudRepository<Category, Long> {
    Product findById(Long id);
}
