package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import jakarta.persistence.*;

@Entity
public class DeliveryP6 {

    @Id @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private OrderP6 order;

    private String city;
    private String street;
    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatusP6 status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderP6 getOrder() {
        return order;
    }

    public void setOrder(OrderP6 order) {
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

    public DeliveryStatusP6 getStatus() {
        return status;
    }

    public void setStatus(DeliveryStatusP6 status) {
        this.status = status;
    }
}
