package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import com.untilwed.studyingjpa.model.ch7_entity.pratice.item.ItemP7;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class CategoryP7 {

    @Id @GeneratedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<ItemP7> items = new ArrayList<ItemP7>();

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private CategoryP7 parent;;

    @OneToMany(mappedBy = "parent")
    private List<CategoryP7> child = new ArrayList<CategoryP7>();

    //==연관관계 메서드==//
    public void addChildCategory(CategoryP7 child){
        this.child.add(child);
        child.setParent(this);
    }

    @Override
    public String toString() {
        return "CategoryP7{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", items=" + items +
                ", parent=" + parent +
                ", child=" + child +
                '}';
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

    public List<ItemP7> getItems() {
        return items;
    }

    public void setItems(List<ItemP7> items) {
        this.items = items;
    }

    public CategoryP7 getParent() {
        return parent;
    }

    public void setParent(CategoryP7 parent) {
        this.parent = parent;
    }

    public List<CategoryP7> getChild() {
        return child;
    }

    public void setChild(List<CategoryP7> child) {
        this.child = child;
    }
}
