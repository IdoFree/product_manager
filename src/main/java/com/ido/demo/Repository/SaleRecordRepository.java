package com.ido.demo.Repository;

import com.ido.demo.model.Buyer;
import com.ido.demo.model.Product;
import com.ido.demo.model.SaleRecord;
import org.springframework.data.repository.CrudRepository;


public interface SaleRecordRepository extends CrudRepository<SaleRecord, Long> {
    Product findById(Long id);
}
