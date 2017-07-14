package com.ido.demo.service;

import com.ido.demo.model.Buyer;
import com.ido.demo.model.SaleRecord;

import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
public interface SaleRecordService {

    public void sale(List<Long> productIds,Buyer buyer);
}
