package com.ido.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "sale_record")
public class SaleRecord implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private Product product;

    private Date saleTime;

    private Float actualPrice;

    private Buyer buyer;

}
