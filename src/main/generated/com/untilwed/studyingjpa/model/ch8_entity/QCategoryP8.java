package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryP8 is a Querydsl query type for CategoryP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryP8 extends EntityPathBase<CategoryP8> {

    private static final long serialVersionUID = -1359084405L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryP8 categoryP8 = new QCategoryP8("categoryP8");

    public final ListPath<CategoryP8, QCategoryP8> child = this.<CategoryP8, QCategoryP8>createList("child", CategoryP8.class, QCategoryP8.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.untilwed.studyingjpa.model.ch8_entity.item.ItemP8, com.untilwed.studyingjpa.model.ch8_entity.item.QItemP8> items = this.<com.untilwed.studyingjpa.model.ch8_entity.item.ItemP8, com.untilwed.studyingjpa.model.ch8_entity.item.QItemP8>createList("items", com.untilwed.studyingjpa.model.ch8_entity.item.ItemP8.class, com.untilwed.studyingjpa.model.ch8_entity.item.QItemP8.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QCategoryP8 parent;

    public QCategoryP8(String variable) {
        this(CategoryP8.class, forVariable(variable), INITS);
    }

    public QCategoryP8(Path<? extends CategoryP8> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategoryP8(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategoryP8(PathMetadata metadata, PathInits inits) {
        this(CategoryP8.class, metadata, inits);
    }

    public QCategoryP8(Class<? extends CategoryP8> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategoryP8(forProperty("parent"), inits.get("parent")) : null;
    }

}

