package com.project.wakathon.Gatwork.BackEnd.Member.service;

import com.project.wakathon.Gatwork.BackEnd.Member.Repository.*;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.*;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberDto;
import com.project.wakathon.Gatwork.BackEnd.Member.request.MemberLoginDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class MemberLoginService {

    private final MemberRepository memberRepository;
    private final MemberTagRepository memberTagRepository;
    private final MemberInterestingRepository memberInterestingRepository;
    private final CardRepository cardRepository;

    @Transactional
    public void signIn(MemberLoginDto memberLoginDto) {
        if (memberRepository.findByMemberName(memberLoginDto.getMemberId()).isEmpty())
            throw new RuntimeException("로그인 에러");
    }

    @Transactional
    public void signUp(MemberDto memberDto) {
        // member 생성
        Member member = Member.builder()
                .memberName(memberDto.getMemberName())
                .memberPwd(memberDto.getMemberPwd())
                .contact(memberDto.getContact())
                .profileImg(memberDto.getProfileImg())
                .studentId(memberDto.getStudentId())
                .introduce(memberDto.getIntroduce())
                .nickName(memberDto.getNickName())
                .build();


        memberRepository.save(member);

        for (String role : memberDto.getRoles()) {
            // role 엔티티 생성, role와 member을 잇는 걸 추가..
            RoleCategory roleCategory;

            switch (role) {
                case "인성" -> roleCategory = RoleCategory.HUMANITY;
                case "프론트엔드" -> roleCategory = RoleCategory.FRONTEND;
                case "백엔드" -> roleCategory = RoleCategory.BACKEND;
                case "아키텍터" -> roleCategory = RoleCategory.INFRA;
                default -> throw new RuntimeException("role 에러");
            }

            Role roleEntity = new Role(roleCategory);

            MemberTag memberTag = new MemberTag(member, roleEntity);

            memberTagRepository.save(memberTag);
        }

        Card card = Card.builder()
                .member(member)
                .major(memberDto.getMajor())
                .build();
        cardRepository.save(card);

        for (String interest : memberDto.getInterests()) {

            Interesting interesting = null;

            switch (interest) {
                case "공모전" -> interesting = new Interesting(InterestingCategory.CONTEST);
                case "대외활동" -> interesting = new Interesting(InterestingCategory.CLUB);
                default -> throw new RuntimeException("활동 입력 에러");
            }

            MemberInteresting memberInteresting = new MemberInteresting(interesting, member);

            memberInterestingRepository.save(memberInteresting);
        }
    }
}
