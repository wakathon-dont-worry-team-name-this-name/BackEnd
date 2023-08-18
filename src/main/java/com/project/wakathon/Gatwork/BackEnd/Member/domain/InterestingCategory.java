package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import lombok.Getter;

@Getter
public enum InterestingCategory {
    ENGINEERING("엔지니어"),
    MARKETING("마케팅"),
    CONTEST("공모전"),
    CLUB("대외활동");

    private final String category;

    InterestingCategory(String category) {
        this.category = category;
    }
}
