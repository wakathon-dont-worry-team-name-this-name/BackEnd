package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMemberInteresting is a Querydsl query type for MemberInteresting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMemberInteresting extends EntityPathBase<MemberInteresting> {

    private static final long serialVersionUID = -578238798L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMemberInteresting memberInteresting = new QMemberInteresting("memberInteresting");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QInteresting interesting;

    public final QMember member;

    public QMemberInteresting(String variable) {
        this(MemberInteresting.class, forVariable(variable), INITS);
    }

    public QMemberInteresting(Path<? extends MemberInteresting> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMemberInteresting(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMemberInteresting(PathMetadata metadata, PathInits inits) {
        this(MemberInteresting.class, metadata, inits);
    }

    public QMemberInteresting(Class<? extends MemberInteresting> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.interesting = inits.isInitialized("interesting") ? new QInteresting(forProperty("interesting")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

