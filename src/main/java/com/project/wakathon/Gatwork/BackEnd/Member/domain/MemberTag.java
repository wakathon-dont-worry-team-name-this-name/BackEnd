package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "member_tag")
public class MemberTag
{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_tag_id")
    private int id;

    private int score;

    public void updateScore(int score) {
        this.score = score;
    }

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "member_id")
    Member member;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    Tag tag;
}
