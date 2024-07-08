package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseEntityP8 is a Querydsl query type for BaseEntityP8
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseEntityP8 extends EntityPathBase<BaseEntityP8> {

    private static final long serialVersionUID = -312517919L;

    public static final QBaseEntityP8 baseEntityP8 = new QBaseEntityP8("baseEntityP8");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QBaseEntityP8(String variable) {
        super(BaseEntityP8.class, forVariable(variable));
    }

    public QBaseEntityP8(Path<? extends BaseEntityP8> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseEntityP8(PathMetadata metadata) {
        super(BaseEntityP8.class, metadata);
    }

}

