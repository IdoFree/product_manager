package com.ido.demo.Repository;

import com.ido.demo.model.Buyer;
import com.ido.demo.model.SaleRecordProductMap;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface SaleRecordProductMapRepository extends CrudRepository<SaleRecordProductMap, Long> {
    Buyer findById(Long id);
    @Query(value ="select b from Buyer b where b.name = :name")
    Buyer findByName(@Param("name") String name);
}
