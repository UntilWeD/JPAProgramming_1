package com.untilwed.studyingjpa.model.ch4_entity.pratice;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

//@Entity
@Table(name = "ORDER_ITEM")
@Data
@ToString
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ITEM_ID")
    private Long itemId;
    @Column(name = "ORDER_ID")
    private Long orderId;

    private int orderPrice;
    private int count;

}
