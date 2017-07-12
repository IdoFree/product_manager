package com.ido.demo.controller;

import com.ido.demo.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Ido on 2017/7/12.
 */
@Controller
@RequestMapping("sale")
public class SalingController {
    @Autowired
    private SaleRecordService saleRecordService;

    @PostMapping()
    public String sale(List<Long> productIds){
        saleRecordService.sale(productIds);
        return null;
    }

}
