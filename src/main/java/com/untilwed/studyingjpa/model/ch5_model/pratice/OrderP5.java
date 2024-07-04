package com.untilwed.studyingjpa.model.ch5_model.pratice;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Entity
@Table(name = "ORDERS")
@Data
public class OrderP5 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    @Column(name = "MEMBER_ID")
    private MemberP5 member;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;     //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status;  //주문상태

    @OneToMany(mappedBy = "order")
    private List<OrderItemP5> orderItemP5s = new ArrayList<OrderItemP5>();

    //==연관관계 메소드==//
    public void setMember(MemberP5 member){
        //기존 관계 제거
        if(this.member != null) {
            this.member.getOrdersP5().remove(this);
        }
        this.member= member;
        member.getOrdersP5().add(this);

    }

    public void addOrderItem(OrderItemP5 orderItemP5){
        orderItemP5s.add(orderItemP5);
        orderItemP5.setOrder(this);
    }
}
