package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRole is a Querydsl query type for Role
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRole extends EntityPathBase<Role> {

    private static final long serialVersionUID = 1771722434L;

    public static final QRole role = new QRole("role");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<MemberTag, QMemberTag> memberTagList = this.<MemberTag, QMemberTag>createList("memberTagList", MemberTag.class, QMemberTag.class, PathInits.DIRECT2);

    public final EnumPath<RoleCategory> roleCategory = createEnum("roleCategory", RoleCategory.class);

    public QRole(String variable) {
        super(Role.class, forVariable(variable));
    }

    public QRole(Path<? extends Role> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRole(PathMetadata metadata) {
        super(Role.class, metadata);
    }

}

