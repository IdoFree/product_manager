package com.ido.demo.controller;

import com.ido.demo.controller.RequestModel.OrderRequest;
import com.ido.demo.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Ido on 2017/7/12.
 */
@Controller
@RequestMapping("order")
public class SalingController {
    @Autowired
    private SaleRecordService saleRecordService;

    @PostMapping("/sale")
    public String sale(@RequestBody OrderRequest request ){
        saleRecordService.sale(request.getProductIds(),request.getBuyer());
        return "order/ordering";
    }




}
