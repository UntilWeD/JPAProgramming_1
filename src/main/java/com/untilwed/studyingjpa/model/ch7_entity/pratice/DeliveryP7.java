package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import jakarta.persistence.*;

@Entity
public class DeliveryP7 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private OrderP7 order;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatusP7 status; //ENUM [READY, COMP]

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderP7 getOrder() {
        return order;
    }

    public void setOrder(OrderP7 order) {
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

    public DeliveryStatusP7 getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatusP7 status) {
        this.status = status;
    }
}
