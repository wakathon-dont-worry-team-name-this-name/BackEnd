package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInteresting is a Querydsl query type for Interesting
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInteresting extends EntityPathBase<Interesting> {

    private static final long serialVersionUID = -2045287252L;

    public static final QInteresting interesting = new QInteresting("interesting");

    public final EnumPath<InterestingCategory> category = createEnum("category", InterestingCategory.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final ListPath<MemberInteresting, QMemberInteresting> memberInterestings = this.<MemberInteresting, QMemberInteresting>createList("memberInterestings", MemberInteresting.class, QMemberInteresting.class, PathInits.DIRECT2);

    public QInteresting(String variable) {
        super(Interesting.class, forVariable(variable));
    }

    public QInteresting(Path<? extends Interesting> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInteresting(PathMetadata metadata) {
        super(Interesting.class, metadata);
    }

}

