package com.untilwed.studyingjpa.model.ch9_entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class OrderP9 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY) //**
    @JoinColumn(name = "MEMBER_ID")
    private MemberP9 member;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "DELIVERY_ID")
    private DeliveryP9 delivery;  // 배송정보

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)    //**
    private List<OrderItemP9> orderItems = new ArrayList<OrderItemP9>();

    private Date orderDate; //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatusP9 status;

    @Embedded
    private AddressP9 address;

    public void setMember(MemberP9 member) {
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItemP9 orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDelivery(DeliveryP9 delivery) {
        this.delivery = delivery;
        delivery.setOrder(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberP9 getMember() {
        return member;
    }

    public DeliveryP9 getDelivery() {
        return delivery;
    }

    public List<OrderItemP9> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemP9> orderItems) {
        this.orderItems = orderItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatusP9 getStatus() {
        return status;
    }

    public void setStatus(OrderStatusP9 status) {
        this.status = status;
    }
}
