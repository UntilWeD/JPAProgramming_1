package com.untilwed.studyingjpa.model.ch4_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMemberC4 is a Querydsl query type for MemberC4
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberC4 extends EntityPathBase<MemberC4> {

    private static final long serialVersionUID = 370304716L;

    public static final QMemberC4 memberC4 = new QMemberC4("memberC4");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final DateTimePath<java.util.Date> createdDate = createDateTime("createdDate", java.util.Date.class);

    public final StringPath description = createString("description");

    public final StringPath id = createString("id");

    public final DateTimePath<java.util.Date> lastModifiedDate = createDateTime("lastModifiedDate", java.util.Date.class);

    public final EnumPath<RoleType> roleType = createEnum("roleType", RoleType.class);

    public final StringPath username = createString("username");

    public QMemberC4(String variable) {
        super(MemberC4.class, forVariable(variable));
    }

    public QMemberC4(Path<? extends MemberC4> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMemberC4(PathMetadata metadata) {
        super(MemberC4.class, metadata);
    }

}

