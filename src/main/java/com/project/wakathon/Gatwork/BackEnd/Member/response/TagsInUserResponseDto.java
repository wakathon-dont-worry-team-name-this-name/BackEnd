package com.project.wakathon.Gatwork.BackEnd.Member.response;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.RoleCategory;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Data
public class TagsInUserResponseDto {
    private ArrayList<RoleCategory> roleCategories;

    @Builder
    public TagsInUserResponseDto(ArrayList<RoleCategory> roleCategories) {
        this.roleCategories = roleCategories;
    }
}
