package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import lombok.Getter;

@Getter
public enum TagCategory {

    HUMANITY("인성"), BACKEND("백엔드 엔지니어"), FRONTEND("프론트 엔지니어"), INFRA("아키택터"), DB("데이터 엔지니어");

    private final String category;

    TagCategory(String category) {
        this.category = category;
    }
}
