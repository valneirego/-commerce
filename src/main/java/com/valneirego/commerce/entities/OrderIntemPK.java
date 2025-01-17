package com.valneirego.commerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Embeddable
public class OrderIntemPK {

    @ManyToOne
    @JoinColumn(name = "order_id")
    private  Order order;


    @ManyToOne
    @JoinColumn(name =  "product_id")
    private Product product;

    public OrderIntemPK(){

    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public Product getProduct() {
        return product;
    }
}
