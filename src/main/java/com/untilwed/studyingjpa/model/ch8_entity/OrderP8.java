package com.untilwed.studyingjpa.model.ch8_entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OrderP8 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //**
    @JoinColumn(name = "MEMBER_ID")
    private MemberP8 member;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private DeliveryP8 delivery;  // 배송정보

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)    //**
    private List<OrderItemP8> orderItems = new ArrayList<OrderItemP8>();

    private Date orderDate; //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatusP8 status;

    public void setMember(MemberP8 member) {
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItemP8 orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDelivery(DeliveryP8 delivery) {
        this.delivery = delivery;
        delivery.setOrder(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberP8 getMember() {
        return member;
    }

    public DeliveryP8 getDelivery() {
        return delivery;
    }

    public List<OrderItemP8> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemP8> orderItems) {
        this.orderItems = orderItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatusP8 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusP8 status) {
        this.status = status;
    }
}
