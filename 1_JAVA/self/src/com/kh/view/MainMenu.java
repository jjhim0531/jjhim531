package com.kh.view;

import java.util.Scanner;

import com.kh.controller.MemberController;
import com.kh.vo.Member;

//view:사용자가 보게될 시각인 요소(화면) 출력 및 입력
public class MainMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	

	/**
	 * 메인 화면 : 가장 처음 나타나는 화면으로 다양한 메뉴로 진입할 수 있다.
	 */
	public void menu() {
		while (true) {
			System.out.println("===========도서 관리 프로그램============");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 아이디찾기");
			System.out.println("4. 비밀번호찾기");
			System.out.println("9. 종료");
			System.out.println("메뉴입력 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:

				break;
			case 2:
				// 회원가입 화면
				break;

			case 3:
				break;

			case 4:
				break;

			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못입력하였습니다. 다시 입력해주세요");

			}
		}

	}
	/*
	 * 회원가입 화면 : 사용자에게 회원가입에 필요한 정보를 입력받아 controller로 전달
	 */

	public void insertMember() {
		System.out.println("=========회원가입 ==========");
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pwd = sc.next();

		System.out.println("이름 입력 : ");
		String name = sc.next();

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();

		// 회원추가(기능이라서 controller로 보내줌)(정보를 각각 보내줘도되지만 , 한번에 보내주기 위해서 객체생성)
		Member m = new Member(id, pwd, name, age);
		if (mc.insertMember(m)) {
			System.out.println("회원가입에 성공");
		} else {
			System.out.println("회원가입에 실패");
		}

	}
/*
 * 로그인 화면 : 사용자에게 id,pwd 받아서 controller로 전달하여 로그인 처리
 */
	public void loginMember() {
		System.out.println("===============로그인 ================");
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pwd = sc.next();
	
		//로그인 체크
		Member loginMember = mc.loginMember(id, pwd);
		if(loginMember == null) {
			System.out.println("로그인에 실패하였습니다. id, pwd를 다ㅣ 확인하세요.");
		}else {
			System.out.println("로그인에 성공하였습니다.");
		}
	}
}
