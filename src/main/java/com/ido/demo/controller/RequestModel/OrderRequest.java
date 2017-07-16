package com.ido.demo.controller.RequestModel;

import com.ido.demo.model.Buyer;

import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public class OrderRequest {
    private List<Long> productIds;
    private Buyer buyer;

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}
