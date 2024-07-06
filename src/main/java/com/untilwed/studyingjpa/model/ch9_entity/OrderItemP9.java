package com.untilwed.studyingjpa.model.ch9_entity;

import com.untilwed.studyingjpa.model.ch8_entity.item.ItemP8;
import jakarta.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItemP9 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //**
    @JoinColumn(name = "ITEM_ID")
    private ItemP8 item;      //주문 상품

    @ManyToOne(fetch = FetchType.LAZY) //**
    @JoinColumn(name = "ORDER_ID")
    private OrderP9 order;    //주문

    private int orderPrice; //주문 가격
    private int count;      //주문 수량


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemP8 getItem() {
        return item;
    }

    public void setItem(ItemP8 item) {
        this.item = item;
    }

    public OrderP9 getOrder() {
        return order;
    }

    public void setOrder(OrderP9 order) {
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
