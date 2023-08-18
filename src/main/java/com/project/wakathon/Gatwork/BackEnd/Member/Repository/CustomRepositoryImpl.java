package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.wakathon.Gatwork.BackEnd.Member.domain.QMemberTag.memberTag;

@Repository
public class CustomRepositoryImpl implements CustomRepository{

    private final JPAQueryFactory jpaQueryFactory;

    public CustomRepositoryImpl(JPAQueryFactory jpaQueryFactory) {
        this.jpaQueryFactory = jpaQueryFactory;
    }

    // MemberTag Repository
    @Override
    public List<Tag> CustomTagFindByMemberId(int memberId) {
        return jpaQueryFactory
                .select(memberTag.tag)
                .where(memberTag.id.eq(memberId))
                .fetch();
    }

    // .. other Repository
}
