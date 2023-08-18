package com.project.wakathon.Gatwork.BackEnd.Member.response;

import lombok.Builder;
import lombok.Data;

@Data
public class CardResponseDto {
    private long id;
    private int viewCount;
    private String major;
    private int score;
    private int studentId;
    private String introduce;
    private String profileImg;


    // Entity to Dto
    @Builder
    public CardResponseDto(int viewCount, String major, int score, int studentId, String introduce, String profileImg) {
        this.viewCount = viewCount;
        this.major = major;
        this.score = score;
        this.studentId = studentId;
        this.introduce = introduce;
        this.profileImg = profileImg;
    }


}
