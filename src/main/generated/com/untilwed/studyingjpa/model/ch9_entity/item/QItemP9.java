package com.untilwed.studyingjpa.model.ch9_entity.item;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemP9 is a Querydsl query type for ItemP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemP9 extends EntityPathBase<ItemP9> {

    private static final long serialVersionUID = -624335471L;

    public static final QItemP9 itemP9 = new QItemP9("itemP9");

    public final ListPath<com.untilwed.studyingjpa.model.ch9_entity.CategoryP9, com.untilwed.studyingjpa.model.ch9_entity.QCategoryP9> categories = this.<com.untilwed.studyingjpa.model.ch9_entity.CategoryP9, com.untilwed.studyingjpa.model.ch9_entity.QCategoryP9>createList("categories", com.untilwed.studyingjpa.model.ch9_entity.CategoryP9.class, com.untilwed.studyingjpa.model.ch9_entity.QCategoryP9.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItemP9(String variable) {
        super(ItemP9.class, forVariable(variable));
    }

    public QItemP9(Path<? extends ItemP9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemP9(PathMetadata metadata) {
        super(ItemP9.class, metadata);
    }

}

