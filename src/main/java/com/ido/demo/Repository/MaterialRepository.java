package com.ido.demo.Repository;

import com.ido.demo.model.Material;
import com.ido.demo.model.Product;
import org.springframework.data.repository.CrudRepository;


public interface MaterialRepository extends CrudRepository<Material, Long> {
    Product findById(Long id);
}
