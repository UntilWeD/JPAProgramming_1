package com.untilwed.studyingjpa.model.ch9_entity;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class AddressP9 {

    private String city;
    private String street;
    private String zipcode;


    //자동생성 equals()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressP9 addressP9 = (AddressP9) o;
        return Objects.equals(city, addressP9.city) && Objects.equals(street, addressP9.street) && Objects.equals(zipcode, addressP9.zipcode);
    }

    //자동생성 hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(city, street, zipcode);
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
}
