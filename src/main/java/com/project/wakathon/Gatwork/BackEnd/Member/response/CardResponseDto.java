package com.project.wakathon.Gatwork.BackEnd.Member.response;

import lombok.Builder;
import lombok.Data;

@Data
public class CardResponseDto {
    private int id;
    private int viewCount;
    private String major;
    private int score;
    private String studentId;
    private String introduce;
    private String profileImg;


    // Entity to Dto
    @Builder
    public CardResponseDto(int id, int viewCount, String major, int score, String studentId, String introduce, String profileImg) {
        this.id = id;
        this.viewCount = viewCount;
        this.major = major;
        this.score = score;
        this.studentId = studentId;
        this.introduce = introduce;
        this.profileImg = profileImg;
    }


}
