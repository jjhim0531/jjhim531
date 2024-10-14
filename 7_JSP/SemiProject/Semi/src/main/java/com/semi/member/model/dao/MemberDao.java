package com.semi.member.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    // 이름과 전화번호로 회원 검색
    public List<Member> findMembersByNameAndPhone(SqlSession sqlSession, String name, String phone) {
        // 이름과 전화번호를 Map으로 묶어서 전달
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("name", name);
        paramMap.put("phone", phone);
        
        return sqlSession.selectList("MemberMapper.searchMembersByNameAndPhone", paramMap);
    }
}
