package com.kh.mybatis.member.service;

public interface MemberService {
	public abstract Member loginMember(Member m);
	int insertMember(Member m);
}