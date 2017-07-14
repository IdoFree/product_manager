package com.ido.demo.model;

import com.ido.demo.model.enums.Unit;

import javax.persistence.*;

/**
 * Created by Ido on 2017/7/12.
 */
@Entity
@Table(name = "material")
public class Material {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String details;


    private Unit unit;

    private Float count;

    @Column(name="product_id")
    private  Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Float getCount() {
        return count;
    }

    public void setCount(Float count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
