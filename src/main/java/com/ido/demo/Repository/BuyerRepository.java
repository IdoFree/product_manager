package com.ido.demo.Repository;

import com.ido.demo.model.Buyer;
import com.ido.demo.model.Product;
import com.ido.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface BuyerRepository extends CrudRepository<Buyer, Long> {
    Buyer findById(Long id);

    @Query(value ="select b from Buyer b where b.name = :name")
    Buyer findByName(@Param("name") String name);
}
