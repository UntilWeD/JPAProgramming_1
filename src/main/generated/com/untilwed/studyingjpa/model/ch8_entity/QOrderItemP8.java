package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItemP8 is a Querydsl query type for OrderItemP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderItemP8 extends EntityPathBase<OrderItemP8> {

    private static final long serialVersionUID = 624192676L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemP8 orderItemP8 = new QOrderItemP8("orderItemP8");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.untilwed.studyingjpa.model.ch8_entity.item.QItemP8 item;

    public final QOrderP8 order;

    public final NumberPath<Integer> orderPrice = createNumber("orderPrice", Integer.class);

    public QOrderItemP8(String variable) {
        this(OrderItemP8.class, forVariable(variable), INITS);
    }

    public QOrderItemP8(Path<? extends OrderItemP8> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItemP8(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItemP8(PathMetadata metadata, PathInits inits) {
        this(OrderItemP8.class, metadata, inits);
    }

    public QOrderItemP8(Class<? extends OrderItemP8> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.untilwed.studyingjpa.model.ch8_entity.item.QItemP8(forProperty("item")) : null;
        this.order = inits.isInitialized("order") ? new QOrderP8(forProperty("order"), inits.get("order")) : null;
    }

}

