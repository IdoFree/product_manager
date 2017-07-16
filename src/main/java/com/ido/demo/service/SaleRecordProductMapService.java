package com.ido.demo.service;

import com.ido.demo.model.SaleRecordProductMap;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
@Service
public interface  SaleRecordProductMapService {
    void save(List<SaleRecordProductMap> saleMaps);
}
