package com.untilwed.studyingjpa.model.ch5_model.pratice;

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

}
