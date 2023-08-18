package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.MemberInteresting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberInterestingRepository extends JpaRepository<MemberInteresting, Integer> {
}
