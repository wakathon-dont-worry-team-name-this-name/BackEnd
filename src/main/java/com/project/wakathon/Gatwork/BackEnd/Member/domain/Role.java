package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
@NoArgsConstructor
@Getter
public class Role {

    public Role(RoleCategory roleCategory) {
        this.roleCategory = roleCategory;
    }

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "role")
    List<MemberTag> memberTagList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    RoleCategory roleCategory;
}
