package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeliveryP6 is a Querydsl query type for DeliveryP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeliveryP6 extends EntityPathBase<DeliveryP6> {

    private static final long serialVersionUID = -471196747L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryP6 deliveryP6 = new QDeliveryP6("deliveryP6");

    public final StringPath city = createString("city");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderP6 order;

    public final EnumPath<DeliveryStatusP6> status = createEnum("status", DeliveryStatusP6.class);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QDeliveryP6(String variable) {
        this(DeliveryP6.class, forVariable(variable), INITS);
    }

    public QDeliveryP6(Path<? extends DeliveryP6> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeliveryP6(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeliveryP6(PathMetadata metadata, PathInits inits) {
        this(DeliveryP6.class, metadata, inits);
    }

    public QDeliveryP6(Class<? extends DeliveryP6> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderP6(forProperty("order"), inits.get("order")) : null;
    }

}

