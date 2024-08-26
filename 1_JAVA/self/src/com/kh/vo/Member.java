package com.kh.vo;

//vo : 한명한명의 회원(db테이블의 한 행)에 대한 데이터를 저장용 객체 
public class Member {
	// 필드
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private int age;

	public Member() {
		super();
	}

	public Member(String user, String userPwd, String userName, int age) {
		super();
		//userNo는 식별자로 사용할 것이기 때문에 랜덤으로 만들어서 넣어주겠다. 나중에는 데이터베이스에서 자동으로 생성해준다.
		this.userNo = (int) (Math.random() * 9999999+ 1);
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
	}

	

	

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", user=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", age=" + age + "]";
	}

	// 생성자

	// 메소드
}
