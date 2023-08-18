package com.project.wakathon.Gatwork.BackEnd.Member.service;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.*;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.CardRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberTagRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.response.CardResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.TagsInUserResponseDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberTagRepository memberTagRepository;
    private final CardRepository cardRepository;

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


    // Tag 리스트
    public TagsInUserResponseDto getTagsInUser(int memberId) {
        // Client Error Handling
        List<Role> roles = memberTagRepository.CustomTagFindByMemberId(memberId);

        // todo: 유효성 검사

        return TagsInUserResponseDto.builder()
                .roleCategories((ArrayList<RoleCategory>) roles.stream()
                        .map(Role::getRoleCategory)
                        .distinct()
                        .collect(Collectors.toList()))
                .build();
    }

    // 선택된 명함 카드 가져오기
    public CardResponseDto getCard(int memberId) {
        Card card = cardRepository.findById(memberId).orElseThrow(RuntimeException::new);
        Member member = memberRepository.findById(memberId).orElseThrow(RuntimeException::new);

        return CardResponseDto.builder()
                .id(card.getId())
                .studentId(member.getStudentId())
                .profileImg(member.getProfileImg())
                .viewCount(card.getViewCount())
                .major(card.getMajor())
                .introduce(member.getIntroduce())
                .build();
    }

    // 추천(키워드)에 따른 명함 리스트 가져오기
    public List<CardResponseDto> getCardsByRole(RoleCategory roleCategory) {
        List<Card> cards = cardRepository.CustomCardFindByKeyword(roleCategory);

        return null;
    }
}
