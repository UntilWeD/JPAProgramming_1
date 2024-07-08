package com.untilwed.studyingjpa.model.ch7_entity.pratice.item;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemP7 is a Querydsl query type for ItemP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemP7 extends EntityPathBase<ItemP7> {

    private static final long serialVersionUID = -524898407L;

    public static final QItemP7 itemP7 = new QItemP7("itemP7");

    public final ListPath<com.untilwed.studyingjpa.model.ch7_entity.pratice.CategoryP7, com.untilwed.studyingjpa.model.ch7_entity.pratice.QCategoryP7> categories = this.<com.untilwed.studyingjpa.model.ch7_entity.pratice.CategoryP7, com.untilwed.studyingjpa.model.ch7_entity.pratice.QCategoryP7>createList("categories", com.untilwed.studyingjpa.model.ch7_entity.pratice.CategoryP7.class, com.untilwed.studyingjpa.model.ch7_entity.pratice.QCategoryP7.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItemP7(String variable) {
        super(ItemP7.class, forVariable(variable));
    }

    public QItemP7(Path<? extends ItemP7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemP7(PathMetadata metadata) {
        super(ItemP7.class, metadata);
    }

}

