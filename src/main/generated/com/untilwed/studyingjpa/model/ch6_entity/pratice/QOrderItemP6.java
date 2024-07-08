package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItemP6 is a Querydsl query type for OrderItemP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderItemP6 extends EntityPathBase<OrderItemP6> {

    private static final long serialVersionUID = 569542060L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemP6 orderItemP6 = new QOrderItemP6("orderItemP6");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QItemP6 item;

    public final QOrderP6 order;

    public final NumberPath<Integer> orderPrice = createNumber("orderPrice", Integer.class);

    public QOrderItemP6(String variable) {
        this(OrderItemP6.class, forVariable(variable), INITS);
    }

    public QOrderItemP6(Path<? extends OrderItemP6> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItemP6(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItemP6(PathMetadata metadata, PathInits inits) {
        this(OrderItemP6.class, metadata, inits);
    }

    public QOrderItemP6(Class<? extends OrderItemP6> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new QItemP6(forProperty("item")) : null;
        this.order = inits.isInitialized("order") ? new QOrderP6(forProperty("order"), inits.get("order")) : null;
    }

}

