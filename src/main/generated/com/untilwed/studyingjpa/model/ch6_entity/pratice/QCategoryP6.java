package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryP6 is a Querydsl query type for CategoryP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryP6 extends EntityPathBase<CategoryP6> {

    private static final long serialVersionUID = -252468673L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryP6 categoryP6 = new QCategoryP6("categoryP6");

    public final ListPath<CategoryP6, QCategoryP6> child = this.<CategoryP6, QCategoryP6>createList("child", CategoryP6.class, QCategoryP6.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<ItemP6, QItemP6> items = this.<ItemP6, QItemP6>createList("items", ItemP6.class, QItemP6.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QCategoryP6 parent;

    public QCategoryP6(String variable) {
        this(CategoryP6.class, forVariable(variable), INITS);
    }

    public QCategoryP6(Path<? extends CategoryP6> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategoryP6(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategoryP6(PathMetadata metadata, PathInits inits) {
        this(CategoryP6.class, metadata, inits);
    }

    public QCategoryP6(Class<? extends CategoryP6> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategoryP6(forProperty("parent"), inits.get("parent")) : null;
    }

}

