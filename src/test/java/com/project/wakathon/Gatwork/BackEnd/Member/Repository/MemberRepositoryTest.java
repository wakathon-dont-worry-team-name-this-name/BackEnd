package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Member;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.RoleCategory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @PersistenceContext
    EntityManager em;

    @Test
    @DisplayName("entity input test")
    @Transactional
    public void test1() {
        Member member = Member.builder()
                .memberName("asd")
                .memberPwd("1234")
                .introduce("asdad")
                .contact("notion")
                .profileImg("img1")
                .studentId("5615")
                .nickName("wow")
                .build();

        memberRepository.save(member);

        em.flush();
        em.clear();

        Optional<Member> savedMember = memberRepository.findByMemberName("asd");

        assertEquals(savedMember.isPresent(), true);
    }

    @Test
    @DisplayName("member entity 생성 테스트")
    @Transactional
    public void test2() {

        System.out.println(RoleCategory.values());
    }

}