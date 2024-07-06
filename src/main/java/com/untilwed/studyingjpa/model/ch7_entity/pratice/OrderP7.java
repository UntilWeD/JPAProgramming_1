package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import com.untilwed.studyingjpa.model.ch4_entity.pratice.Member;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class OrderP7 extends BaseEntityP7{

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private MemberP7 member; //주문회원

    @OneToMany(mappedBy = "order")
    private List<OrderItemP7> orderItems = new ArrayList<OrderItemP7>();

    @OneToOne
    @JoinColumn(name = "DELIVERY_ID")
    private DeliveryP7 delivery; // 배송정보

    private Date orderDate; //주문시간

    @Enumerated(EnumType.STRING)
    private OrderStatusP7 status; //주문상태

    //==연관관계 메서드==//
    public void setMember(MemberP7 member){
        this.member = member;
        member.getOrders().add(this);
    }

    public void addOrderItem(OrderItemP7 orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }

    public void setDelivery(DeliveryP7 delivery) {
        this.delivery = delivery;
        delivery.setOrder(this);
    }
}
