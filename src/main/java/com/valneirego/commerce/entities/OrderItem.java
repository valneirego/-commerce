package com.valneirego.commerce.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Or;

import java.util.Objects;

@Entity
@Table(name = "tb_order_item")

@Getter
@Setter

public class OrderItem {

    @EmbeddedId
    private OrderIntemPK id = new OrderIntemPK();
    private  Integer quantity;
    private  Double price;

    public OrderItem(){

    }

    public OrderItem(Order order, Product product, Integer quantity, Double price) {

        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }


    public Order getOrder(){
        return  id.getOrder();
    }

    public  void  setOrder(Order order){
        id.setOrder(order);
    }


    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
