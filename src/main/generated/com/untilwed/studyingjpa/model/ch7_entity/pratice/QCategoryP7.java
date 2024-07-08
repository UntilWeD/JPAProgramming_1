package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategoryP7 is a Querydsl query type for CategoryP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCategoryP7 extends EntityPathBase<CategoryP7> {

    private static final long serialVersionUID = 709145345L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCategoryP7 categoryP7 = new QCategoryP7("categoryP7");

    public final ListPath<CategoryP7, QCategoryP7> child = this.<CategoryP7, QCategoryP7>createList("child", CategoryP7.class, QCategoryP7.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<com.untilwed.studyingjpa.model.ch7_entity.pratice.item.ItemP7, com.untilwed.studyingjpa.model.ch7_entity.pratice.item.QItemP7> items = this.<com.untilwed.studyingjpa.model.ch7_entity.pratice.item.ItemP7, com.untilwed.studyingjpa.model.ch7_entity.pratice.item.QItemP7>createList("items", com.untilwed.studyingjpa.model.ch7_entity.pratice.item.ItemP7.class, com.untilwed.studyingjpa.model.ch7_entity.pratice.item.QItemP7.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final QCategoryP7 parent;

    public QCategoryP7(String variable) {
        this(CategoryP7.class, forVariable(variable), INITS);
    }

    public QCategoryP7(Path<? extends CategoryP7> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCategoryP7(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCategoryP7(PathMetadata metadata, PathInits inits) {
        this(CategoryP7.class, metadata, inits);
    }

    public QCategoryP7(Class<? extends CategoryP7> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QCategoryP7(forProperty("parent"), inits.get("parent")) : null;
    }

}

