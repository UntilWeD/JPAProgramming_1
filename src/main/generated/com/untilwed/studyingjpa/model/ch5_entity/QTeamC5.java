package com.untilwed.studyingjpa.model.ch5_entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTeamC5 is a Querydsl query type for TeamC5
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTeamC5 extends EntityPathBase<TeamC5> {

    private static final long serialVersionUID = 608553041L;

    public static final QTeamC5 teamC5 = new QTeamC5("teamC5");

    public final StringPath id = createString("id");

    public final ListPath<MemberC5, QMemberC5> members = this.<MemberC5, QMemberC5>createList("members", MemberC5.class, QMemberC5.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public QTeamC5(String variable) {
        super(TeamC5.class, forVariable(variable));
    }

    public QTeamC5(Path<? extends TeamC5> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamC5(PathMetadata metadata) {
        super(TeamC5.class, metadata);
    }

}

