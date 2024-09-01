package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
		String self = sc.nextLine();
//toUpperCase() : 소문자로 입력해도 대문자로 변환해줌.
		AuthGrade ag = AuthGrade.valueOf(self.toUpperCase());

		print(ag);

		System.out.println("==메뉴 목록==");
		if (ag.getLevel() > 0) {
			System.out.println("- 메인 화면");
		}
		if (ag.getLevel() > 1) {
			System.out.println("- 이메일 관리 화면");
		}
		if (ag.getLevel() > 2) {
			System.out.println("- 관리자 화면");
		}

	}

	private static void print(AuthGrade ag) {
		System.out.println("당신의 등급은 " + ag.getDescription() + "입니다.");

	}

}