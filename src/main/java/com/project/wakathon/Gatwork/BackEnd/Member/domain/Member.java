package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private int id;

    // 로그인할 회원 아이디
    private String memberName;
    private String memberPwd;

    private String nickName;

    private String studentId;

    private String introduce;

    private String profileImg;

    private String contact;

    @OneToMany(mappedBy = "member", orphanRemoval = true)
    List<MemberTag> memberTagList = new ArrayList<>();

    @Builder
    public Member(String memberName, String memberPwd, String nickName,
                  String studentId, String introduce, String profileImg, String contact) {
        this.memberName = memberName;
        this.memberPwd = memberPwd;
        this.nickName = nickName;
        this.studentId = studentId;
        this.introduce = introduce;
        this.profileImg = profileImg;
        this.contact = contact;
    }
}
