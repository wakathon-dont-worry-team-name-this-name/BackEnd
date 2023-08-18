package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;

import java.util.List;

public interface CustomRepository {

    List<Tag> CustomTagFindByMemberId(int memberId);
}
