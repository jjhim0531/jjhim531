package com.semi.member.service;

import org.apache.ibatis.session.SqlSession;
import com.semi.common.template.Template;
import com.semi.member.model.dao.MemberDao;
import com.semi.member.model.vo.Member;


public class MemberServiceImpl implements MemberService{

	private MemberDao mDao = new MemberDao();

	@Override
	public Member loginMember(Member m) {
//		Connection conn = getConnection();
//
//		Member loginMember = new MemberDao().loginMember(conn, m);
//		close(conn);
//		return loginMember;

		SqlSession sqlSession = Template.getSqlSession();
		Member loginUser = mDao.loginMember(sqlSession, m);

		sqlSession.close();

		return loginUser;
	}


}