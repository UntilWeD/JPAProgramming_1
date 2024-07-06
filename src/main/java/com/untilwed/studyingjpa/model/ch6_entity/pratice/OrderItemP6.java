package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import jakarta.persistence.*;

@Entity
public class OrderItemP6 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private ItemP6 item;      //주문 상품

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderP6 order;    //주문

    private int orderPrice; //주문 가격
    private int count;      //주문 수량


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemP6 getItem() {
        return item;
    }

    public void setItem(ItemP6 item) {
        this.item = item;
    }

    public OrderP6 getOrder() {
        return order;
    }

    public void setOrder(OrderP6 order) {
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
