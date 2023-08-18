package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Card;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Role;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.RoleCategory;

import java.util.List;

public interface CustomRepository {

    List<Role> CustomTagFindByMemberId(int memberId);

    // Card Repository
    List<Card> CustomCardFindByKeyword(RoleCategory tagCategory);
}
