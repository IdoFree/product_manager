package com.ido.demo.service.impl;

import com.ido.demo.Repository.SaleRecordRepository;
import com.ido.demo.model.SaleRecord;
import com.ido.demo.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class SaleRecordServiceImpl implements SaleRecordService{
    @Autowired
    private SaleRecordRepository saleRecordRepository;


    @Override
    public void sale(List<Long> productIds) {

    }
}
