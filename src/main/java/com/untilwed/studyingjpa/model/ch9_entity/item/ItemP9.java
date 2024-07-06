package com.untilwed.studyingjpa.model.ch9_entity.item;

import com.untilwed.studyingjpa.model.ch7_entity.pratice.CategoryP7;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public class ItemP9 {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;   // 이름
    private int price;   //가격
    private int stockQuantity;  //재고수량

    @ManyToMany(mappedBy = "items")
    private List<CategoryP7> categories = new ArrayList<CategoryP7>();

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public List<CategoryP7> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryP7> categories) {
        this.categories = categories;
    }
}
