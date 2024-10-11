package com.semi.member.model.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.semi.member.model.vo.Member;

public class MemberDao {

    public Member loginMember(SqlSession sqlSession, Member m) {
        // 로그인 관련 SQL 처리 로직 (MyBatis 매퍼 호출)
        return sqlSession.selectOne("MemberMapper.loginMember", m);
    }

    public List<Member> findMembersByName(SqlSession sqlSession, String name) {
        // 이름으로 회원 검색 SQL 처리 로직 (MyBatis 매퍼 호출)
        return sqlSession.selectList("MemberMapper.searchMembersByName", name);
    }

    public List<Member> findMembersByPhone(SqlSession sqlSession, String phone) {
        // 전화번호로 회원 검색 SQL 처리 로직 (MyBatis 매퍼 호출)
        return sqlSession.selectList("MemberMapper.searchMembersByPhone", phone);
    }
}
