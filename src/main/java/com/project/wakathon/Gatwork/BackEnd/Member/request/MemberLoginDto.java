package com.project.wakathon.Gatwork.BackEnd.Member.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberLoginDto {

    private String memberId;
    private String pwd;
}
