package com.project.wakathon.Gatwork.BackEnd.Member.controller;

import com.project.wakathon.Gatwork.BackEnd.Member.Repository.RoleRepository;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.RoleCategory;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberLoginDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.CardResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.response.TagsInUserResponseDto;
import com.project.wakathon.Gatwork.BackEnd.Member.service.MemberLoginService;
import com.project.wakathon.Gatwork.BackEnd.Member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberLoginService memberLoginService;
    private final MemberService memberService;
    private final RoleRepository roleRepository;

    @PostMapping("/api/signin")
    public void signin(MemberLoginDto memberLoginDto) {
        memberLoginService.signIn(memberLoginDto);
    }

    @PostMapping("/api/signUp")
    private void signUp(MemberDto memberDto) {
        memberLoginService.signUp(memberDto);

    }

    // 태그 정보 받기
    @GetMapping(path = "api/member/{memberId}/tags")
    public TagsInUserResponseDto getTagsInUser(@PathVariable("memberId") int memberId) {
        return memberService.getTagsInUser(memberId);
    }

    // Role에 맞는 명함 리스트 보내기
    @GetMapping(path = "api/member")
    public List<CardResponseDto> getCardsByRole(@RequestParam RoleCategory roleCategory) {
        return null;
    }

    // 선택한 명함의 정보를 받기
    @GetMapping(path = "api/member/{memberId}")
    public CardResponseDto getCard(@PathVariable("memberId") int memberId) {
        return memberService.getCard(memberId);
    }
}
