package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QItemP6 is a Querydsl query type for ItemP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QItemP6 extends EntityPathBase<ItemP6> {

    private static final long serialVersionUID = -2071145324L;

    public static final QItemP6 itemP6 = new QItemP6("itemP6");

    public final ListPath<CategoryP6, QCategoryP6> categories = this.<CategoryP6, QCategoryP6>createList("categories", CategoryP6.class, QCategoryP6.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final NumberPath<Integer> stockQuantity = createNumber("stockQuantity", Integer.class);

    public QItemP6(String variable) {
        super(ItemP6.class, forVariable(variable));
    }

    public QItemP6(Path<? extends ItemP6> path) {
        super(path.getType(), path.getMetadata());
    }

    public QItemP6(PathMetadata metadata) {
        super(ItemP6.class, metadata);
    }

}

