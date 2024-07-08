package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderP7 is a Querydsl query type for OrderP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderP7 extends EntityPathBase<OrderP7> {

    private static final long serialVersionUID = 1123665817L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderP7 orderP7 = new QOrderP7("orderP7");

    public final QBaseEntityP7 _super = new QBaseEntityP7(this);

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final QDeliveryP7 delivery;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final QMemberP7 member;

    public final DateTimePath<java.util.Date> orderDate = createDateTime("orderDate", java.util.Date.class);

    public final ListPath<OrderItemP7, QOrderItemP7> orderItems = this.<OrderItemP7, QOrderItemP7>createList("orderItems", OrderItemP7.class, QOrderItemP7.class, PathInits.DIRECT2);

    public final EnumPath<OrderStatusP7> status = createEnum("status", OrderStatusP7.class);

    public QOrderP7(String variable) {
        this(OrderP7.class, forVariable(variable), INITS);
    }

    public QOrderP7(Path<? extends OrderP7> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderP7(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderP7(PathMetadata metadata, PathInits inits) {
        this(OrderP7.class, metadata, inits);
    }

    public QOrderP7(Class<? extends OrderP7> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.delivery = inits.isInitialized("delivery") ? new QDeliveryP7(forProperty("delivery"), inits.get("delivery")) : null;
        this.member = inits.isInitialized("member") ? new QMemberP7(forProperty("member")) : null;
    }

}

