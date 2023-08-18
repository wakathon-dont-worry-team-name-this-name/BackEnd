package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tag")
@NoArgsConstructor
@Getter
public class Tag {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    private TagCategory tagCategory;

    @Builder
    public Tag(TagCategory tagCategory) {
        this.tagCategory = tagCategory;
    }
}
