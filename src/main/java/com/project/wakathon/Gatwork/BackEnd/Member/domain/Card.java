package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Card {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // 유저 매핑
    @OneToOne(fetch = FetchType.LAZY)
    private Member member;

    private int viewCount;
    private String major;
    private int score;

    @Builder
    public Card(Member member, int viewCount, String major, int score) {
        this.member = member;
        this.viewCount = viewCount;
        this.major = major;
        this.score = score;
    }

}
