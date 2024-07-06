package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import com.untilwed.studyingjpa.model.ch7_entity.pratice.item.ItemP7;
import jakarta.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItemP7 {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne //단방향 다대일
    @JoinColumn(name = "ITEM_ID")
    private ItemP7 item;  //주문상품

    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private OrderP7 order; //주문

    private int orderPrice; //주문 가격
    private int count;      //주문 수량

    @Override
    public String toString() {
        return "OrderItemP7{" +
                "id=" + id +
                ", item=" + item +
                ", order=" + order +
                ", orderPrice=" + orderPrice +
                ", count=" + count +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ItemP7 getItem() {
        return item;
    }

    public void setItem(ItemP7 item) {
        this.item = item;
    }

    public OrderP7 getOrder() {
        return order;
    }

    public void setOrder(OrderP7 order) {
        this.order = order;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
