package com.project.wakathon.Gatwork.BackEnd.Member.service;

import com.project.wakathon.Gatwork.BackEnd.Member.Repository.CardRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.MemberTagRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.Repository.TagRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Card;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Member;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;
import com.project.wakathon.Gatwork.BackEnd.Member.response.CardResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.TagsInUserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberTagRepository memberTagRepository;
    private final TagRepository tagRepository;
    private final CardRepository cardRepository;


    // Tag 리스트
    public TagsInUserResponseDto getTagsInUser(int memberId) {
        // Client Error Handling
        List<Tag> tags = memberTagRepository.CustomTagFindByMemberId(memberId);

        // todo: 유효성 검사

        return TagsInUserResponseDto.builder()
                .tagCategories((ArrayList<TagCategory>) tags.stream()
                        .map(Tag::getTagCategory)
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
    public List<CardResponseDto> getCardsByRole(TagCategory tagCategory) {
        List<Card> cards = cardRepository.CustomCardFindByKeyword(tagCategory);

        return null;
    }
}
