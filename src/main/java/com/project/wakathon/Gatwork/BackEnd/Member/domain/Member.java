package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private int id;

    private String name;

    private int studentId;

    private String introduce;

    private String profileImg;

    private String contact;

    @Builder
    public Member(String name, int studentId, String introduce, String profileImg, String contact) {
        this.name = name;
        this.studentId = studentId;
        this.introduce = introduce;
        this.profileImg = profileImg;
        this.contact = contact;
    }
}
