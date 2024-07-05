package com.untilwed.studyingjpa.model.ch8_entity.item;

import com.untilwed.studyingjpa.model.ch8_entity.CategoryP8;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class ItemP8 {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    private String name;        //이름
    private int price;          //가격
    private int stockQuantity;  //재고수량

    @ManyToMany(mappedBy = "items")
    private List<CategoryP8> categories = new ArrayList<CategoryP8>();

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

    public List<CategoryP8> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryP8> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
