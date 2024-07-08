package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOrderItemP9 is a Querydsl query type for OrderItemP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOrderItemP9 extends EntityPathBase<OrderItemP9> {

    private static final long serialVersionUID = 215368452L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QOrderItemP9 orderItemP9 = new QOrderItemP9("orderItemP9");

    public final NumberPath<Integer> count = createNumber("count", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9 item;

    public final QOrderP9 order;

    public final NumberPath<Integer> orderPrice = createNumber("orderPrice", Integer.class);

    public QOrderItemP9(String variable) {
        this(OrderItemP9.class, forVariable(variable), INITS);
    }

    public QOrderItemP9(Path<? extends OrderItemP9> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QOrderItemP9(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QOrderItemP9(PathMetadata metadata, PathInits inits) {
        this(OrderItemP9.class, metadata, inits);
    }

    public QOrderItemP9(Class<? extends OrderItemP9> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.item = inits.isInitialized("item") ? new com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9(forProperty("item")) : null;
        this.order = inits.isInitialized("order") ? new QOrderP9(forProperty("order"), inits.get("order")) : null;
    }

}

