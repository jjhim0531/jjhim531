package text.t240705;

import java.util.Scanner;

public class T_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("주민번호를 입력하세요 : ");
		String num = sc.next();

		if ((num.charAt(7) == '2') || (num.charAt(7) == '4')) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}

//		char gender = num.charAt(7);
//
//		switch (gender) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자");
//			break;
//		default:
//			System.out.println("잘못 입력하셨습니다.");
//
//		}

	}

}
