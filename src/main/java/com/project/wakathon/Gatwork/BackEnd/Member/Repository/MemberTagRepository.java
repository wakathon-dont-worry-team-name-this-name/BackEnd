package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.MemberTag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

public interface MemberTagRepository extends JpaRepository<MemberTag, Integer>, CustomRepository {
    Optional<MemberTag> findByMemberId(Integer integer);
}
