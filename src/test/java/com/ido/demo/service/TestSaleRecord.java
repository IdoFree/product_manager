package com.ido.demo.service;

import com.ido.demo.controller.OrderRequestModel.OrderRequest;
import com.ido.demo.model.Buyer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSaleRecord {

    @Autowired
    private SaleRecordService saleRecordService;
    @Autowired
    private UserService userService;
    @Test
    public void testSale(){
        OrderRequest request = new OrderRequest();
        Buyer b= new Buyer();
        b.setName("ido");
        b.setSignUpTime(new Date());
        request.setBuyer(b);
        List<Long> id = new ArrayList<>(3);
        id.add(1L);
        id.add(2L);
        id.add(3L);
        request.setProductIds(id);
        saleRecordService.sale(request.getProductIds(),request.getBuyer());
    }

    @Test
    public void  testShowAllInToday(){
        PageRequest page = new PageRequest(0,10);
        saleRecordService.findAllInToday(page);
    }

}
