package com.ido.demo.service.impl;

import com.ido.demo.Repository.SaleRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class SaleRecordServiceImpl {
    @Autowired
    private SaleRecordRepository saleRecordRepository;
}
