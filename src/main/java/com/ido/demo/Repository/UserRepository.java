package com.ido.demo.Repository;

import com.ido.demo.model.Category;
import com.ido.demo.model.Product;
import com.ido.demo.model.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
    Product findById(Long id);
}
