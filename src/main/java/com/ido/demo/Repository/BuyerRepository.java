package com.ido.demo.Repository;

import com.ido.demo.model.Buyer;
import com.ido.demo.model.Product;
import com.ido.demo.model.User;
import org.springframework.data.repository.CrudRepository;


public interface BuyerRepository extends CrudRepository<Buyer, Long> {
    Product findById(Long id);
}
