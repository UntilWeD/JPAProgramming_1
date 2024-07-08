package com.untilwed.studyingjpa.model.ch8_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberP8 is a Querydsl query type for MemberP8
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberP8 extends EntityPathBase<MemberP8> {

    private static final long serialVersionUID = 1488576615L;

    public static final QMemberP8 memberP8 = new QMemberP8("memberP8");

    public final QBaseEntityP8 _super = new QBaseEntityP8(this);

    public final StringPath city = createString("city");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final ListPath<OrderP8, QOrderP8> orders = this.<OrderP8, QOrderP8>createList("orders", OrderP8.class, QOrderP8.class, PathInits.DIRECT2);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QMemberP8(String variable) {
        super(MemberP8.class, forVariable(variable));
    }

    public QMemberP8(Path<? extends MemberP8> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberP8(PathMetadata metadata) {
        super(MemberP8.class, metadata);
    }

}

