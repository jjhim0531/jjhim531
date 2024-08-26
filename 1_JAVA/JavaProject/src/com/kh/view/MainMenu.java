package com.kh.view;

import java.util.Scanner;

import com.kh.controller.BookController;
import com.kh.controller.MemberController;
import com.kh.controller.RentController;
import com.kh.vo.Member;

// View : 사용자가 보게될 시각인 요소(화면) 출력및 입력
public class MainMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	private BookController bc = new BookController();
	private RentController rc = new RentController();

	/**
	 * 메인화면 : 가장 처음나타나는 화면으로 다양한 메뉴로 진입할 수 있다.
	 */
	public void menu() {

		while (true) {
			System.out.println("===============도서관리프로그램=================");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 아이디찾기");
			System.out.println("4. 비밀번호찾기");
			System.out.println("5. 회원탈퇴");

			System.out.println("9. 프로그램종료");
			System.out.print("메뉴 입력 : ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				// 로그인 화면
				loginMember();
				break;
			case 2:
				// 회원가입 화면
				insertMember();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				deleteMember();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하였습니다. 다시입력해주세요");
			}
		}
	}

	/**
	 * 회원가입 화면 : 사용자에게 회원가입에 필요한 정보를 입력받아 controller로 전달
	 */
	public void insertMember() {
		System.out.println("==================회원가입=====================");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();

		System.out.print("이름 입력 : ");
		String name = sc.nextLine();

		System.out.print("주소 입력 : ");
		String address = sc.next();
		sc.nextLine();

		// 회원추가
		Member m = new Member(id, pwd, name, address);
		if (mc.insertMember(m)) {
			System.out.println("회원가입에 성공하였습니다.");
		} else {
			System.out.println("회원가입에 실패하였습니다.");
		}

	}

	/**
	 * 로그인 화면 : 사용자에게 id, pwd받아서 controller로 전달하여 로그인처리
	 */
	public void loginMember() {
		System.out.println("================== 로그인 =====================");
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();

		System.out.print("비밀번호 입력 : ");
		String pwd = sc.nextLine();

		// 로그인체크
		Member loginMember = mc.loginMember(id, pwd);
		if (loginMember == null) {
			System.out.println("로그인에 실패하였습니다. id, pwd를 다시 확인하세요.");
		} else {
			System.out.println("로그인에 성공하였습니다.");
			System.out.println(loginMember.getUserName() + "님 반갑습니다.");

			new LibraryMenu(loginMember, bc, sc, rc).menu();
		}
	}

	public void deleteMember() {
		System.out.println("==================회원탈퇴==================");
		System.out.print("아이디를 입력해주세요: ");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력해주세요: ");
		String pwd = sc.nextLine();

		 if (mc.deleteMember(id, pwd)) {
	            System.out.println("회원 탈퇴가 완료되었습니다.");
	            
	        } else {
	            System.out.println("비밀번호가 일치하지 않습니다. 탈퇴에 실패하였습니다.");
	        }
	}
}
