package com.project.wakathon.Gatwork.BackEnd.Member.controller;

import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberLoginDto;
import com.project.wakathon.Gatwork.BackEnd.Member.service.MemberLoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    }
}
