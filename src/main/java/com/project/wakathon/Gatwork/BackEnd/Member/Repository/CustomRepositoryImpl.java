package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Card;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.project.wakathon.Gatwork.BackEnd.Member.domain.QCard.card;
import static com.project.wakathon.Gatwork.BackEnd.Member.domain.QMember.member;
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

    // Card Repository
    @Override
    public List<Card> CustomCardFindByKeyword(TagCategory tagCategory) {
        List<Card> fetch = jpaQueryFactory
                .selectFrom(card)
                .join(card.member, member).on()

    }
}
