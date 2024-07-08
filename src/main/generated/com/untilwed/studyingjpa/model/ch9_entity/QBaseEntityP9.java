package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseEntityP9 is a Querydsl query type for BaseEntityP9
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseEntityP9 extends EntityPathBase<BaseEntityP9> {

    private static final long serialVersionUID = -101167005L;

    public static final QBaseEntityP9 baseEntityP9 = new QBaseEntityP9("baseEntityP9");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QBaseEntityP9(String variable) {
        super(BaseEntityP9.class, forVariable(variable));
    }

    public QBaseEntityP9(Path<? extends BaseEntityP9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseEntityP9(PathMetadata metadata) {
        super(BaseEntityP9.class, metadata);
    }

}

