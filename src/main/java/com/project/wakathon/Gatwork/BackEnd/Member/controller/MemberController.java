package com.project.wakathon.Gatwork.BackEnd.Member.controller;

import com.project.wakathon.Gatwork.BackEnd.Member.response.CardResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.TagsInUserResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 태그 정보 받기
    @GetMapping(path = "api/member/{memberId}/tags")
    public TagsInUserResponseDto getTagsInUser(@PathVariable int memberId) {
        return memberService.getTagsInUser(memberId);
    }

    // 추천을 받은 명함 리스트 보내기

    // 선택한 명함의 정보를 받기
    @GetMapping(path = "api/member/{memberId}")
    public CardResponseDto getCard(@PathVariable int memberId) {
        return memberService.getCard(memberId);
    }
}
