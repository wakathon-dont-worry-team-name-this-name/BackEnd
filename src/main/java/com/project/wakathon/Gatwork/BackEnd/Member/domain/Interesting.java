package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Locale;

@Entity
@NoArgsConstructor
@Getter
public class Interesting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interesting_id")
    private int id;
    @Enumerated(EnumType.STRING)
    private InterestingCategory category;

    @OneToMany(mappedBy = "interesting")
    private List<MemberInteresting> memberInterestings;

    public Interesting(InterestingCategory category) {
        this.category = category;
    }
}
