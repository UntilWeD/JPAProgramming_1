package com.untilwed.studyingjpa.model.ch8_entity;

import jakarta.persistence.*;

@Entity
public class DeliveryP8 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private OrderP8 order;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatusP8 status; //ENUM [READY(준비), COMP(배송)]

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderP8 getOrder() {
        return order;
    }

    public void setOrder(OrderP8 order) {
        this.order = order;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public DeliveryStatusP8 getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatusP8 status) {
        this.status = status;
    }
}
