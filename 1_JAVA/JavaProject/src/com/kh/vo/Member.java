package com.kh.vo;

//vo : 한명한명의 회원(db테이블의 한행)에 대한 데이터를 기록할 수 있는 저장용 객체
public class Member {
	//필드
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String address;
	
	//생성자
	public Member() {
		super();
	}

	public Member(String userId, String userPwd, String userName, String address) {
		super();
		//userNo는 식별자로 사용할 것이기 때문에 랜덤으로 만들어서 넣어주겠다. 나중에는 db에서 자동으로 생성해줄 것
		this.userNo = (int)(Math.random() * 9999999 + 1);
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.address = address;
	}

	//매소드
	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", address=" + address + "]";
	}
}
