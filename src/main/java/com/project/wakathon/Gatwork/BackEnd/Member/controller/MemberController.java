package com.project.wakathon.Gatwork.BackEnd.Member.controller;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;
import com.project.wakathon.Gatwork.BackEnd.Member.response.CardResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.TagsInUserResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    final private MemberLoginService memberLoginService;

    @PostMapping("/api/signin")
    public void signin(MemberLoginDto memberLoginDto) {
        memberLoginService.signIn(memberLoginDto);
    }

    @PostMapping("/api/signUp")
    private void signUp(MemberDto memberDto) {
        memberLoginService.signUp(memberDto);
    private final MemberService memberService;

    // 태그 정보 받기
    @GetMapping(path = "api/member/{memberId}/tags")
    public TagsInUserResponseDto getTagsInUser(@PathVariable("memberId") int memberId) {
        return memberService.getTagsInUser(memberId);
    }

    // Role에 맞는 명함 리스트 보내기
    @GetMapping(path = "api/member")
    public List<CardResponseDto> getCardsByRole(@RequestParam TagCategory tagCategory) {
        return memberService.getCardsByRole(tagCategory);
    }

    // 선택한 명함의 정보를 받기
    @GetMapping(path = "api/member/{memberId}")
    public CardResponseDto getCard(@PathVariable("memberId") int memberId) {
        return memberService.getCard(memberId);
    }
}
