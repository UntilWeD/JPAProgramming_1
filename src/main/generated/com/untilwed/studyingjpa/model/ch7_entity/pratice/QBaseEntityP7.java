package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseEntityP7 is a Querydsl query type for BaseEntityP7
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseEntityP7 extends EntityPathBase<BaseEntityP7> {

    private static final long serialVersionUID = -1313585257L;

    public static final QBaseEntityP7 baseEntityP7 = new QBaseEntityP7("baseEntityP7");

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public QBaseEntityP7(String variable) {
        super(BaseEntityP7.class, forVariable(variable));
    }

    public QBaseEntityP7(Path<? extends BaseEntityP7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseEntityP7(PathMetadata metadata) {
        super(BaseEntityP7.class, metadata);
    }

}

