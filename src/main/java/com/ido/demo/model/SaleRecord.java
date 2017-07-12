package com.ido.demo.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "sale_record")
public class SaleRecord implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(cascade = {CascadeType.ALL})
    private SaleRecordProductMap saleMap;

    private Date saleTime;

    private Float actualPrice;

    @OneToOne(cascade = {CascadeType.ALL})
    private Buyer buyer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SaleRecordProductMap getSaleMap() {
        return saleMap;
    }

    public void setSaleMap(SaleRecordProductMap saleMap) {
        this.saleMap = saleMap;
    }

    public Date getSaleTime() {
        return saleTime;
    }

    public void setSaleTime(Date saleTime) {
        this.saleTime = saleTime;
    }

    public Float getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Float actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
