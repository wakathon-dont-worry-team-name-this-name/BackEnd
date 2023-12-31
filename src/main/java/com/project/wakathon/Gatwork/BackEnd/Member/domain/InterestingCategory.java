package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import lombok.Getter;

@Getter
public enum InterestingCategory {

    CONTEST("공모전"),
    CLUB("대외활동");

    private final String category;

    InterestingCategory(String category) {
        this.category = category;
    }
}
