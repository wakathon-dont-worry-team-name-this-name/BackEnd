package com.project.wakathon.Gatwork.BackEnd.Member.response;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;

@Getter
@Data
public class TagsInUserResponseDto {
    private ArrayList<TagCategory> tagCategories;

    @Builder
    public TagsInUserResponseDto(ArrayList<TagCategory> tagCategories) {
        this.tagCategories = tagCategories;
    }
}
