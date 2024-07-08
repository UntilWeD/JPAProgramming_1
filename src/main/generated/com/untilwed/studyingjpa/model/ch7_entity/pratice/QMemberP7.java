package com.untilwed.studyingjpa.model.ch7_entity.pratice;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberP7 is a Querydsl query type for MemberP7
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberP7 extends EntityPathBase<MemberP7> {

    private static final long serialVersionUID = -1409826659L;

    public static final QMemberP7 memberP7 = new QMemberP7("memberP7");

    public final QBaseEntityP7 _super = new QBaseEntityP7(this);

    public final StringPath city = createString("city");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final StringPath name = createString("name");

    public final ListPath<OrderP7, QOrderP7> orders = this.<OrderP7, QOrderP7>createList("orders", OrderP7.class, QOrderP7.class, PathInits.DIRECT2);

    public final StringPath street = createString("street");

    public final StringPath zipcode = createString("zipcode");

    public QMemberP7(String variable) {
        super(MemberP7.class, forVariable(variable));
    }

    public QMemberP7(Path<? extends MemberP7> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberP7(PathMetadata metadata) {
        super(MemberP7.class, metadata);
    }

}

