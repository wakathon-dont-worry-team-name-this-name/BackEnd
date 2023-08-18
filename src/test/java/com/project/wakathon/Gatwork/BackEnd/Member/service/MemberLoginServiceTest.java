package com.project.wakathon.Gatwork.BackEnd.Member.service;

import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MemberLoginServiceTest {

    @Autowired
    MemberLoginService memberLoginService;

    @Test
    @DisplayName("member 회원가입 테스트")
    public void test1() {
        MemberDto memberDto = new MemberDto();
        memberDto.setMemberName("wow");
        memberDto.setMemberPwd("1234");
        memberDto.setNickName("nice");
        memberDto.setRoles(List.of("백엔드", "프론트엔드"));
        memberDto.setInterests(List.of("공모전", "대외활동"));
        memberDto.setStudentId("1234");
        memberDto.setProfileImg("wow");
        memberDto.setMajor("good");
        memberDto.setIntroduce("me");
        memberDto.setContact("good");
        memberDto.setKakao("wow");

        memberLoginService.signUp(memberDto);
    }
}