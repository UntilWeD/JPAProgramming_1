package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeliveryP8 is a Querydsl query type for DeliveryP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeliveryP8 extends EntityPathBase<DeliveryP8> {

    private static final long serialVersionUID = -1577812479L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryP8 deliveryP8 = new QDeliveryP8("deliveryP8");

    public final StringPath city = createString("city");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderP8 order;

    public final EnumPath<DeliveryStatusP8> status = createEnum("status", DeliveryStatusP8.class);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QDeliveryP8(String variable) {
        this(DeliveryP8.class, forVariable(variable), INITS);
    }

    public QDeliveryP8(Path<? extends DeliveryP8> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeliveryP8(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeliveryP8(PathMetadata metadata, PathInits inits) {
        this(DeliveryP8.class, metadata, inits);
    }

    public QDeliveryP8(Class<? extends DeliveryP8> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderP8(forProperty("order"), inits.get("order")) : null;
    }

}

