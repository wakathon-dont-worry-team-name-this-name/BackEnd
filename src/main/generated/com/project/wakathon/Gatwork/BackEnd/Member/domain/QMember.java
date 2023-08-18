package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMember is a Querydsl query type for Member
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMember extends EntityPathBase<Member> {

    private static final long serialVersionUID = 1665859046L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMember member = new QMember("member1");

    public final QCard card;

    public final StringPath contact = createString("contact");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath introduce = createString("introduce");

    public final ListPath<MemberInteresting, QMemberInteresting> memberInterestingList = this.<MemberInteresting, QMemberInteresting>createList("memberInterestingList", MemberInteresting.class, QMemberInteresting.class, PathInits.DIRECT2);

    public final StringPath memberName = createString("memberName");

    public final StringPath memberPwd = createString("memberPwd");

    public final ListPath<MemberTag, QMemberTag> memberTagList = this.<MemberTag, QMemberTag>createList("memberTagList", MemberTag.class, QMemberTag.class, PathInits.DIRECT2);

    public final StringPath nickName = createString("nickName");

    public final StringPath profileImg = createString("profileImg");

    public final StringPath studentId = createString("studentId");

    public QMember(String variable) {
        this(Member.class, forVariable(variable), INITS);
    }

    public QMember(Path<? extends Member> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMember(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMember(PathMetadata metadata, PathInits inits) {
        this(Member.class, metadata, inits);
    }

    public QMember(Class<? extends Member> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.card = inits.isInitialized("card") ? new QCard(forProperty("card"), inits.get("card")) : null;
    }

}

