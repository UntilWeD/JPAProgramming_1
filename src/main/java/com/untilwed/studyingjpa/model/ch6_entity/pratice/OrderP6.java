package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import com.untilwed.studyingjpa.model.ch5_entity.pratice.OrderStatus;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class OrderP6 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberP6 member; //주문회원

    @OneToMany(mappedBy = "order")
    private List<OrderItemP6> orderItems = new ArrayList<OrderItemP6>();

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private DeliveryP6 delivery; //배송정보

    private Date orderDate; //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; //주문상태

    //==연관관계 메소드==//
    public void setMember(MemberP6 member){
        //기존 관계 제거
        if(this.member != null){
            this.member.getOrders().remove(this);
        }
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItemP6 orderItem){
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDelivery(DeliveryP6 delivery){
        this.delivery = delivery;
        delivery.setOrder(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberP6 getMember() {
        return member;
    }

    public List<OrderItemP6> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItemP6> orderItems) {
        this.orderItems = orderItems;
    }

    public DeliveryP6 getDelivery() {
        return delivery;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
