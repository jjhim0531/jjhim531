package test.t240704;

import java.util.Scanner;

public class T_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String ID = "myId";
		final String PWD = "myPassword12";
		String id, pwd;

		System.out.println("Id 입력 : ");
		id = sc.next();
		
	
		if (ID.equals(id)) {
			System.out.println("비밀번호 입력 : ");
			pwd = sc.next();
			
			if (PWD.equals(pwd)) {
				System.out.println("로그인성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}

	}

}
