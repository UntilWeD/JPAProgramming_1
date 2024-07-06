package com.untilwed.studyingjpa.model.ch9_entity;



import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by holyeye on 2014. 3. 11..
 */

@Entity
public class MemberP9 extends BaseEntityP9 {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

//    private String city;
//    private String street;
//    private String zipcode;

    //@Embedded 값타입을 활용하여 좀더 객체지향적으로 개발하기 위해
    //주소관련 부분을 객체로 나누어서 초기화 하였다.
    //jpa에서 사용하기 위해 @Embedded를 활용하여 해당 값 타입을
    //테이블을 따로 생성하지 않고 그 자체로 저장한다.
    @Embedded               // 추가
    private AddressP9 address; // 추가



    @OneToMany(mappedBy = "member")
    private List<OrderP9> orders = new ArrayList<OrderP9>();

    //Getter, Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<OrderP9> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderP9> orders) {
        this.orders = orders;
    }
}