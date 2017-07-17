package com.ido.demo.service;

import com.ido.demo.controller.SaleRecordModel.Response;
import com.ido.demo.model.Buyer;
import com.ido.demo.model.SaleRecord;
import org.springframework.data.domain.Pageable;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface SaleRecordService {

    public void sale(List<Long> productIds,Buyer buyer);
    public List<SaleRecord> findAll(Pageable pageable );
    public List<SaleRecord> findBySaleTime(Date saleTime, Pageable pageable );
    public List<Response> findAllInToday(Pageable pageable );
}
