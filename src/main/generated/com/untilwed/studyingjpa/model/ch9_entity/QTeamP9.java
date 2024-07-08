package com.untilwed.studyingjpa.model.ch9_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeamP9 is a Querydsl query type for TeamP9
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTeamP9 extends EntityPathBase<TeamP9> {

    private static final long serialVersionUID = -1951173908L;

    public static final QTeamP9 teamP9 = new QTeamP9("teamP9");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<MemberP9, QMemberP9> members = this.<MemberP9, QMemberP9>createList("members", MemberP9.class, QMemberP9.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QTeamP9(String variable) {
        super(TeamP9.class, forVariable(variable));
    }

    public QTeamP9(Path<? extends TeamP9> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamP9(PathMetadata metadata) {
        super(TeamP9.class, metadata);
    }

}

