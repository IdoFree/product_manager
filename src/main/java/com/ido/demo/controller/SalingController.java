package com.ido.demo.controller;

import com.ido.demo.controller.OrderRequestModel.OrderRequest;
import com.ido.demo.controller.SaleRecordModel.Response;
import com.ido.demo.model.Product;
import com.ido.demo.model.SaleRecord;
import com.ido.demo.service.ProductService;
import com.ido.demo.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ido on 2017/7/12.
 */
@Controller
@RequestMapping("order")
public class SalingController {
    @Autowired
    private SaleRecordService saleRecordService;

    @Autowired
    private ProductService productService;

    @PostMapping("/sale")
    public ModelAndView sale(@RequestBody OrderRequest request ){
        saleRecordService.sale(request.getProductIds(),request.getBuyer());
        Map<String, Object> model = new HashMap<>();
        return new ModelAndView("order/ordering",model);
    }


    @GetMapping("/show")
    public ModelAndView show( Pageable pageable){
        Map<String, Object> model = new HashMap<>();
        List<Product> productList = new ArrayList<>(1);
        productList.add( productService.findById(1L));

        model.put("prods",productList);
        return new ModelAndView("order/ordering",model);
    }


    @GetMapping("/showAllToday")
    public ModelAndView showAllToday( Pageable pageable){
        Map<String, Object> model = new HashMap<>();
        List<Response> results = saleRecordService.findAllInToday(pageable);
        model.put("saleRerods",results);
        return new ModelAndView("statistics/sale_records",model);
    }





}
