package com.untilwed.studyingjpa.model.ch9_entity;

import com.untilwed.studyingjpa.model.ch9_entity.item.ItemP9;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryP9 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemP9> items = new ArrayList<ItemP9>();



    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private CategoryP9 parent;

    @OneToMany(mappedBy = "parent")
    private List<CategoryP9> child = new ArrayList<CategoryP9>();

    //==연관관계 메서드==//
    public void addChildCategory(CategoryP9 child) {
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(ItemP9 item) {
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

    public List<ItemP9> getItems() {
        return items;
    }

    public void setItems(List<ItemP9> items) {
        this.items = items;
    }

    public CategoryP9 getParent() {
        return parent;
    }

    public void setParent(CategoryP9 parent) {
        this.parent = parent;
    }

    public List<CategoryP9> getChild() {
        return child;
    }

    public void setChild(List<CategoryP9> child) {
        this.child = child;
    }
}
