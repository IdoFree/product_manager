package com.ido.demo.model;

import javax.persistence.*;

/**
 * Created by Ido on 2017/7/12.
 */

@Entity
@Table(name = "Sale_Record_Product_Map")
public class SaleRecordProductMap {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Product product;

    @ManyToOne(cascade=CascadeType.ALL)
    private SaleRecord saleRecord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public SaleRecord getSaleRecord() {
        return saleRecord;
    }

    public void setSaleRecord(SaleRecord saleRecord) {
        this.saleRecord = saleRecord;
    }
}
