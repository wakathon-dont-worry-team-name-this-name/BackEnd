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

    public static final QMember member = new QMember("member1");

    public final StringPath contact = createString("contact");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath introduce = createString("introduce");

    public final StringPath memberName = createString("memberName");

    public final StringPath memberPwd = createString("memberPwd");

    public final ListPath<MemberTag, QMemberTag> memberTagList = this.<MemberTag, QMemberTag>createList("memberTagList", MemberTag.class, QMemberTag.class, PathInits.DIRECT2);

    public final StringPath nickName = createString("nickName");

    public final StringPath profileImg = createString("profileImg");

    public final StringPath studentId = createString("studentId");

    public QMember(String variable) {
        super(Member.class, forVariable(variable));
    }

    public QMember(Path<? extends Member> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMember(PathMetadata metadata) {
        super(Member.class, metadata);
    }

}

