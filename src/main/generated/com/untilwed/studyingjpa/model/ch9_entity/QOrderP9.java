package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderP9 is a Querydsl query type for OrderP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderP9 extends EntityPathBase<OrderP9> {

    private static final long serialVersionUID = -124655471L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderP9 orderP9 = new QOrderP9("orderP9");

    public final QAddressP9 address;

    public final QDeliveryP9 delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMemberP9 member;

    public final DateTimePath<java.util.Date> orderDate = createDateTime("orderDate", java.util.Date.class);

    public final ListPath<OrderItemP9, QOrderItemP9> orderItems = this.<OrderItemP9, QOrderItemP9>createList("orderItems", OrderItemP9.class, QOrderItemP9.class, PathInits.DIRECT2);

    public final EnumPath<OrderStatusP9> status = createEnum("status", OrderStatusP9.class);

    public QOrderP9(String variable) {
        this(OrderP9.class, forVariable(variable), INITS);
    }

    public QOrderP9(Path<? extends OrderP9> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderP9(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderP9(PathMetadata metadata, PathInits inits) {
        this(OrderP9.class, metadata, inits);
    }

    public QOrderP9(Class<? extends OrderP9> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddressP9(forProperty("address")) : null;
        this.delivery = inits.isInitialized("delivery") ? new QDeliveryP9(forProperty("delivery"), inits.get("delivery")) : null;
        this.member = inits.isInitialized("member") ? new QMemberP9(forProperty("member"), inits.get("member")) : null;
    }

}

