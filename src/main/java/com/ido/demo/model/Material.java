package com.ido.demo.model;

import com.ido.demo.model.enums.Unit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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

    private Category catogory;

    private Unit unit;

    private Long count;
}
