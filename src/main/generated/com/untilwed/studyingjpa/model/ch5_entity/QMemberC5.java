package com.untilwed.studyingjpa.model.ch5_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberC5 is a Querydsl query type for MemberC5
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberC5 extends EntityPathBase<MemberC5> {

    private static final long serialVersionUID = 1723614414L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberC5 memberC5 = new QMemberC5("memberC5");

    public final StringPath id = createString("id");

    public final QTeamC5 team;

    public final StringPath username = createString("username");

    public QMemberC5(String variable) {
        this(MemberC5.class, forVariable(variable), INITS);
    }

    public QMemberC5(Path<? extends MemberC5> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberC5(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberC5(PathMetadata metadata, PathInits inits) {
        this(MemberC5.class, metadata, inits);
    }

    public QMemberC5(Class<? extends MemberC5> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.team = inits.isInitialized("team") ? new QTeamC5(forProperty("team")) : null;
    }

}

