package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tag")
@NoArgsConstructor
public class Tag {

    public Tag(TagCategory tagCategory) {
        this.tagCategory = tagCategory;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Enumerated(EnumType.STRING)
    TagCategory tagCategory;
}
