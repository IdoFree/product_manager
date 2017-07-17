package com.ido.demo.Repository;

import com.ido.demo.model.Product;
import com.ido.demo.model.SaleRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface SaleRecordRepository extends PagingAndSortingRepository<SaleRecord, Long> {
    Product findById(Long id);
    Page<SaleRecord> findAll(Pageable pageable);
    public List<SaleRecord> findBySaleTime(Date saleTime, Pageable pageable);

    @Query(value = "select p.name , sr.actual_Price from Sale_Record_Product_Map m  join Sale_Record sr  on m.sale_record_id = sr.id join Product p on p.id = m.product_id where sr.sale_Time = DATE(:saleTime)",nativeQuery = true)
    public List<Object[]> findAllInToday(@Param("saleTime") Date time);

}
