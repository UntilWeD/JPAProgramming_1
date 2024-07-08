package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItemP7 is a Querydsl query type for OrderItemP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderItemP7 extends EntityPathBase<OrderItemP7> {

    private static final long serialVersionUID = 314805516L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemP7 orderItemP7 = new QOrderItemP7("orderItemP7");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.untilwed.studyingjpa.model.ch7_entity.pratice.item.QItemP7 item;

    public final QOrderP7 order;

    public final NumberPath<Integer> orderPrice = createNumber("orderPrice", Integer.class);

    public QOrderItemP7(String variable) {
        this(OrderItemP7.class, forVariable(variable), INITS);
    }

    public QOrderItemP7(Path<? extends OrderItemP7> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItemP7(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItemP7(PathMetadata metadata, PathInits inits) {
        this(OrderItemP7.class, metadata, inits);
    }

    public QOrderItemP7(Class<? extends OrderItemP7> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.untilwed.studyingjpa.model.ch7_entity.pratice.item.QItemP7(forProperty("item")) : null;
        this.order = inits.isInitialized("order") ? new QOrderP7(forProperty("order"), inits.get("order")) : null;
    }

}

