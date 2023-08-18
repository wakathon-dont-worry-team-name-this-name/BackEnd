package com.project.wakathon.Gatwork.BackEnd.Member.response;

import lombok.Getter;
import lombok.Setter;

// 회원 상세보기 Dto

@Getter
@Setter
public class MemberDetailDto {

    // 프로필 이미지
    private String profileImg;
    // 학번
    private int studentId;
    // 관심분야
    private String interest;
    // PR 주소
    private String introduce;
    // kakao 연락
    private String contact;
}
