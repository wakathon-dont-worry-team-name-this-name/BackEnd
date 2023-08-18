package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Card;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;

import java.util.List;

public interface CustomRepository {

    List<Tag> CustomTagFindByMemberId(int memberId);

    // Card Repository
    List<Card> CustomCardFindByKeyword(TagCategory tagCategory);
}
