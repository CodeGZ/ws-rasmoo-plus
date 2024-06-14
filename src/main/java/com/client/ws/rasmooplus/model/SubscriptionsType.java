package com.client.ws.rasmooplus.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "subscriptions_type")
public class SubscriptionsType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subscriptions_type_id")
    private Long id;
    private String name;
    @Column(name = "access_months")
    private Long accessMonths;
    private BigDecimal price;
    @Column(name = "product_key")
    private String productkey;

    public SubscriptionsType(){

    }

    public SubscriptionsType(Long id, String name, Long accessMonths, BigDecimal price, String productkey) {
        this.id = id;
        this.name = name;
        this.accessMonths = accessMonths;
        this.price = price;
        this.productkey = productkey;
    }

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

    public Long getAccessMonths() {
        return accessMonths;
    }

    public void setAccessMonths(Long accessMonths) {
        this.accessMonths = accessMonths;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductkey() {
        return productkey;
    }

    public void setProductkey(String productkey) {
        this.productkey = productkey;
    }
}
