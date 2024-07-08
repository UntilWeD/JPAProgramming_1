package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDeliveryP7 is a Querydsl query type for DeliveryP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDeliveryP7 extends EntityPathBase<DeliveryP7> {

    private static final long serialVersionUID = 490417271L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDeliveryP7 deliveryP7 = new QDeliveryP7("deliveryP7");

    public final StringPath city = createString("city");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QOrderP7 order;

    public final EnumPath<DeliveryStatusP7> status = createEnum("status", DeliveryStatusP7.class);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QDeliveryP7(String variable) {
        this(DeliveryP7.class, forVariable(variable), INITS);
    }

    public QDeliveryP7(Path<? extends DeliveryP7> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDeliveryP7(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDeliveryP7(PathMetadata metadata, PathInits inits) {
        this(DeliveryP7.class, metadata, inits);
    }

    public QDeliveryP7(Class<? extends DeliveryP7> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.order = inits.isInitialized("order") ? new QOrderP7(forProperty("order"), inits.get("order")) : null;
    }

}

