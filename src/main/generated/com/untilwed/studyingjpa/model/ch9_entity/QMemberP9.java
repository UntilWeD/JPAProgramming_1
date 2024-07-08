package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberP9 is a Querydsl query type for MemberP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberP9 extends EntityPathBase<MemberP9> {

    private static final long serialVersionUID = -1453080983L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberP9 memberP9 = new QMemberP9("memberP9");

    public final QBaseEntityP9 _super = new QBaseEntityP9(this);

    public final QAddressP9 address;

    public final StringPath age = createString("age");

    //inherited
    public final DateTimePath<java.util.Date> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.util.Date> lastModifiedDate = _super.lastModifiedDate;

    public final ListPath<OrderP9, QOrderP9> orders = this.<OrderP9, QOrderP9>createList("orders", OrderP9.class, QOrderP9.class, PathInits.DIRECT2);

    public final QTeamP9 team;

    public final StringPath username = createString("username");

    public QMemberP9(String variable) {
        this(MemberP9.class, forVariable(variable), INITS);
    }

    public QMemberP9(Path<? extends MemberP9> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberP9(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberP9(PathMetadata metadata, PathInits inits) {
        this(MemberP9.class, metadata, inits);
    }

    public QMemberP9(Class<? extends MemberP9> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddressP9(forProperty("address")) : null;
        this.team = inits.isInitialized("team") ? new QTeamP9(forProperty("team")) : null;
    }

}

