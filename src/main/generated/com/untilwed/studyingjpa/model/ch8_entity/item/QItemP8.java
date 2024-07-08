package com.untilwed.studyingjpa.model.ch8_entity.item;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemP8 is a Querydsl query type for ItemP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemP8 extends EntityPathBase<ItemP8> {

    private static final long serialVersionUID = -215511247L;

    public static final QItemP8 itemP8 = new QItemP8("itemP8");

    public final ListPath<com.untilwed.studyingjpa.model.ch8_entity.CategoryP8, com.untilwed.studyingjpa.model.ch8_entity.QCategoryP8> categories = this.<com.untilwed.studyingjpa.model.ch8_entity.CategoryP8, com.untilwed.studyingjpa.model.ch8_entity.QCategoryP8>createList("categories", com.untilwed.studyingjpa.model.ch8_entity.CategoryP8.class, com.untilwed.studyingjpa.model.ch8_entity.QCategoryP8.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItemP8(String variable) {
        super(ItemP8.class, forVariable(variable));
    }

    public QItemP8(Path<? extends ItemP8> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemP8(PathMetadata metadata) {
        super(ItemP8.class, metadata);
    }

}

