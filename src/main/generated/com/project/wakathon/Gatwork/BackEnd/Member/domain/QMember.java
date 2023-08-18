package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


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

    public final StringPath name = createString("name");

    public final StringPath profileImg = createString("profileImg");

    public final NumberPath<Integer> studentId = createNumber("studentId", Integer.class);

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

