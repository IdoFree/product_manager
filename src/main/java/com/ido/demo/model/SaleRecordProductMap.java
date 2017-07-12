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

    @OneToOne
    private Product product;

    @ManyToOne
    private SaleRecord saleRecord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
