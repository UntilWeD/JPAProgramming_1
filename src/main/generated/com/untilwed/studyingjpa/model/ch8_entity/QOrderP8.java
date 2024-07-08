package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderP8 is a Querydsl query type for OrderP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderP8 extends EntityPathBase<OrderP8> {

    private static final long serialVersionUID = 385878705L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderP8 orderP8 = new QOrderP8("orderP8");

    public final QDeliveryP8 delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMemberP8 member;

    public final DateTimePath<java.util.Date> orderDate = createDateTime("orderDate", java.util.Date.class);

    public final ListPath<OrderItemP8, QOrderItemP8> orderItems = this.<OrderItemP8, QOrderItemP8>createList("orderItems", OrderItemP8.class, QOrderItemP8.class, PathInits.DIRECT2);

    public final EnumPath<OrderStatusP8> status = createEnum("status", OrderStatusP8.class);

    public QOrderP8(String variable) {
        this(OrderP8.class, forVariable(variable), INITS);
    }

    public QOrderP8(Path<? extends OrderP8> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderP8(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderP8(PathMetadata metadata, PathInits inits) {
        this(OrderP8.class, metadata, inits);
    }

    public QOrderP8(Class<? extends OrderP8> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDeliveryP8(forProperty("delivery"), inits.get("delivery")) : null;
        this.member = inits.isInitialized("member") ? new QMemberP8(forProperty("member")) : null;
    }

}

