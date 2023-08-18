package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class MemberInteresting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 관심 분야 매핑
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "interesting_id")
    private Interesting interesting;

    // 카드 매핑
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "member_id")
    private Member member;

    public MemberInteresting(Interesting interesting, Member member) {
        this.interesting = interesting;
        this.member = member;
    }
}
