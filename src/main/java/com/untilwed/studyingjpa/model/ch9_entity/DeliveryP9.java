package com.untilwed.studyingjpa.model.ch9_entity;

import jakarta.persistence.*;

@Entity
public class DeliveryP9 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private OrderP9 order;

//    private String city;
//    private String street;
//    private String zipcode;

    @Embedded //추가
    private AddressP9 address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatusP9 status; //ENUM [READY(준비), COMP(배송)]

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderP9 getOrder() {
        return order;
    }

    public void setOrder(OrderP9 order) {
        this.order = order;
    }

    public DeliveryStatusP9 getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatusP9 status) {
        this.status = status;
    }
}
