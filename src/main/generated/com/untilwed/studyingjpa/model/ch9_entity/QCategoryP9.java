package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryP9 is a Querydsl query type for CategoryP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryP9 extends EntityPathBase<CategoryP9> {

    private static final long serialVersionUID = 2091411021L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryP9 categoryP9 = new QCategoryP9("categoryP9");

    public final ListPath<CategoryP9, QCategoryP9> child = this.<CategoryP9, QCategoryP9>createList("child", CategoryP9.class, QCategoryP9.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.untilwed.studyingjpa.model.ch9_entity.item.ItemP9, com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9> items = this.<com.untilwed.studyingjpa.model.ch9_entity.item.ItemP9, com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9>createList("items", com.untilwed.studyingjpa.model.ch9_entity.item.ItemP9.class, com.untilwed.studyingjpa.model.ch9_entity.item.QItemP9.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QCategoryP9 parent;

    public QCategoryP9(String variable) {
        this(CategoryP9.class, forVariable(variable), INITS);
    }

    public QCategoryP9(Path<? extends CategoryP9> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategoryP9(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategoryP9(PathMetadata metadata, PathInits inits) {
        this(CategoryP9.class, metadata, inits);
    }

    public QCategoryP9(Class<? extends CategoryP9> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategoryP9(forProperty("parent"), inits.get("parent")) : null;
    }

}

