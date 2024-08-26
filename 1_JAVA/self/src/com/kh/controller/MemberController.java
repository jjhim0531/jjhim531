package com.kh.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.vo.Member;

//Controller: view를 통해서 사용자가 요청한 기능에 대해 처리하는 담당
//				해당 메소드로 전달된 데이터[가공처리 후]  -> 그 결과를 다시 view로 전달해준다.
public class MemberController {
//Memebber에 관한 기능을 제공한다.
	private List<Member> memberList = new ArrayList<>();// Member를 저장할 수 있는 list생성
	private Member loginMember;

	public boolean insertMember(Member m) {
		return memberList.add(m);

	}

	// 전달받은 id와 pwd로 회원을 검색해서 있다면 반환, 없다면 null반환
	public Member loginMember(String id, String pwd) {
		// 컬렉션이라서 null체크할 필요가 없음
		for (Member m : memberList) {
			if (m.getUserId().equals(id) && m.getUserPwd().equals(pwd)) {
				this.loginMember = m;//로그인된 멤버들 저장해주는 객체
				return m;
			}
		}
		return null;
	}

}
