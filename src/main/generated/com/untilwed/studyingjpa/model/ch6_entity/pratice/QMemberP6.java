package com.untilwed.studyingjpa.model.ch6_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberP6 is a Querydsl query type for MemberP6
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberP6 extends EntityPathBase<MemberP6> {

    private static final long serialVersionUID = 667382683L;

    public static final QMemberP6 memberP6 = new QMemberP6("memberP6");

    public final StringPath city = createString("city");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<OrderP6, QOrderP6> orders = this.<OrderP6, QOrderP6>createList("orders", OrderP6.class, QOrderP6.class, PathInits.DIRECT2);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QMemberP6(String variable) {
        super(MemberP6.class, forVariable(variable));
    }

    public QMemberP6(Path<? extends MemberP6> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberP6(PathMetadata metadata) {
        super(MemberP6.class, metadata);
    }

}

