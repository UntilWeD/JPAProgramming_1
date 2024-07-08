package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeliveryP9 is a Querydsl query type for DeliveryP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeliveryP9 extends EntityPathBase<DeliveryP9> {

    private static final long serialVersionUID = 1872682947L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryP9 deliveryP9 = new QDeliveryP9("deliveryP9");

    public final QAddressP9 address;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderP9 order;

    public final EnumPath<DeliveryStatusP9> status = createEnum("status", DeliveryStatusP9.class);

    public QDeliveryP9(String variable) {
        this(DeliveryP9.class, forVariable(variable), INITS);
    }

    public QDeliveryP9(Path<? extends DeliveryP9> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeliveryP9(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeliveryP9(PathMetadata metadata, PathInits inits) {
        this(DeliveryP9.class, metadata, inits);
    }

    public QDeliveryP9(Class<? extends DeliveryP9> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddressP9(forProperty("address")) : null;
        this.order = inits.isInitialized("order") ? new QOrderP9(forProperty("order"), inits.get("order")) : null;
    }

}

