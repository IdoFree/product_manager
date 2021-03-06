package com.ido.demo.service.impl;

import com.ido.demo.Repository.SaleRecordRepository;
import com.ido.demo.controller.SaleRecordModel.Response;
import com.ido.demo.model.Buyer;
import com.ido.demo.model.Product;
import com.ido.demo.model.SaleRecord;
import com.ido.demo.model.SaleRecordProductMap;
import com.ido.demo.service.ProductService;
import com.ido.demo.service.SaleRecordProductMapService;
import com.ido.demo.service.SaleRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/7/11.
 */
@Service
public class SaleRecordServiceImpl implements SaleRecordService{
    @Autowired
    private SaleRecordRepository saleRecordRepository;

    @Autowired
    private ProductService productsService;

    @Autowired
    private SaleRecordProductMapService saleMapService;



    @Override
    public void sale(List<Long> productIds,Buyer buyer) {
        //get all products out , and then create a sale record;
        List<Product> products = productsService.findById(productIds);
        List<SaleRecordProductMap> saleMaps = new ArrayList<>(products.size());

        Date now = new Date();
        SaleRecord saleRecord = new SaleRecord() ;
        saleRecord.setSaleTime(new Date());

        saleRecord.setBuyer(buyer);

        Float sum = 0f;
//        sum = products.stream().mapto(p->p.getDiscount()*p.getPrice()).sum();
       for(Product p: products){
           sum += p.getPrice()*p.getDiscount();
       }
       //TODO need to add a discount to the SaleRecordProductMap for show the actual discount in that day
        saleRecord.setActualPrice(sum);
        //prepare the sale map data

        for(int i = 0; i < productIds.size() ; i++){
            SaleRecordProductMap srpm = new SaleRecordProductMap();
            srpm.setSaleRecord(saleRecord);
            srpm.setProduct(products.get(i));
            saleMaps.add(srpm);
        }


        saleMapService.save(saleMaps);

    }

    @Override
    public List<SaleRecord> findAll(Pageable pageable) {
        saleRecordRepository.findAll(pageable);
        return null;
    }

    @Override
    public List<SaleRecord> findBySaleTime(Date saleTime, Pageable pageable) {
        return saleRecordRepository.findBySaleTime(saleTime,pageable);
    }

    @Override
    public List<Response> findAllInToday(Pageable pageable) {
        List<Object[]> results = saleRecordRepository.findAllInToday(new Date());
        if(results == null ||results.size() == 0) return null;

        List<Response> responseList = new ArrayList<>(results.size());
        for(Object r[] : results){
            Response rsp = new Response();
            rsp.setProdName((String) r[0]);
            rsp.setPrice((Float) r[1]);
            responseList.add(rsp);
        }
        return responseList;
    }
}
