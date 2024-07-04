package com.untilwed.studyingjpa.model.ch6;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryP6 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    //다대다 연결엔티티 활용
    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
        joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemP6> items = new ArrayList<ItemP6>();

    //카테고리의 계층 구조를 위한 필드들
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private CategoryP6 parent;

    @OneToMany(mappedBy = "parent")
    private List<CategoryP6> child = new ArrayList<CategoryP6>();

    //==연관관계 메소드==//
    public void addChildCategory(CategoryP6 child){
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(ItemP6 item){
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

    public List<ItemP6> getItems() {
        return items;
    }

    public void setItems(List<ItemP6> items) {
        this.items = items;
    }

    public CategoryP6 getParent() {
        return parent;
    }

    public void setParent(CategoryP6 parent) {
        this.parent = parent;
    }

    public List<CategoryP6> getChild() {
        return child;
    }

    public void setChild(List<CategoryP6> child) {
        this.child = child;
    }
}
