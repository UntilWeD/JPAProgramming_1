package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderP6 is a Querydsl query type for OrderP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderP6 extends EntityPathBase<OrderP6> {

    private static final long serialVersionUID = 1190672569L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderP6 orderP6 = new QOrderP6("orderP6");

    public final QDeliveryP6 delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QMemberP6 member;

    public final DateTimePath<java.util.Date> orderDate = createDateTime("orderDate", java.util.Date.class);

    public final ListPath<OrderItemP6, QOrderItemP6> orderItems = this.<OrderItemP6, QOrderItemP6>createList("orderItems", OrderItemP6.class, QOrderItemP6.class, PathInits.DIRECT2);

    public final EnumPath<com.untilwed.studyingjpa.model.ch5_entity.pratice.OrderStatus> orderStatus = createEnum("orderStatus", com.untilwed.studyingjpa.model.ch5_entity.pratice.OrderStatus.class);

    public QOrderP6(String variable) {
        this(OrderP6.class, forVariable(variable), INITS);
    }

    public QOrderP6(Path<? extends OrderP6> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderP6(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderP6(PathMetadata metadata, PathInits inits) {
        this(OrderP6.class, metadata, inits);
    }

    public QOrderP6(Class<? extends OrderP6> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDeliveryP6(forProperty("delivery"), inits.get("delivery")) : null;
        this.member = inits.isInitialized("member") ? new QMemberP6(forProperty("member")) : null;
    }

}

