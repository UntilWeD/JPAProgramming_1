package com.untilwed.studyingjpa.model.ch8_entity;

import com.untilwed.studyingjpa.model.ch8_entity.item.ItemP8;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryP8 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemP8> items = new ArrayList<ItemP8>();



    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private CategoryP8 parent;

    @OneToMany(mappedBy = "parent")
    private List<CategoryP8> child = new ArrayList<CategoryP8>();

    //==연관관계 메서드==//
    public void addChildCategory(CategoryP8 child) {
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(ItemP8 item) {
        items.add(item);
    }

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

    public List<ItemP8> getItems() {
        return items;
    }

    public void setItems(List<ItemP8> items) {
        this.items = items;
    }

    public CategoryP8 getParent() {
        return parent;
    }

    public void setParent(CategoryP8 parent) {
        this.parent = parent;
    }

    public List<CategoryP8> getChild() {
        return child;
    }

    public void setChild(List<CategoryP8> child) {
        this.child = child;
    }
}
