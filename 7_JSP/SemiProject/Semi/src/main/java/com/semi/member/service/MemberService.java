package com.semi.member.service;

import java.util.List;
import com.semi.member.model.vo.Member;

public interface MemberService {
    public abstract Member loginMember(Member m);

    // 이름으로 회원 검색
    public abstract List<Member> searchMembersByName(String name);

    // 전화번호로 회원 검색
    public abstract List<Member> searchMembersByPhone(String phone);
}
