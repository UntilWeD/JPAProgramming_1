package com.untilwed.studyingjpa.model.ch5_entity.pratice;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

//@Entity
@Table(name = "ORDER_ITEM")
@Data
@ToString
public class OrderItemP5 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private ItemP5 itemP5; //주문상품

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderP5 order; //주문

    private int orderPrice;
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemP5 getItemP5() {
        return itemP5;
    }

    public void setItemP5(ItemP5 itemP5) {
        this.itemP5 = itemP5;
    }

    public OrderP5 getOrder() {
        return order;
    }

    public void setOrder(OrderP5 order) {
        this.order = order;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
