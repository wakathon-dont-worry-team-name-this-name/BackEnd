package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class memberInteresting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // 관심 분야 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interesting_id")
    private Interesting interesting;

    // 카드 매핑
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
