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

    @OneToOne(cascade = {CascadeType.ALL})
    private Product product;

    private Date saleTime;

    private Float actualPrice;

    @OneToOne(cascade = {CascadeType.ALL})
    private Buyer buyer;

}
