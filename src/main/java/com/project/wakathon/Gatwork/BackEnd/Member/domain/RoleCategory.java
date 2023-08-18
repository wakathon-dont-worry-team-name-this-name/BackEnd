package com.project.wakathon.Gatwork.BackEnd.Member.domain;

import lombok.Getter;

@Getter
public enum RoleCategory {

    HUMANITY("인성"), BACKEND("백엔드"), FRONTEND("프론트엔트"), INFRA("아키텍터");

    private final String category;

    RoleCategory(String category) {
        this.category = category;
    }
}
