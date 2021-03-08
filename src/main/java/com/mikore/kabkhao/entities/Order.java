package com.mikore.kabkhao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String cover;
    private Double price;
    private Boolean inStock;
    private Integer qty;

    protected Order() {}

    public Order(String name, String cover, Double price, Boolean inStock, Integer qty) {
        this.name = name;
        this.cover = cover;
        this.price = price;
        this.inStock = inStock;
        this.qty = qty;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCover() {
        return this.cover;
    }

    public Double getPrice() {
        return this.price;
    }

    public Boolean getInStock() {
        return this.inStock;
    }

    public Integer getQty() {
        return this.qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
}
