package com.ido.demo.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "category")
public class Category implements Serializable{

    @Id
    @GeneratedValue
    private Long id;


    private String name;
    @Column(name="parent_id")
    private Category parent;

    private Float price;

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

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
