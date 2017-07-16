package com.ido.demo.service.impl;

import com.ido.demo.Repository.SaleRecordProductMapRepository;
import com.ido.demo.model.SaleRecordProductMap;
import com.ido.demo.service.SaleRecordProductMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public class SaleRecordProductMapServiceImpl implements SaleRecordProductMapService {
    @Autowired
    private SaleRecordProductMapRepository repository;
    @Override
    public void save(List<SaleRecordProductMap> saleMaps) {
        repository.save(saleMaps);
    }
}
