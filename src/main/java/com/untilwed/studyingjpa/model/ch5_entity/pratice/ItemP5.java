package com.untilwed.studyingjpa.model.ch5_entity.pratice;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

//@Entity
@Data
public class ItemP5 {
    
    
    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;
    
    private String name; //이름
    private int price;   //가격
    private int stockQuantity; //재고수량
}
