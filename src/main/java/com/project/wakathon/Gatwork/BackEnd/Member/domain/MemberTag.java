package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "member_tag")
public class MemberTag
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_tag_id")
    private int id;

    // 평가한 총점
    private int score;
    // 평가한 참가자 수
    private int scoreCnt;

    public void updateScore(int score) {
        this.score += score;
    }
    public void updateScoreCnt() {
        this.scoreCnt++;
    }

    @ManyToOne(fetch= FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "member_id")
    Member member;

    @ManyToOne(fetch= FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "role_id")
    Role role;

    public MemberTag(Member member, Role role) {
        this.member = member;
        this.role = role;
        score = 0;
        scoreCnt = 0;
    }
}
