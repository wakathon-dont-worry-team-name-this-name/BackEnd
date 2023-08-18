package com.project.wakathon.Gatwork.BackEnd.Member.service;

import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberTagRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Member;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.MemberTag;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import io.swagger.v3.oas.annotations.servers.Server;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberTagRepository memberTagRepository;
    public void logIn(MemberDto memberDto) {

    }

    @Transactional
    public void signIn(MemberDto memberDto) {


    }

    @Transactional
    public void score(List<Integer> scores, String memberName) {

        int sumScore = scores.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        Member savedMember = memberRepository.findByMemberName(memberName).orElseThrow(EntityNotFoundException::new);
        MemberTag memberTag = memberTagRepository.findByMemberId(savedMember.getId()).orElseThrow(EntityNotFoundException::new);

        memberTag.updateScore(sumScore);
        memberTag.updateScoreCnt();
    }

}
