package com.kh.spring.member.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor //매개변수 없는 생성자
@AllArgsConstructor //매개변수가 모두인 생성자
@ToString
@EqualsAndHashCode
//lombok은 카멜케이스쓸때 맨앞이 반드시 2자리 이상이어야 에러가 발생하지않는다.
public class Member {
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private String gender;
	private String age;
	private String phone;
	private String address;
	private Date enrollDate;
	private Date modifyDate;
	private String status;
}