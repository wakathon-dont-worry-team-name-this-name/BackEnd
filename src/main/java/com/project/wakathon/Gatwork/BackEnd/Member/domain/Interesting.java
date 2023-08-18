package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Entity
@NoArgsConstructor
public class Interesting {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "interesting_id")
    private long id;
    private InterestingCategory category;
}